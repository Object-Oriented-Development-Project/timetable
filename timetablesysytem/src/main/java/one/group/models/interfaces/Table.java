package one.group.models.interfaces;

import java.util.ArrayList;
/** Interface formalising the logic for interacting with tables across unrelated classes. */
public interface Table {

    /** Timetable field, an ArrayList of 1D String arrays.
     */
    public ArrayList<String[]> timetable = new ArrayList<>();
    
    /** Method to retrieve a table. 
    *@return the table
    */
    public ArrayList<String[]> getTable();
    
    /** Method to generate a timetable for an entity from the CSV files, creates an ArrayList of String arrays. */
    public void queryTable();

    /**
     * Method to set an entities table as the parameter.
     * @param newArrayList the new table
     */
    public void setTable(ArrayList<String[]> newArrayList);
    
    /**
     * Method to print a table.
     * @param tableToPrint the table to be printed
     */
    public void printTable(ArrayList<String[]> tableToPrint);

    /** Method to access a table from a parent class. 
    * @return the table
    */
    public ArrayList<String[]> accessTable();
}