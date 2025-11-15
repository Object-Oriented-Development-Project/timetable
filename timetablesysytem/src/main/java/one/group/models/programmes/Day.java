package one.group.models.programmes;

import java.util.List;

import one.group.models.events.Event;


/**Class representing a day. */
public class Day {

    /** A list of events */
    private List<Event> events;
    /** The day of the week */
    private String day;
    
    /**
     * Returns the day of the week.
     * @return day the day of the week
     */
    public String getDay(){
        return day;
    }

    /**
     * Returns a copy of the list of events for the day.
     * @return copyOf(events) a copy of the list of events for the day
     */
    public List<Event> getEvents(){
        return List.copyOf(events);
    }

    /**
     * Returns the List of events for the day.
     * @return events the list of events for the day
     */
    public List<Event> getEventsToEdit(){
        return events;
    }

    
}
