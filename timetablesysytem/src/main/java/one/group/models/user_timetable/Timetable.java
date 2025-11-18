package one.group.models.user_timetable;
import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import one.group.models.programmes.Day;
/**A class representing a timetable, used by all classes who can own a timetable. */
public class Timetable {
    /** The list of days in the timetable */
    private ArrayList<String> timetable;
    /** The id of the timetable, which is that of the timetable owner */
    private String id;
    
    /** Constructs the timetable and gives it the id of the owner of the timetable.
     * @param id the timetable id
     */
    public Timetable(String id){
        this.id = id;
    }

    public Timetable(String id, String filePath) throws FileNotFoundException{
        this.id = id;
        this.timetable = CSVReader.readToArrayList(filePath);
    }

    /**
     * Returns a copy of a timetable.
     * @return timetable the timetable
     */
    public ArrayList<String> getTimetableToEdit(){
        return timetable;
    }

    /**
     * Returns the timetables id, which is the id of the entity with whcih it is asscoiated.
     * @return id the timetable id
     */
    public String getID(){
        return id;
    }
}