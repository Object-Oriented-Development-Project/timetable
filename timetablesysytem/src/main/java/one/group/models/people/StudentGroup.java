package one.group.models.people;
import java.util.List;
public class StudentGroup {
    private String groupId;
    private String name;
    private List<Student> students;

    public StudentGroup(String groupId, String name, List<Student> students){
        this.groupId=groupId;
        this.name = name;
        this.students = students;
    }
    
    public String getGroupId() {
        return groupId;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int size(){
        return students.size();

    }

    @Override
    public String toString(){
        return name + " ("+ students.size() + " students)";
    }
}
