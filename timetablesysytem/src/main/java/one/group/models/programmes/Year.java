package one.group.models.programmes;

import java.util.List;

import one.group.models.user_timetable.Timetable;

/** Class representing a year. */
public class Year {
    /** The timtable for the year. */
    private Timetable timetable;
    /** The number representing what year in a course the object represents. */
    private int year;
    /** The list of terms for this year. */
    private List<Term> terms;
}
