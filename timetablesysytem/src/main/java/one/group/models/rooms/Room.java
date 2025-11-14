package one.group.models.rooms;

public abstract class Room {

    private String id;
    private int capacity;

    public Room(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
