/** The base abstract class to represent a group of people. */
package one.group.models.people;

import java.util.List;

public class Group<E extends Person> {
    /** The id of the group. */
    private String groupId;
    /** The name of the group. */
    private String name;
    /** A list of people, can take a person of any type. */
    private List<E> people;

    /** A constructor to create a group, takes the groupId, name and a list of people. */
    public Group(String groupId, String name, List<E> people){
        this.groupId=groupId;
        this.name = name;
        this.people = people;
    }   
        /**
     * Gets list of student groups
     * @return groups
     */
/* <-----
    public List<StudentGroup> getGroups() {
        return List.copyOf(groups);
    }
-----> */  
    /**
     * Splits the list of students into subgroups based on the specified maximum group size
     *
     * @param maxGroupSize the maximum number of students allowed in each subgroup
     * @throws IllegalArgumentException if maxGroupSize is less than 1 or there are no students
     */
/* <-----
    public void createGroupsByCapacity(int maxGroupSize){

        if(maxGroupSize<1) {
            throw new IllegalArgumentException("Maximum group size must be at least 1.");
        }

        if(students==null || students.isEmpty()){
            throw new IllegalStateException("No students available to group.");
        }

        groups.clear();
        int total = students.size();
        int index = 0;
        int groupNum = 1;

        while(index < total){
            int end = Math.min(index + maxGroupSize, total);
            List<Student> sublist = students.subList(index, end);
            groups.add(new StudentGroup(courseID + "-G" + groupNum, "Group "+groupNum, sublist));


            groupNum++;
            index = end;
        }
    }
-----> */

    /**
     * Returns the groups id.
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Returns the name of the group.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a List containing the people in the group.
     * @return people
     */
    public List<E> getPeople() {
        return people;
    }

    /**
     * Returns the size of the group.
     * @return people.size();
     */
    public int size(){
        return people.size();

    }

    /**
     * To String method returning the groups info.
     */
    @Override
    public String toString(){
        return name + groupId + " ("+ people.size() + " people)";
    }
}
