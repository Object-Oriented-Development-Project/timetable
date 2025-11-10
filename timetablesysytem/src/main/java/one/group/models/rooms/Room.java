package one.group.models.rooms;

public abstract class Room {

    private String id;
    private String type = "room";
    private int capacity;

    public Room(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }
}
