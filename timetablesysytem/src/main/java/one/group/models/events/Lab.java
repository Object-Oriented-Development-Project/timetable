package one.group.models.events;

/** Class to represent a lab. */
public class Lab extends Event {

    /** Constructor for Lab the same as the parent class. 
     * @param module the module id
     * @param startTime the start time
     * @param endTime the end time
     * @param lecturer the lecturer id
     * @param room the room
     * @param day the day
     */
    public Lab(String module, String startTime, String endTime, String lecturer, String room, String day){
        super(module, startTime, endTime, lecturer, room, day);
    }
}