package one.group.models.rooms;

/**
*Represents a Labratory room
*/
public class Labroom extends Room {

    /**
    *Creates a new labroom with the specified identifier and capacity.
    *
    *@param ID          the unique identifier for the lab room
    *@param capacity the maximum number of people the lab room can hold
    */
    public Labroom(String id, int capacity){
        super(id, capacity);
    }
}
