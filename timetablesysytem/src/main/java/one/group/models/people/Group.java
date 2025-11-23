package one.group.models.people;

import java.util.ArrayList;
import java.util.List;

import one.group.models.interfaces.Table;

/** The base abstract class to represent a group of people. */
public class Group<E extends Person> implements Table {
    /** The id of the group. */
    private String groupId;
    /** The name of the group. */
    private String name;
    /** A list of people, can take a person of any type. */
    private List<E> people;

    private ArrayList<String[]> table;

    /** 
     * A constructor to create a group, takes the groupId, name and a list of people.
     * @param groupId the group's id
     * @param name the group's name
     * @param people the list of people in the group
     */
    public Group(String groupId, String name, List<E> people){
        this.groupId=groupId;
        this.name = name;
        this.people = people;
    }   
    
    /**
     * Returns the groups id.
     * @return groupId the groups name
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Returns the name of the group.
     * @return name the groups name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a List containing the people in the group.
     * @return people the list of people
     */
    public List<E> getPeople() {
        return people;
    }

    /**
     * Returns the size of the group.
     * @return people.size(); the size of the group
     */
    public int size(){
        return people.size();
    }

    /**
     * To String method returning the groups info.
     * @return the group information as a string
     */
    @Override
    public String toString(){
        return name + groupId + " ("+ people.size() + " people)";
    }

    @Override
    public ArrayList<String[]> getTable(){
    throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void setTable(ArrayList<String[]> newArrayList){
    table = newArrayList;
    }

    @Override
    public void printTable(ArrayList<String[]> tableToPrint){
        for(String[] row: tableToPrint){
            for(int i = 0;i < row.length;i++){
                System.out.printf(" %s | ", row[i]);
            }
            System.out.printf("\n------\n");
        }
    }

    @Override
    public void queryTable(){
    throw new UnsupportedOperationException("Not implemented yet");
    }
    
    @Override
    public ArrayList<String[]> accessTable(){
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
