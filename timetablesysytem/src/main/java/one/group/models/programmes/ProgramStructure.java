package one.group.models.programmes;

import java.util.ArrayList;

import one.group.models.interfaces.GetID;
import one.group.models.interfaces.Table;
import one.group.models.repositories.TablesRepo;
import one.group.models.term.Term;

/** Class representing a course. */
public class ProgramStructure implements GetID, Table{
    /** The id of the course. */
    private String CourseID;
    /** The name of the course. */
    private String courseName;
    /** The number of students associated with the course. */
    private int students;
    /** The number of years for the course. */
    private int years;
    /** The faculty which this course is a part of. */
    private String faculty;
    /** The timetable for the course. */ 
   private ArrayList<String[]> table;

   /**
    * Constructor to instansiate a ProgramStructure.
    * @param CourseID the id of the course
    * @param years the number of years of the course
    * @param students the number of students in the course
    * @param faculty the faculty that the course is a part of
    */
   public ProgramStructure(String CourseID, int years, int students, String faculty){
        this.CourseID = CourseID;
        this.years = years;
        this.students = students;
        this.faculty = faculty;
   }

    /**
    * Gets the course ID.
    * @return id the course id
    */
    @Override
    public String getID(){
        return CourseID;
    }

    /**
    * Sets the course ID.
    * @param newID the new course id
    */
    public void setID(String newID){
        CourseID = newID;
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
    * Returns a copy of students.
    * @return students a copy of students
    */
    public int getStudents(){
        int i = students;
        return i;
    }

    /**
    * Returns a copy of years.
    * @return years a copy of years
    */
    public int getYears(){
        int i = years;
        return i;
    }

    /**
     * Method to access a courses table.
     * @return the courses table
     */
    @Override
    public ArrayList<String[]> accessTable(){
        return table;
    }

    /**
     * Method to set a courses table to the given one.
     */
    @Override
    public void setTable(ArrayList<String[]> newArrayList){
        table = newArrayList;
    }

    /** Method queryTable implemented for a course, called by getTable() if current users table is null. Sets users table to result. */
    @Override
    public void queryTable(){
        ArrayList<String[]> thisCoursesTimetable = new ArrayList<>();
        ArrayList<String[]> termsTimetable = TablesRepo.getTermsTable();
        for(String[] row: termsTimetable){
            if(row[6].equals(getID())&&Integer.parseInt(row[8]) == Term.getTerm()){
                thisCoursesTimetable.add(row);
            }
        }
        setTable(thisCoursesTimetable);
    }

    /** Method to get the courses table. Checks if current table is null, if it is, the method calls queryTable() to make one. 
    *@return the modules timetable. 
    */
    @Override
    public ArrayList<String[]> getTable(){
        if(accessTable() == null){
            queryTable();
        }
        return accessTable();
    }

    /**
     *  Method to print the courses table.
     * @param tableToPrint the table to be printed
     */
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