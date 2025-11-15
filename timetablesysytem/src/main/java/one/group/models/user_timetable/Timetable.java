package one.group.models.user_timetable;

import java.util.List;

import one.group.models.programmes.Day;

public class Timetable {
    private List<Day> timetable;
    private String id;
    
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