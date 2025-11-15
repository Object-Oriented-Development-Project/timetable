package one.group.models.enums;

public enum DayOfWeek {
    
    MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false), FRIDAY(false),
    SATURDAY(true), SUNDAY(true);

    private final boolean isWeekend;

    private DayOfWeek(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend(){
        return isWeekend;
    }
}
