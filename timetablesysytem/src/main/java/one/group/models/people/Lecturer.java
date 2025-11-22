package one.group.models.people;

import java.util.ArrayList;

import one.group.models.repositories.TablesRepo;
import one.group.models.term.Term;

/** The class to represent a lecturer. */
public class Lecturer extends Person {
    private String faculty;
    /**
     * Creates a Lecturer with the given name and id.
     * @param name the lecturer's name
     * @param id the lecturer's id
     */
    public Lecturer(String name, String id, String faculty){
        super(name, id);
        this.faculty = faculty;
    }

    public void queryTable(){
        ArrayList<String[]> thisLecturersTimetable = new ArrayList<>();
        ArrayList<String[]> termsTimetable = TablesRepo.getTermsTable();
        for(String[] row: termsTimetable){
            if(row[5].equals(getID())&&Integer.parseInt(row[8]) == Term.getTerm()){
                thisLecturersTimetable.add(row);
            }
        }
        setTable(thisLecturersTimetable);
    }

    public ArrayList<String[]> getTable(){
        if(accessTable() == null){
            queryTable();
        }
        return accessTable();
    }

    public String getFaculty(){
        return faculty;
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