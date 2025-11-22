package one.group.models.programmes;
import java.util.ArrayList;
import java.util.List;

import one.group.models.interfaces.Table;
import one.group.models.term.Term;




/** Class representing a year. */
public class Year implements  Table{
    /** The timtable for the year. */
    private ArrayList<String> table;
    /** The number representing what year in a course the object represents. */
    private int year;
    /** The list of terms for this year. */
    private List<Term> terms;

    @Override
    public ArrayList<String[]> getTable(){
    throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void setTable(ArrayList<String[]> newArrayList){
    throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void printTable(ArrayList<String[]> tableToPrint){
    throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void queryTable(){
    throw new UnsupportedOperationException("Not implemented yet");
    }

    public ArrayList<String[]> accessTable(){
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
