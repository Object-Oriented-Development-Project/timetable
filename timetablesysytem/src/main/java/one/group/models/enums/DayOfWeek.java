package one.group.models.enums;

/**
 * Enum representing the days of the week across classes,
 */
public enum DayOfWeek {

    /** Monday, not a weekend */
    MONDAY(false, "MON"),
    /** Tuesday, not a weekend */
    TUESDAY(false, "TUE"),
    /** Wednesday, not a weekend */
    WEDNESDAY(false, "WED"),
    /** Thursday, not a weekend */
    THURSDAY(false, "THU"),
    /** Friday, not a weekend */
    FRIDAY(false, "FRI"),
    /** Saturday, weekend */
    SATURDAY(true, "SAT"),
    /** Sunday, weekend */
    SUNDAY(true, "SUN");

    /** A truth value for whether or not a day is a weekend. */
    private final boolean isWeekend;
    private String tableFormat;
    
    /**
     * Constructs the enum with its weekend flag.
     * @param isWeekend whether the day is a weekend
     */
    private DayOfWeek(boolean isWeekend, String tableFormat) {
        this.isWeekend = isWeekend;
        this.tableFormat = tableFormat;
    }

    /**
     * Retrieves whether the day is a weekend.
     * @return true if the day is a weekend
     */
    public boolean isWeekend() {
        return isWeekend;
    }
    
    /**
     * Method to return format for this day used in tables.
     * @return tableFormat the String as it appears for this day in tables
     */
    public String getTableFormat(){
        return tableFormat;
    }
}
