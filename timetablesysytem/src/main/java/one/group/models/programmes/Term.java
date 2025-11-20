package one.group.models.programmes;

import java.util.ArrayList;

import one.group.models.interfaces.GetTimetable;

/** Class representing a term, a term is the basis for a timetable. */
public class Term implements  GetTimetable{
    /** The list of days for this term. */
    private ArrayList<String> table;

    public ArrayList getTimetable(){
    throw new UnsupportedOperationException("Not implemented yet");    
    }
}
