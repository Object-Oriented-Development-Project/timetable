package one.group.models.people;
import java.util.List;
public class Group<E extends Person> {
    private String groupId;
    private String name;
    private List<E> people;

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

    public String getGroupId() {
        return groupId;
    }

    public String getName() {
        return name;
    }

    public List<E> getPeople() {
        return people;
    }

    public int size(){
        return people.size();

    }

    @Override
    public String toString(){
        return name + groupId + " ("+ people.size() + " people)";
    }
}
