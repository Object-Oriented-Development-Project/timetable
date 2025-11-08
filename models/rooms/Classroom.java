package timetable.models.rooms;

public class Classroom extends Room {
    /**Type of room. */
    private String typeOfRoom = "classroom";

    /**Creates Classroom object using String id and int capacity. */
    public Classroom(String id, int capacity){
        super(id, capacity);
    }
}
