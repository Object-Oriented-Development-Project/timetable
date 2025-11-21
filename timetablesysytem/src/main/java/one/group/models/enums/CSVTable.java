package one.group.models.enums;

public enum CSVTable {
    COURSES_TABLE("/data/courses.csv"),
    FACULTIES_TABLE("/data/faculties.csv"),
    LECTURERS_TABLE("/data/lecturers.csv"),
    MODULES_TABLE("/data/modules.csv"),
    ROOMS_TABLE("/data/rooms.csv") ,
    STUDENTS_TABLE("/data/students.csv"),
    TERMS_TABLE("/data/terms.csv"),
    ADMINS_TABLE("/data/admins.csv");

    public String filePath;

    private CSVTable(String filePath){
        this.filePath = filePath;
    }
}
