package one.group.models.rooms;

public abstract class Room {

    private String id;
    private String type = "room";
    private int capacity;

    public Room(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isClassroom(){
        return type.equalsIgnoreCase("classroom");
    }
    public boolean isLab(){
        return type.equalsIgnoreCase("lab");
    }
}
