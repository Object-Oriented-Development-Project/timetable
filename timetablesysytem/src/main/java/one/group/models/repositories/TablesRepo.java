package one.group.models.repositories;

import java.util.ArrayList;

import one.group.models.enums.CSVTable;
import one.group.models.user_timetable.CSVReader;

public class TablesRepo {

    private static ArrayList<String[]> adminTable;
    private static ArrayList<String[]> coursesTable;
    private static ArrayList<String[]> facultiesTable;
    private static ArrayList<String[]> lecturersTable;
    private static ArrayList<String[]> modulesTable;
    private static ArrayList<String[]> roomsTable;
    private static ArrayList<String[]> studentsTable;
    private static ArrayList<String[]> termsTable;

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

    public static ArrayList<String[]> getAdminTable(){
        return new ArrayList<>(adminTable);
    }

    public static ArrayList<String[]> getCoursesTable(){
        return new ArrayList<>(coursesTable);
    }

    public static ArrayList<String[]> getFacultiesTable(){
        return new ArrayList<>(facultiesTable);
    }

    public static ArrayList<String[]> getLecturersTable(){
        return new ArrayList<>(lecturersTable);
    }

    public static ArrayList<String[]> getModulesTable(){
        return new ArrayList<>(modulesTable);
    }

    public static ArrayList<String[]> getRoomsTable(){
        return new ArrayList<>(roomsTable);
    }

    public static ArrayList<String[]> getStudentsTable(){
        return new ArrayList<>(studentsTable);
    }

    public static ArrayList<String[]> getTermsTable(){
        return new ArrayList<>(termsTable);
    }
}
