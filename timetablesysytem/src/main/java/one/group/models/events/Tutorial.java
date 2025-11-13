package one.group.models.events;

import java.time.DayOfWeek;
import java.time.LocalTime;

import one.group.models.people.Group;
import one.group.models.people.Lecturer;
import one.group.models.programmes.Module;
import one.group.models.rooms.Room;

public class Tutorial extends Event {
    /**
     * Constructor for tutorial class
     * @throws IllegalArgumentException if lecture not scheduled in a classroom
     * @throws IllegalArgumentException if the group size exceeds the room capacity
     * @param module
     * @param lecturer
     * @param room
     * @param group
     * @param day
     * @param startTime
     * @param endTime
     */
    public Tutorial(Module module, Lecturer lecturer, Room room, Group group, DayOfWeek day, LocalTime startTime, LocalTime endTime){
        super("Event", module, lecturer, room, group, "Tutorial", day, startTime, endTime);


       if(!room.isClassroom()){
           throw new IllegalArgumentException("Tutorial must be scheduled in a classroom");

       }

       if(group.size() > room.getCapacity()){
           throw new IllegalArgumentException("Group size exceeds room capacity for this tutorial.");
       }
    }
}
