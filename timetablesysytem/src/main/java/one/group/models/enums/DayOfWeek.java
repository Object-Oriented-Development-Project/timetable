package one.group.models.enums;

/** Simple enum for representing the days of the week across classes, includes a field for 
 * whether or not it is a weekend.
 */
public enum DayOfWeek {
    
    MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false), FRIDAY(false),
    SATURDAY(true), SUNDAY(true);

    /** A truth value for whether or not a day is a weekend. */
    private final boolean isWeekend;
    
    /** A  constructor with the enums fields.*/
    private DayOfWeek(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    /** A method to retrieve the isWeekend value. */
    public boolean isWeekend(){
        return isWeekend;
    }
}
