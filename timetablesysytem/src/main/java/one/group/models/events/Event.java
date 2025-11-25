package one.group.models.events;
/** Abstract class to represesnt and event */
public abstract class Event {

    /**String representing the module ID */
    private String module;
    /**String representing the start time */
    private String startTime;
    /**String representing the end time */
    private String endTime;
    /**String representing the lecturer's id */
    private String lecturer;
    /**String representing the room */
    private String room;
    /**String representing the day */
    private String day;

    /**
     * Constructor for Event
     * @param module the module id
     * @param startTime the start time
     * @param endTime the end time
     * @param lecturer the lecturer id
     * @param room the room
     * @param day the day
     */
    public Event(String module, String startTime, String endTime, String lecturer, String room, String day){
        this.module = module;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lecturer = lecturer;
        this.room = room;
        this.day = day;
    }

    /**
     * Returns the module for the event
     * @return module
     */
    public String getModule(){
        return module;
    }

    /**
     * Returns the lecturer for the event
     * @return lecturer
     */
    public String getLecturer(){
        return lecturer;
    }

    /**
     * Returns the room for the event
     * @return room
     */
    public String getRoom() {
        return room;
    }

    /**
     * Returns the day of the week the event is on
     * @return day
     */
    public String getDay(){
        return day;
    }

    /**
     * Returns start time of event
     * @return startTime
     */
    public String getStartTime(){
        return startTime;
    }

    /**
     * Returns the end time of the event
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }
}