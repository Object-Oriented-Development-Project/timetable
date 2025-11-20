package one.group.models.rooms;
import java.util.ArrayList;

public abstract class Room {

    private String id;
    private int capacity;
    private ArrayList<String> table;

    public Room(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
