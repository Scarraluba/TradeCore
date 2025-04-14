package concrete.goonie;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ConstructorDeclaration;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.file.Paths;
import java.util.List;

public class ClassExplorer {

    public static void main(String[] args) {
        String basePackage = "concrete.goonie"; // replace with your base package
        String sourceRoot = "src/main/java"; // adjust path if needed

        List<Class<?>> classes = listAllClasses(basePackage);
        for (Class<?> cls : classes) {
            System.out.println(cls.getName() + " -> " + getClassType(cls));
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            if (constructors.length > 0) {
                Constructor<?> first = constructors[0];
                System.out.println("  ↳ Constructor: " + getConstructorSignature(first));

                String javadoc = getClassJavadoc(cls, sourceRoot);
                if (javadoc != null) {
                    System.out.println("     • Javadoc: " + javadoc);
                } else {
                    System.out.println("     • Javadoc: not found");
                }

            } else {
                System.out.println("  ↳ No constructors found.");
            }
            System.out.println();
        }
    }

    public static List<Class<?>> listAllClasses(String packageName) {
        try (ScanResult scanResult = new ClassGraph()
                .acceptPackages(packageName)
                .enableClassInfo()
                .scan()) {
            return scanResult.getAllClasses().loadClasses();
        }
    }

    private static String getClassType(Class<?> cls) {
        if (cls.isInterface()) return "Interface";
        if (cls.isEnum()) return "Enum";
        if (Modifier.isAbstract(cls.getModifiers())) return "Abstract Class";
        return "Concrete Class";
    }

    private static String getConstructorSignature(Constructor<?> constructor) {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        Class<?>[] params = constructor.getParameterTypes();
        for (int i = 0; i < params.length; i++) {
            builder.append(params[i].getSimpleName());
            if (i < params.length - 1) builder.append(", ");
        }
        builder.append(")");
        return builder.toString();
    }

    /**
     * Tries to read the Javadoc of the first constructor from the .java source file
     */
    private static String getConstructorJavadoc(Class<?> cls, String sourceRoot) {
        try {
            String packagePath = cls.getPackage().getName().replace('.', File.separatorChar);
            String className = cls.getSimpleName();
            File sourceFile = Paths.get(sourceRoot, packagePath, className + ".java").toFile();
            if (!sourceFile.exists()) return null;

            JavaParser parser = new JavaParser();
            CompilationUnit cu = parser.parse(new FileInputStream(sourceFile))
                    .getResult()
                    .orElse(null);
            if (cu == null) return null;

            return cu.getClassByName(className)
                    .flatMap(c -> c.getConstructors().stream().findFirst())
                    .flatMap(ConstructorDeclaration::getJavadoc)
                    .map(javadoc -> javadoc.getDescription().toText())
                    .orElse(null);

        } catch (Exception e) {
            return null;
        }
    }
    private static String getClassJavadoc(Class<?> cls, String sourceRoot) {
        try {
            String packagePath = cls.getPackage().getName().replace('.', File.separatorChar);
            String className = cls.getSimpleName();
            File sourceFile = Paths.get(sourceRoot, packagePath, className + ".java").toFile();
            if (!sourceFile.exists()) return null;

            JavaParser parser = new JavaParser();
            CompilationUnit cu = parser.parse(new FileInputStream(sourceFile))
                    .getResult()
                    .orElse(null);
            if (cu == null) return null;

            return cu.getClassByName(className)
                    .flatMap(c -> c.getJavadoc())
                    .map(javadoc -> javadoc.getDescription().toText())
                    .orElse(null);

        } catch (Exception e) {
            return null;
        }
    }

}
