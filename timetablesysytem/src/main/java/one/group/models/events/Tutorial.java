package one.group.models.events;

/** Class to represent a tutorial. */
public class Tutorial extends Event {

        /** Constructor for Tutorial the same as the parent class. 
     * @param module the module id
     * @param startTime the start time
     * @param endTime the end time
     * @param lecturer the lecturer id
     * @param room the room
     * @param day the day
     */
    public Tutorial(String module, String startTime, String endTime, String lecturer, String room, String day){
        super(module, startTime, endTime, lecturer, room, day);
    }
}