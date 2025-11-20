package one.group.models.rooms;
import java.util.ArrayList;

import one.group.models.interfaces.GetID;
import one.group.models.interfaces.GetTimetable;

public abstract class Room implements GetID, GetTimetable{

    private String roomID;
    private int capacity;
    private ArrayList<String> table;

    public Room(String id, int capacity){
        this.roomID = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getID(){
        return roomID;
    }

    public ArrayList getTimetable(){
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
