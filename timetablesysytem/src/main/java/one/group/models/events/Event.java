package one.group.models.events;
import one.group.models.people.Lecturer;
import one.group.models.people.StudentGroup;
import one.group.models.programmes.Module;

import one.group.models.rooms.Room;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

public abstract class Event {
    
    private String type = "event";
    private Module module;
    private String typeOfEvent;
    private LocalTime startTime;
    private LocalTime endTime;
    private Lecturer lecturer;
    private Room room;
    private StudentGroup group;
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
                 Room room, StudentGroup group, String typeOfEvent,
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
    public StudentGroup getGroup() {
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
}
