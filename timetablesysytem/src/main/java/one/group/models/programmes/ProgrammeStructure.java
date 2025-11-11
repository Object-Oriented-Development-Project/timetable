package one.group.models.programmes;
import java.util.List;

import one.group.models.people.Lecturer;
import one.group.models.people.Student;

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
    //List<Timetable> timetables;

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