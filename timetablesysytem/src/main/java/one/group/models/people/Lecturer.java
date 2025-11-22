package one.group.models.people;

import java.util.ArrayList;

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

    public ArrayList getTable(){
    throw new UnsupportedOperationException("Not implemented yet");
    }

    public void printTable(ArrayList<String[]> tableToPrint){
    for(String[] row: tableToPrint){
        for(int i = 0;i < row.length;i++){
            System.out.printf(" %s | ", row[i]);
            }
        System.out.printf("\n------\n");
        }
    }
}