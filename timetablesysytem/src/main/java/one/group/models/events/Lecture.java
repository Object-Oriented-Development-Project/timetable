package one.group.models.events;

import one.group.models.people.StudentGroup;
import one.group.models.programmes.Module;
import one.group.models.rooms.Room;
import one.group.models.people.Lecturer;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Lecture extends Event {
    /**
     * Constructor for the lecture class
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
    public Lecture(Module module, Lecturer lecturer, Room room, StudentGroup group, DayOfWeek day, LocalTime startTime, LocalTime endTime){

        super("Event",module, lecturer, room, group, "Lecture", day, startTime, endTime);

        if(!room.isClassroom()){
            throw new IllegalArgumentException("Lecture must be scheduled in a classroom");

        }

        if(group.size() > room.getCapacity()){
            throw new IllegalArgumentException("Group size exceeds room capcity for this lecture.");
        }
    }
}
