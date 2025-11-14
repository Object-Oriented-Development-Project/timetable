package one.group.models.programmes;

import java.util.List;

import one.group.models.events.Event;


/**Class representing a day. */
public class Day {

    private List<Event> events;
    private String day;
    
    /**
     * Returns the day of the week.
     * @return day
     */
    public String getDay(){
        return day;
    }

    /**
     * Returns a copy of the list of events for the day.
     * @return copyOf(events)
     */
    public List<Event> getEvents(){
        return List.copyOf(events);
    }

    /**
     * Returns the List of events for the day.
     * @return events
     */
    public List<Event> getEventsToEdit(){
        return events;
    }

    
}
