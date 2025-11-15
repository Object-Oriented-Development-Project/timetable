package one.group.models.user_timetable;

import java.util.List;

import one.group.models.programmes.Day;
/**A class representing a timetable, used by all classes who can own a timetable. */
public class Timetable {
    private List<Day> timetable;
    private String id;
    
    /** Constructs the timetable and gives it the id of the owner of the timetable.
     * @param id
     */
    public Timetable(String id){
        this.id = id;
    }

    /**
     * Returns a copy of a timetable.
     * @return timetable
     */
    public List<Day> getTimetableToEdit(){
        return timetable;
    }

    /**
     * Returns a copy of a timetable.
     * @return copyOf(timetable)
     */
    public List<Day> getTimetable(){
        return List.copyOf(timetable);
    }

    /**
     * Returns the timetables id, which is the id of the entity with whcih it is asscoiated.
     * @return id
     */
    public String getID(){
        return id;
    }
}