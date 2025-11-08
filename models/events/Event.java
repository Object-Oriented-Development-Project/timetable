package timetable.models.events;
import java.time.LocalTime;

public abstract class Event {
    
    private String type = "event";
    private String typeOfEvent;
    private LocalTime startTime;
    private LocalTime endTime; 

}
