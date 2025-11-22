package one.group.models.rooms;
import java.util.ArrayList;

import one.group.models.interfaces.GetID;
import one.group.models.interfaces.Table;

public abstract class Room implements GetID, Table{

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

    public ArrayList<String[]> getTable(){
    throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setTable(ArrayList<String[]> newArrayList){
    throw new UnsupportedOperationException("Not implemented yet");
    }

    public void printTable(ArrayList<String[]> tableToPrint){
    throw new UnsupportedOperationException("Not implemented yet");
    }
}
