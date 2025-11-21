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
}