package one.group.models.people;

import java.util.ArrayList;
import java.util.List;

/** The class to represent a group of students. */
public class StudentGroup extends Group {

    public StudentGroup(String groupId, String name, List people) {
        super(groupId, name, people);
    }

    private ArrayList<String[]> table;

    public ArrayList getTable(){
    throw new UnsupportedOperationException("Not implemented yet");
    }
}
