package timetable.models.rooms;

public class Labroom extends Room {
    
    private String typeOfRoom = "labroom";

    public Labroom(String id, int capacity){
        super(id, capacity);
    }
}
