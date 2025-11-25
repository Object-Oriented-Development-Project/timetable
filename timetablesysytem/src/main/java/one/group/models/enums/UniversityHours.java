package one.group.models.enums;
import java.util.ArrayList;
import java.util.Arrays;

public enum UniversityHours{

    UNIVERSITY_HOURS(new ArrayList<>(Arrays.asList("09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00")));

    private final ArrayList<String> hours;

    private UniversityHours(ArrayList<String> hours){
        this.hours = hours;
    }

    public UniversityHours getHours(){
        return UNIVERSITY_HOURS;
    }
}
