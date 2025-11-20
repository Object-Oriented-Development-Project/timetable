package one.group.models.programmes;
import java.util.ArrayList;
import java.util.List;

import one.group.models.interfaces.GetTimetable;




/** Class representing a year. */
public class Year implements  GetTimetable{
    /** The timtable for the year. */
    private ArrayList<String> table;
    /** The number representing what year in a course the object represents. */
    private int year;
    /** The list of terms for this year. */
    private List<Term> terms;

    public ArrayList getTimetable(){
    throw new UnsupportedOperationException("Not implemented yet");
    }
}
