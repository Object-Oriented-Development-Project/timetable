package one.group.models.rooms;
import java.util.ArrayList;

import one.group.models.interfaces.GetID;
import one.group.models.interfaces.Table;
import one.group.models.repositories.TablesRepo;
import one.group.models.term.Term;

public abstract class Room implements GetID, Table{

    private String roomID;
    private int capacity;
    private String building;
    private ArrayList<String[]> table;

    public Room(String id, int capacity, String buidling){
        this.roomID = id;
        this.capacity = capacity;
        this.building = buidling;

    }

    public int getCapacity() {
        return capacity;
    }

    public String getID(){
        return roomID;
    }

    public String getBuilding(){
        return building;
    }

    public ArrayList<String[]> accessTable(){
        return table;
    }

    public void setTable(ArrayList<String[]> newArrayList){
        table = newArrayList;
    }


    public void queryTable(){
        ArrayList<String[]> thisRoomsTimetable = new ArrayList<>();
        ArrayList<String[]> termsTimetable = TablesRepo.getTermsTable();
        for(String[] row: termsTimetable){
            if(row[4].equals(roomID)&&Integer.parseInt(row[8]) == Term.getTerm()){
                thisRoomsTimetable.add(row);
            }
        }
        setTable(thisRoomsTimetable);
    }

    public ArrayList<String[]> getTable(){
        if(accessTable() == null){
            queryTable();
        }
        return accessTable();
    }

    public void printTable(ArrayList<String[]> tableToPrint){
    for(String[] row: tableToPrint){
        for(int i = 0;i < 5;i++){
            System.out.printf(" %s | ", row[i]);
            }
        System.out.printf("\n------\n");
        }
    }
}
