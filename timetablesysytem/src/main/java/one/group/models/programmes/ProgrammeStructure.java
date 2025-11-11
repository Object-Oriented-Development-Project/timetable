package one.group.models.programmes;
import java.util.ArrayList;
import java.util.List;

import one.group.models.people.Lecturer;
import one.group.models.people.Student;
import one.group.models.people.StudentGroup;

/**
* Represents a course.
*/
public class ProgrammeStructure {
    String courseID;
    String courseName;
    List<Module> modules;
    List<Lecturer> lecturers;
    List<Student> students;
    List<Year> years;
    private List<StudentGroup> groups = new ArrayList<>();
    //List<Timetable> timetables;

    /**
     * Gets list of student groups
     * @return groups
     */
    public List<StudentGroup> getGroups() {
        return List.copyOf(groups);
    }

    /**
     * Splits the list of students into subgroups based on the specified maximum group size
     *
     * @param maxGroupSize the maximum number of students allowed in each subgroup
     * @throws IllegalArgumentException if maxGroupSize is less than 1 or there are no students
     */
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

    /**
    * Gets the course ID.
    * @return courseID
    */
    public String getID(){
        return courseID;
    }

    /**
    * Sets the course ID.
    * @set courseID
    */
    public void setID(String newID){
        courseID = newID;
    }

    /**
    * Gets the course name.
    * @return courseName
    */
    public String getCourseName(){
        return courseName;
    }

    /**
    * Sets the course name.
    * @set courseName
    */
    public void setCourseName(String newName){
        courseName = newName;
    }

    /**
    * Returns a copy of modules.
    * @Returns a copy of modules
    */
    public List<Module> getModules(){
        return List.copyOf(modules);
    }

    /**
    * Returns the reference to modules.
    * @Returns modules
    */
    public List<Module> getModulesEdit(){
        return modules;
    }

    /**
    * Returns a copy of lecturers.
    * @Returns a copy of lecturers
    */
    public List<Lecturer> getLecturers(){
        return List.copyOf(lecturers);
    }

    /**
    * Returns the reference to lecturers.
    * @Returns lecturers
    */
    public List<Lecturer> getLecturersEdit(){
        return lecturers;
    }

    /**
    * Returns a copy of students.
    * @Returns a copy of students
    */
    public List<Student> getStudents(){
        return List.copyOf(students);
    }

    /**
    * Returns the reference to students.
    * @Returns students
    */
    public List<Student> getStudentsEdit(){
        return students;
    }

    /**
    * Returns a copy of years.
    * @Returns a copy of years
    */
    public List<Year> getYears(){
        return List.copyOf(years);
    }

    /**
    * Returns the reference to years.
    * @Returns years
    */
    public List<Year> getYearsEdit(){
        return years;
    }
}