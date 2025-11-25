package one.group.models.enums;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import one.group.models.repositories.TablesRepo;

public enum UniversityHours{

    UNIVERSITY_HOURS(new ArrayList<>(Arrays.asList("09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00")));

    private final ArrayList<String> hours;

    private UniversityHours(ArrayList<String> hours){
        this.hours = hours;
    }

    public UniversityHours getHours(){
        return UNIVERSITY_HOURS;
    }

    public static ArrayList<String> getFreeHours(String day, String room){
        ArrayList<String> returnedHours;
        returnedHours = new ArrayList<> (Arrays.asList("09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00"));
        for(String[] row: TablesRepo.getTermsTable()){
            if(row[0].equals(day)&&row[4].equals(room)){
                String[] startAndEndTime = row[1].split("-");
                if(returnedHours.contains(startAndEndTime[0])){
                    LocalTime startTime = LocalTime.parse(startAndEndTime[0], DateTimeFormatter.ofPattern("HH:mm"));
                    LocalTime endTime = LocalTime.parse(startAndEndTime[1], DateTimeFormatter.ofPattern("HH:mm"));
                    if(endTime.getHour() - startTime.getHour() > 1){
                        String timeToRemove = String.format("%d:00", startTime.getHour() + 1);
                        returnedHours.remove(timeToRemove);
                    }
                    String startTimeToRemove = String.format("%d:00", startTime.getHour());
                    returnedHours.remove(startTimeToRemove);
                }
            }
        }
        return returnedHours;
    }
}