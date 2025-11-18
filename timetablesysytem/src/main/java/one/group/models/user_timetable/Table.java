package one.group.models.user_timetable;

import java.util.ArrayList;
import java.io.FileNotFoundException;

/**A class representing a table, used by all classes who can own a table. */
public class Table {
    /** The list of days in the table */
    private ArrayList<String> table;
    /** The id of the table, which is that of the table owner */
    private String id;
    
    /** Constructs the table and gives it the id of the owner of the table.
     * @param id the table id
     */
    public Table(String id){
        this.id = id;
    }

    public Table(String id, String filePath) throws FileNotFoundException{
        this.id = id;
        this.table = CSVReader.readToArrayList(filePath);
    }

    /**
     * Returns a copy of a table.
     * @return table the table
     */
    public ArrayList<String> getTableToEdit(){
        return table;
    }

    /**
     * Returns the tables id, which is the id of the entity with whcih it is asscoiated.
     * @return id the table id
     */
    public String getID(){
        return id;
    }
}

