package one.group.models.people;

import java.util.ArrayList;

import one.group.models.repositories.TablesRepo;
import one.group.models.term.Term;

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

    @Override
    public void queryTable(){
        ArrayList<String[]> thisStudentsTimetable = new ArrayList<>();
        ArrayList<String[]> termsTimetable = TablesRepo.getTermsTable();
        for(String[] row: termsTimetable){
            if(row[6].equals(courseID)&&Integer.parseInt(row[7]) == getYearOfStudy()&&Integer.parseInt(row[8]) == Term.getTerm()){
                thisStudentsTimetable.add(row);
            }
        }
        setTable(thisStudentsTimetable);
    }

    @Override
    public ArrayList<String[]> getTable(){
        if(accessTable() == null){
            queryTable();
        }
        return accessTable();
    }

    public int getYearOfStudy(){
        return yearOfStudy;
    }

    @Override
    public void printTable(ArrayList<String[]> tableToPrint){
    for(String[] row: tableToPrint){
        for(int i = 0;i < 5;i++){
            System.out.printf(" %s | ", row[i]);
            }
        System.out.printf("\n------\n");
        }
    }
}
