package concrete.goonie.enums;

import java.time.Duration;

/**
 * Enum representing various timeframes for trading or charting purposes.
 * <p>
 * Each enum constant represents a different time period used in trading systems,
 * ranging from one minute to one month. The `description` provides a user-friendly
 * label for the timeframe, and the `duration` represents the actual duration of the timeframe.
 * </p>
 */
public enum ENUM_TIMEFRAME {

    /**
     * Current timeframe with no fixed duration.
     */
    PERIOD_CURRENT("Current timeframe", Duration.ZERO),

    /**
     * One minute timeframe.
     */
    PERIOD_M1("M1", Duration.ofMinutes(1)),

    /**
     * Two minutes timeframe.
     */
    PERIOD_M2("M2", Duration.ofMinutes(2)),

    /**
     * Three minutes timeframe.
     */
    PERIOD_M3("M3", Duration.ofMinutes(3)),

    /**
     * Four minutes timeframe.
     */
    PERIOD_M4("M4", Duration.ofMinutes(4)),

    /**
     * Five minutes timeframe.
     */
    PERIOD_M5("M5", Duration.ofMinutes(5)),

    /**
     * Six minutes timeframe.
     */
    PERIOD_M6("M6", Duration.ofMinutes(6)),

    /**
     * Ten minutes timeframe.
     */
    PERIOD_M10("M10", Duration.ofMinutes(10)),

    /**
     * Twelve minutes timeframe.
     */
    PERIOD_M12("M12", Duration.ofMinutes(12)),

    /**
     * Fifteen minutes timeframe.
     */
    PERIOD_M15("M15", Duration.ofMinutes(15)),

    /**
     * Twenty minutes timeframe.
     */
    PERIOD_M20("M20", Duration.ofMinutes(20)),

    /**
     * Thirty minutes timeframe.
     */
    PERIOD_M30("M30", Duration.ofMinutes(30)),

    /**
     * One hour timeframe.
     */
    PERIOD_H1("H1", Duration.ofHours(1)),

    /**
     * Two hours timeframe.
     */
    PERIOD_H2("H2", Duration.ofHours(2)),

    /**
     * Three hours timeframe.
     */
    PERIOD_H3("H3", Duration.ofHours(3)),

    /**
     * Four hours timeframe.
     */
    PERIOD_H4("H4", Duration.ofHours(4)),

    /**
     * Six hours timeframe.
     */
    PERIOD_H6("H6", Duration.ofHours(6)),

    /**
     * Eight hours timeframe.
     */
    PERIOD_H8("H8", Duration.ofHours(8)),

    /**
     * Twelve hours timeframe.
     */
    PERIOD_H12("H12", Duration.ofHours(12)),

    /**
     * One day timeframe.
     */
    PERIOD_D1("D1", Duration.ofDays(1)),

    /**
     * One week timeframe (7 days).
     */
    PERIOD_W1("W1", Duration.ofDays(7)),

    /**
     * One month timeframe (30 days).
     */
    PERIOD_MN1("MN1", Duration.ofDays(30));

    private final String description;
    private final Duration duration;

    /**
     * Constructor for the ENUM_TIMEFRAME enum.
     *
     * @param description the description of the timeframe (e.g., "M1", "H1").
     * @param duration the duration of the timeframe (e.g., 1 minute, 1 hour, etc.).
     */
    ENUM_TIMEFRAME(String description, Duration duration) {
        this.description = description;
        this.duration = duration;
    }

    /**
     * Gets the description of the timeframe.
     *
     * @return the description of the timeframe.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the duration of the timeframe.
     *
     * @return the duration of the timeframe.
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Returns the ENUM_TIMEFRAME corresponding to a given description.
     *
     * @param description the description of the timeframe (e.g., "M1", "H1").
     * @return the corresponding ENUM_TIMEFRAME, or null if no match is found.
     */
    public static ENUM_TIMEFRAME getByDescription(String description) {
        for (ENUM_TIMEFRAME timeframe : values()) {
            if (timeframe.description.equalsIgnoreCase(description)) {
                return timeframe;
            }
        }
        return null; // or throw an exception if preferred
    }

    /**
     * Returns the description of the timeframe as a string.
     *
     * @return the description of the timeframe.
     */
    @Override
    public String toString() {
        return description;
    }
}
