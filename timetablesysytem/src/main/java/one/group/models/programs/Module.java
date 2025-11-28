package one.group.models.programs;

import java.util.ArrayList;

import one.group.models.interfaces.GetID;
import one.group.models.interfaces.Table;
import one.group.models.repositories.TablesRepo;
import one.group.models.term.Term;

/** Class representing a module. */
public class Module implements GetID, Table {
    
    /** The id of the module. */
    private String id;
    /** The lecturer associated with the module. */
    private String lecturer;
    /** The course this module is a part of. */
    private String programmeStructure;
    /** The number of lecture hours for this module. */
    private String lectureHours;
    /** The number of lab hours for this module. */
    private String labHours;
    /** The number of tutorial hours for this module. */
    private String tutorialHours;
    /**The timetable for the module. */
    private ArrayList<String[]> table;

    /** Constructor for Module.
     * @param id the module id
     * @param lecturer the lecturer id
     * @param programmeStructure the course id
     * @param lectureHours the number of lecture hours
     * @param labHours the number of lab hours
     * @param tutorialHours the number of tutorial hours
     */
    public Module(String id, String lecturer, String programmeStructure, String lectureHours, String labHours, String tutorialHours){
        this.id = id;
        this.lecturer = lecturer;
        this.programmeStructure = programmeStructure;
        this.lectureHours = lectureHours;
        this.labHours = labHours;
        this.tutorialHours = tutorialHours;
    }

    /**
     * Method to return the ID of this module.
     */
    @Override
    public String getID(){
        return id;
    }

    /**
     * Method to return the lecturer for this module.
     * @return the lecturer id
     */
    public String getLecturer(){
        return lecturer;
    }

    /**
     * Method to access a module table.
     * @return the module table
     */
    public ArrayList<String[]> accessTable(){
        return table;
    }

    /**
     * Method to set a module table to the given one.
     */
    @Override
    public void setTable(ArrayList<String[]> newArrayList){
        table = newArrayList;
    }

    /** Method queryTable implemented for a module, called by getTable() if current users table is null. Sets users table to result. */
    @Override
    public void queryTable(){
        ArrayList<String[]> thisModulesTimetable = new ArrayList<>();
        ArrayList<String[]> termsTimetable = TablesRepo.getTermsTable();
        for(String[] row: termsTimetable){
            if(row[2].equals(getID())&&Integer.parseInt(row[8]) == Term.getTerm()){
                thisModulesTimetable.add(row);
            }
        }
        setTable(thisModulesTimetable);
    }

    /** Method to get the modules table. Checks if current table is null, if it is, the method calls queryTable() to make one. 
    *@return the modules timetable. 
    */
    @Override
    public ArrayList<String[]> getTable(){
        if(accessTable() == null){
            queryTable();
        }
        return accessTable();
    }

    /**
     *  Method to print the modules table.
     * @param tableToPrint the table to be printed
     */
    @Override
    public void printTable(ArrayList<String[]> tableToPrint){
    for(String[] row: tableToPrint){
        for(int i = 0;i < 5;i++){
            System.out.printf(" %s | ", row[i]);
            }
        System.out.printf("\n------\n");
        }
    }
}