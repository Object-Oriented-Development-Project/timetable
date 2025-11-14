package one.group.models.events;

import java.time.DayOfWeek;
import java.time.LocalTime;

import one.group.models.people.Group;
import one.group.models.people.Lecturer;
import one.group.models.programmes.Module;
import one.group.models.rooms.Labroom;
import one.group.models.rooms.Room;

public class Lab extends Event {
    /**
     * Constructor for lab class
     * @throws IllegalArgumentException if lab isnt scheduled in a lab room
     * @throws IllegalArgumentException if the group size exceeds the lab room capacity
     * @param module
     * @param lecturer
     * @param room
     * @param group
     * @param day
     * @param startTime
     * @param endTime
     */
    public Lab(Module module, Lecturer lecturer, Room room, Group group, DayOfWeek day, LocalTime startTime, LocalTime endTime){
        super("Event", module, lecturer, room, group, "Lab",day,startTime,endTime);

        if(!(room instanceof Labroom)) {
            throw new IllegalArgumentException("Lab must be scheduled in a lab room.");

        }

        if(group.size() > room.getCapacity()){
            throw new IllegalArgumentException("Group size exceeds lab room capacity");
        }
    }
}
