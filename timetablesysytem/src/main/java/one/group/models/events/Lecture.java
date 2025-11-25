package one.group.models.events;

/** Class to represent a lecture. */
public class Lecture extends Event {

    /** Constructor for Lecture the same as the parent class. 
     * @param module the module id
     * @param startTime the start time
     * @param endTime the end time
     * @param lecturer the lecturer id
     * @param room the room
     * @param day the day
     */
    public Lecture(String module, String startTime, String endTime, String lecturer, String room, String day){
        super(module, startTime, endTime, lecturer, room, day);
    }
}