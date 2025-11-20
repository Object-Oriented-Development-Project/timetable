package one.group.models.programmes;

import java.util.ArrayList;

import one.group.models.interfaces.GetID;
import one.group.models.people.Lecturer;
import one.group.models.people.StudentGroup;

/** Class representing a module. */
public class Module implements GetID {
    /** The id of the module. */
    private String id;
    /** The lecturer associated with the module. */
    private Lecturer lecturer;
    /** The group of students associated with the module. */
    private StudentGroup studentGroup;
    /**The timetable for the module. */
    private ArrayList<String> table;

    public String getID(){
        return id;
    }

}
