package one.group.models.enums;

public enum CSVTable {
    COURSES_TABLE("courses.csv"),
    FACULTIES_TABLE("faculties.csv"),
    LECTURERS_TABLE("lecturers.csv"),
    MODULES_TABLE("modules.csv"),
    ROOMS_TABLE("rooms.csv") ,
    STUDENTS_TABLE("students.csv"),
    TERMS_TABLE("terms.csv"),
    ADMINS_TABLE("admins.csv");

    private String filePath;

    private CSVTable(String filePath){
        this.filePath = filePath;
    }
}
