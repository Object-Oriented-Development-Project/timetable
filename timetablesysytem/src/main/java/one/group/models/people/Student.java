package one.group.models.people;

import java.util.ArrayList;

/** The class to represent a student. */
public class Student extends Person {
    
    private String courseID;
    private int yearOfStudy;

    /**Create Student.
     * @param name the students name
     * @param id the students id
     * @param courseID the id of the student's course
     * @param yearOfStudy the year of study of the student
     */
    public Student(String name, String id, String courseID, int yearOfStudy){
        super(name, id);
        this.courseID = courseID;
        this.yearOfStudy = yearOfStudy;
    }

    public ArrayList getTable(){
    throw new UnsupportedOperationException("Not implemented yet");
    }
}
