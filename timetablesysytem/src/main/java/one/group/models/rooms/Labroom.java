package one.group.models.rooms;

import java.util.ArrayList;

public class Labroom extends Room {

    public Labroom(String id, int capacity, String building){
        super(id, capacity, building);
    }

    public ArrayList<String[]> getTable(){
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void queryTable(){
    throw new UnsupportedOperationException("Not implemented yet");
    }
}
