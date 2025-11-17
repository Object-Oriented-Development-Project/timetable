package one.group.models.programmes;

import java.util.List;

import one.group.models.people.Lecturer;
import one.group.models.people.Student;
import one.group.models.user_timetable.Timetable;

/** Class representing a course. */
public class ProgramStructure {
    /** The id of the course. */
    private String id;
    /** The name of the course. */
    private String courseName;
    /** The list of modules for the course. */
    private List<Module> modules;
    /** The list of lecturers associated with the course. */
    private List<Lecturer> lecturers;
    /** The list of students associated with the course. */
    private List<Student> students;
    /** A list containing all of the year objects for the course. */
    private List<Year> years;
    /** The timetable for the course. */
    private Timetable timetable;

    /**
    * Gets the course ID.
    * @return id the course id
    */
    public String getID(){
        return id;
    }

    /**
    * Sets the course ID.
    * @param newID the new course id
    */
    public void setID(String newID){
        id = newID;
    }

    /**
    * Gets the course name.
    * @return courseName the course name
    */
    public String getCourseName(){
        return courseName;
    }

    /**
    * Sets the course name.
    * @param newName the new course name
    */
    public void setCourseName(String newName){
        courseName = newName;
    }

    /**
    * Returns a copy of modules.
    * @return modules a copy of modules
    */
    public List<Module> getModules(){
        return List.copyOf(modules);
    }

    /**
    * Returns the reference to modules.
    * @return modules the list of modules
    */
    public List<Module> getModulesEdit(){
        return modules;
    }

    /**
    * Returns a copy of lecturers.
    * @return lecturers a copy of lecturers
    */
    public List<Lecturer> getLecturers(){
        return List.copyOf(lecturers);
    }

    /**
    * Returns the reference to lecturers.
    * @return lecturers the list of lecturers
    */
    public List<Lecturer> getLecturersEdit(){
        return lecturers;
    }

    /**
    * Returns a copy of students.
    * @return students a copy of students
    */
    public List<Student> getStudents(){
        return List.copyOf(students);
    }

    /**
    * Returns the reference to students.
    * @return students the list of students
    */
    public List<Student> getStudentsEdit(){
        return students;
    }

    /**
    * Returns a copy of years.
    * @return years a copy of years
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
     * Returns the timetable.
     * @return  timetable the timetable
     */
    public Timetable getTimetable(){
        return timetable;
    }
}