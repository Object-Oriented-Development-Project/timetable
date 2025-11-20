package one.group.models.programmes;

import java.util.ArrayList;
import java.util.List;


/** Class representing a year. */
public class Year {
    /** The timtable for the year. */
    private ArrayList<String> table;
    /** The number representing what year in a course the object represents. */
    private int year;
    /** The list of terms for this year. */
    private List<Term> terms;
}
