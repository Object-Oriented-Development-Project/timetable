package one.group.models.interfaces;

import java.util.ArrayList;

public interface Table {

    public ArrayList<String[]> timetable = new ArrayList<>();
    
    public ArrayList<String[]> getTable();

    public void queryTable();

    public void setTable(ArrayList<String[]> newArrayList);

    public void printTable(ArrayList<String[]> tableToPrint);
}
