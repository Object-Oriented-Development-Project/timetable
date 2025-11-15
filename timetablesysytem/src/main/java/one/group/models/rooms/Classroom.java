package one.group.models.rooms;

/**
*Represents a standard classroom within the timetable system.
*A classroom is a concrete type of room with an id and capacity.
*/ 
public class Classroom extends Room {

    /**
    *Creates a classroom object using a unique room ID and capacity.
    *
    * @param id          the unique identifier for the classroom
    * @param capacity maximum number of people the classroom can hold
    */
    public Classroom(String id, int capacity){
        super(id, capacity);
    }
}
