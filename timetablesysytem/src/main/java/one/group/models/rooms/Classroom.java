package one.group.models.rooms;

import java.util.ArrayList;

import jdk.jshell.spi.ExecutionControl;

public class Classroom extends Room {

    /**Creates Classroom object using String id and int capacity. */
    public Classroom(String id, int capacity){
        super(id, capacity);
    }

    public ArrayList<String> getTable(){
        throw new (ExecutionControl.NotImplementedException);
    }
}
