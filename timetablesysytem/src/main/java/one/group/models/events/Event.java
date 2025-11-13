package one.group.models.events;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Objects;
import one.group.models.people.Group;
import one.group.models.people.Lecturer;
import one.group.models.programmes.Module;
import one.group.models.rooms.Room;

public abstract class Event {
    
    private String type = "event";
    private Module module;
    private String typeOfEvent;
    private LocalTime startTime;
    private LocalTime endTime;
    private Lecturer lecturer;
    private Room room;
    private Group group;
    private DayOfWeek day;

    /**
     * Constructor for Event
     * @param type
     * @param module
     * @param lecturer
     * @param room
     * @param group
     * @param typeOfEvent
     * @param day
     * @param startTime
     * @param endTime
     */
    public Event(String type, Module module, Lecturer lecturer,
                 Room room, Group group, String typeOfEvent,
                 DayOfWeek day, LocalTime startTime,
                 LocalTime endTime){

        this.type=type;
        this.module=module;
        this.lecturer = lecturer;
        this.room = room;
        this.day = day;
        this.group = group;
        this.typeOfEvent = typeOfEvent;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters

    /**
     * Returns the type of the event
     * @return typeOfEvent
     */
    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    /**
     * Returns the specified student group
     * @return group
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Returns the type of event
     * @return type
     */
    public String getType(){
        return type;
    }

    /**
     * Returns the module for the event
     * @return module
     */
    public Module getModule(){
        return module;
    }

    /**
     * Returns the lecturer for the event
     * @return lecturer
     */
    public Lecturer getLecturer(){
        return lecturer;
    }

    /**
     * Returns the room for the event
     * @return room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Returns the day of the week the event is on
     * @return day
     */
    public DayOfWeek getDay(){
        return day;
    }

    /**
     * Returns start time of event
     * @return startTime
     */
    public LocalTime getStartTime(){
        return startTime;
    }

    /**
     * Returns the end time of the event
     * @return endTime
     */
    public LocalTime getEndTime() {
        return endTime;
    }

    // Methods

    /**
     * Checks whether this event overlaps with another event
     * <p>
     * Two events are considered overlapping if they occur on the same day,
     * their time intervals intersect, and they share either the same lecturer, room or group.
     * </p>
     * @param other the other event to check for overlap with
     * @return {@code true} if the events overlap in time and have a conflicting lecturer, room, or group;
     *         {@code false} otherwise
     */
    public boolean overlapsWith(Event other){
        if(this.day != other.day) return false; // if days are different - no conflict

        boolean timeOverlap = this.startTime.isBefore(other.endTime) && other.startTime.isBefore(this.endTime);
        boolean lecturerConflict = this.lecturer.equals(other.lecturer);
        boolean roomConflict = this.room.equals(other.room);
        boolean groupConflict = this.group.equals(other.group);

        return timeOverlap && (lecturerConflict || roomConflict || groupConflict);

    }

    // Equality / Hashing

    /**
     * Compares this event to another object for equality
     * <p>
     *     Two events are considered equal if they have the same module, occur on the same day,
     *     start at the same time, and are in the same room.
     * </p>
     * @param obj   the reference object with which to compare.
     * @return {@code true} if the given object is an Event with the same module, day, start time and room;
     *         {@code false} otherwise
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Event)) return false;
        Event other = (Event) obj;
        return Objects.equals(module, other.module) && day == other.day && Objects.equals(startTime, other.startTime) && Objects.equals(room, other.room);
        }

    }


