package one.group.models.enums;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import one.group.models.repositories.TablesRepo;
/**
 * Enum to represent the hours in which the university schedules classes, contains methods for handling any logic regarding time and scheduling.
 */
public enum UniversityHours{

    /**
     * Constant containing all hour slots that can be scheduled in the Universities timetabling system.
     */
    UNIVERSITY_HOURS(new ArrayList<>(Arrays.asList("09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00")));

    /**
     * Constant for the array list of strings
     */
    private final ArrayList<String> hours;

    private UniversityHours(ArrayList<String> hours){
        this.hours = hours;
    }

    /**
     * Method to get the hours of operation.
     * @return the hours of operation
     */
    public UniversityHours getHours(){
        return UNIVERSITY_HOURS;
    }

    /**
     * Method to get the free bookable timeslots for a given room on a particular day.
     * @param day the day an admin wishes to book on
     * @param room the room which the admin wishes to book
     * @return the available timeslots
     */
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