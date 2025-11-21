package one.group.models.people;

import java.util.ArrayList;

import one.group.models.repositories.TablesRepo;

/** The class to represent a student. */
public class Student extends Person {
    
    private String courseID;
    private int yearOfStudy;
    private String id;
    private String name;

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

    public ArrayList<String[]> getTable(){
        ArrayList<String[]> thisStudentsTimetable = new ArrayList<>();
        ArrayList<String[]> termsTimetable = TablesRepo.getTermsTable();
        String[] thisEntry;
        for(String[] row: thisStudentsTimetable){
            if(row[6] == courseID){
                thisEntry = row;
                thisStudentsTimetable.add(row);
            }
        }

        return thisStudentsTimetable;
    }
}
