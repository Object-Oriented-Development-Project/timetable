package one.group.models.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import one.group.models.enums.CSVTable;
import one.group.models.user_timetable.CSVReader;
import one.group.models.user_timetable.CSVWriter;
/** Class to act as a repositoty for the information regarding the csv files used by the program. Uses static fields and methods. 
 * Includes methods to store each csv file as an ArrayList on boot, get methods only return copies.
 */
public class TablesRepo {
    /** ArrayList for the table of admins. */
    private static ArrayList<String[]> adminTable;
    /** ArrayList for the table of courses. */
    private static ArrayList<String[]> coursesTable;
    /** ArrayList for the table of faculties. */
    private static ArrayList<String[]> facultiesTable;
    /** ArrayList for the table of lecturers. */
    private static ArrayList<String[]> lecturersTable;
    /** ArrayList for the table of modules. */
    private static ArrayList<String[]> modulesTable;
    /** ArrayList for the table of rooms. */
    private static ArrayList<String[]> roomsTable;
    /** ArrayList for the table of students. */
    private static ArrayList<String[]> studentsTable;
    /** ArrayList for the table of terms. */
    private static ArrayList<String[]> termsTable;

    /** Static block to initialise all tables on boot from the CSV files specified by the given paths.  */
    static {
        try {
            adminTable = CSVReader.readToArrayList(CSVTable.ADMINS_TABLE.filePath);
            coursesTable = CSVReader.readToArrayList(CSVTable.COURSES_TABLE.filePath);
            facultiesTable = CSVReader.readToArrayList(CSVTable.FACULTIES_TABLE.filePath);
            lecturersTable = CSVReader.readToArrayList(CSVTable.LECTURERS_TABLE.filePath);
            modulesTable = CSVReader.readToArrayList(CSVTable.MODULES_TABLE.filePath);
            roomsTable = CSVReader.readToArrayList(CSVTable.ROOMS_TABLE.filePath);
            studentsTable = CSVReader.readToArrayList(CSVTable.STUDENTS_TABLE.filePath);
            termsTable = CSVReader.readToArrayList(CSVTable.TERMS_TABLE.filePath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method to return the admins table
     * @return adminTable the table of admins
     */
    public static ArrayList<String[]> getAdminTable(){
        return new ArrayList<>(adminTable);
    }

    /**
     * Method to return the admins table
     * @return adminTable the table of admins
     */
    public static ArrayList<String[]> getCoursesTable(){
        return new ArrayList<>(coursesTable);
    }

    /**
     * Method to return the admins table
     * @return adminTable the table of admins
     */
    public static ArrayList<String[]> getFacultiesTable(){
        return new ArrayList<>(facultiesTable);
    }

    /**
     * Method to return the admins table
     * @return adminTable the table of admins
     */
    public static ArrayList<String[]> getLecturersTable(){
        return new ArrayList<>(lecturersTable);
    }

    /**
     * Method to return the admins table
     * @return adminTable the table of admins
     */
    public static ArrayList<String[]> getModulesTable(){
        return new ArrayList<>(modulesTable);
    }

    /**
     * Method to return the admins table
     * @return adminTable the table of admins
     */
    public static ArrayList<String[]> getRoomsTable(){
        return new ArrayList<>(roomsTable);
    }

    /**
     * Method to return the admins table
     * @return adminTable the table of admins
     */
    public static ArrayList<String[]> getStudentsTable(){
        return new ArrayList<>(studentsTable);
    }

    /**
     * Method to return the terms table
     * @return termsTable the table of admins
     */
    public static ArrayList<String[]> getTermsTable(){
        return new ArrayList<>(termsTable);
    }

    public static void addRowToAdminTable(String[] rowToAdd) throws FileNotFoundException{
        adminTable.add(rowToAdd);
        try {
            File file = new File(CSVTable.ADMINS_TABLE.filePath);
            CSVWriter.writeToFile(file, adminTable);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    public static void addRowToCoursesTable(String[] rowToAdd) throws FileNotFoundException{
        coursesTable.add(rowToAdd);
        try {
            File file = new File(CSVTable.COURSES_TABLE.filePath);
            CSVWriter.writeToFile(file, coursesTable);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }
    
    public static void addRowToFacultyTable(String[] rowToAdd) throws FileNotFoundException{
        facultiesTable.add(rowToAdd);
        try {
            File file = new File(CSVTable.FACULTIES_TABLE.filePath);
            CSVWriter.writeToFile(file, facultiesTable);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    public static void addRowToLecturersTable(String[] rowToAdd) throws FileNotFoundException{
        lecturersTable.add(rowToAdd);
        try {
            File file = new File(CSVTable.LECTURERS_TABLE.filePath);
            CSVWriter.writeToFile(file, lecturersTable);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    public static void addRowToModulesTable(String[] rowToAdd) throws FileNotFoundException{
        modulesTable.add(rowToAdd);
        try {
            File file = new File(CSVTable.MODULES_TABLE.filePath);
            CSVWriter.writeToFile(file, modulesTable);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    public static void addRowToRoomsTable(String[] rowToAdd) throws FileNotFoundException{
        roomsTable.add(rowToAdd);
        try {
            File file = new File(CSVTable.ROOMS_TABLE.filePath);
            CSVWriter.writeToFile(file, roomsTable);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    public static void addRowToStudentsTable(String[] rowToAdd) throws FileNotFoundException{
        studentsTable.add(rowToAdd);
        try {
            File file = new File(CSVTable.STUDENTS_TABLE.filePath);
            CSVWriter.writeToFile(file, studentsTable);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    public static void addRowToTermsTable(String[] rowToAdd) throws FileNotFoundException{
        termsTable.add(rowToAdd);
        try {
            File file = new File(CSVTable.TERMS_TABLE.filePath);
            CSVWriter.writeToFile(file, termsTable);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    public static String[] parseInputsIntoRow(String s1, String s2, String s3){
        String[] s = {s1, s2, s3};
        return s;
    }

    public static String[] parseInputsIntoRow(String s1, String s2, String s3, String s4){
        String[] s = {s1, s2, s3, s4};
        return s;
    }

    public static String[] parseInputsIntoRow(String s1, String s2, String s3, String s4, String s5, String s6){
        String[] s = {s1, s2, s3, s4, s5, s6};
        return s;
    }

    public static String[] parseInputsIntoRow(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9){
        String[] s = {s1, s2, s3, s4, s5, s6, s7, s8, s9};
        return s;
    }
}
