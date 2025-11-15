package one.group.models.programmes;

import java.util.List;

import one.group.models.people.Lecturer;
import one.group.models.people.Student;
import one.group.models.user_timetable.Timetable;

/**
 *  Class representing a course. */
public class ProgrammeStructure {
    private String courseID;
    private String courseName;
    private List<Module> modules;
    private List<Lecturer> lecturers;
    private List<Student> students;
    private List<Year> years;
    private Timetable timetable;

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
    * @return a copy of modules
    */
    public List<Module> getModules(){
        return List.copyOf(modules);
    }

    /**
    * Returns the reference to modules.
    * @return modules
    */
    public List<Module> getModulesEdit(){
        return modules;
    }

    /**
    * Returns a copy of lecturers.
    * @return a copy of lecturers
    */
    public List<Lecturer> getLecturers(){
        return List.copyOf(lecturers);
    }

    /**
    * Returns the reference to lecturers.
    * @return lecturers
    */
    public List<Lecturer> getLecturersEdit(){
        return lecturers;
    }

    /**
    * Returns a copy of students.
    * @return a copy of students
    */
    public List<Student> getStudents(){
        return List.copyOf(students);
    }

    /**
    * Returns the reference to students.
    * @return students
    */
    public List<Student> getStudentsEdit(){
        return students;
    }

    /**
    * Returns a copy of years.
    * @return a copy of years
    */
    public List<Year> getYears(){
        return List.copyOf(years);
    }

    /**
    * Returns the reference to years.
    * @return years
    */
    public List<Year> getYearsEdit(){
        return years;
    }

    /**
     * 
     */
    public Timetable getTimetable(){
        return timetable;
    }
}