package one.group.viewer;

import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import one.group.models.enums.UniversityHours;
import one.group.models.people.Admin;
import one.group.models.people.Lecturer;
import one.group.models.people.Person;
import one.group.models.people.Student;
import one.group.models.programmes.Module;
import one.group.models.programmes.ProgramStructure;
import one.group.models.repositories.TablesRepo;
import one.group.models.rooms.Classroom;
import one.group.models.rooms.Labroom;
import one.group.models.rooms.Room;
import one.group.models.term.Term;

/** Class for the viewer segment of the programme. */
public class Menu {
    /** Person the user for this interaction */
    private Person user;
    /** Admin the admin for this interaction */
    private Admin admin;
    /** Room the room for this interaction */
    private Room room;
    /** Module the module for this interaction */
    private Module module;
    /** ProgramStructure the course for this interaction */
    private ProgramStructure course;
    /** Booean the admin status for this interaction */
    private boolean adminStatus = false;
    /** Boolean the continue condition for this interaction */
    private boolean go = true;
    /** Scanner the scanner for this interaction */
    private Scanner scanner = new Scanner(System.in);

    /** Method containing the menus logic, if logout is selected the menu restarts, if quit is selected, the method returns false to signal to the controller to end the menu instance.
     * @return boolean whether or not to continue
     * @throws FileNotFoundException 
     */
    public boolean runMenu() throws FileNotFoundException{
        
        user = null;
        admin = null;
        room = null;
        module = null;
        course = null;
        adminStatus = false;

        //The first block, this is where the user logs in.
        while(go == true){

            System.out.printf("\nPlease enter user type: \nS)tudent\nT)eacher\nA)dmin\nQ)uit\n");

            String input = scanner.nextLine();
            input = input.toUpperCase();
            if(input.toUpperCase().equals("S")){

                System.out.printf("\nPlease enter your ID: \n");

                input = scanner.nextLine();
                input = input.toUpperCase();
                for(String row[]:TablesRepo.getStudentsTable()){
                    if(row[0].equals(input.toUpperCase())){
                        user = new Student(row[1], input, row[2], Integer.parseInt(row[3]));
                        System.out.printf("\nStudent log in successful!\n");
                        go = false;
                        break;
                    }
                }
            }else if(input.toUpperCase().equals("T")){

                System.out.printf("\nPlease enter your ID:\n");

                input = scanner.nextLine();
                input = input.toUpperCase();
                for(String row[]:TablesRepo.getLecturersTable()){
                    if(row[0].equals(input.toUpperCase())){
                        user = new Lecturer(row[1], input , row[2]);
                        System.out.printf("\nLecturer log in successful!\n");
                        go = false;
                        break;
                    }
                }
            }else if(input.toUpperCase().equals("A")){

                System.out.printf("\nPlease enter your ID: \n");

                input = scanner.nextLine();
                input = input.toUpperCase();
                for(String row[]:TablesRepo.getAdminTable()){
                    if(row[0].equals(input)){

                        System.out.printf("\nPlease enter your password: \n");

                        input = scanner.nextLine();
                        if(input.equals(row[2])){
                        admin = new Admin(input, row[1], row[2]);
                        adminStatus = true;
                        System.out.printf("\nAdmin log in successful! \n");
                        go = false;
                        break;
                        }else{
                            System.out.printf("\nInvalid input \n");
                        }
                    }
                }            
            }else if(input.toUpperCase().equals("Q")){
                return false;
            }else{
                System.out.printf("\nInvalid input: Please try again. \n");
            }
        }

        //The second block, this is where the user chooses what timetable they want to see.
        go = true;
        while(go == true){

            //User branch.
            if(user instanceof Student || user instanceof Lecturer){

            System.out.printf
            ("\nPlease select option: \nU)ser timetable\nR)oom timetable\nM)odule timetable\nC)ourse timetable\nL)ogout\nQ)uit\n");

                String input = scanner.nextLine();
                input = input.toUpperCase();
                if(input.equals("U")){
                    System.out.println();
                    user.printTable(user.getTable());
                    System.out.println();
                }else if(input.toUpperCase().equals("R")){

                    System.out.printf("\nPlease enter the room number: \n");

                    input = scanner.nextLine();
                    input = input.toUpperCase();
                    for(String[] row: TablesRepo.getRoomsTable()){
                        if(row[0].equals(input)){
                            if(row[1].equals("TEACHING")){
                                room = new Classroom(input, Integer.parseInt(row[2]), row[3]);
                            }else{
                                room = new Labroom(input, Integer.parseInt(row[2]), row[3]);
                            } 
                        }
                    }
                    System.out.println();
                    room.printTable(room.getTable());
                    System.out.println();
                }else if (input.equals("M")){

                    System.out.printf("\nPlease enter the module ID: \n");

                    input = scanner.nextLine();
                    input = input.toUpperCase();
                    for(String[] row: TablesRepo.getModulesTable()){
                        if(row[0].equals(input)){
                            module = new Module(row[0], row[1], row[2], row[3], row[4], row[5]);
                        }
                    }
                    System.out.println();
                    module.printTable(module.getTable());
                    System.out.println();
                }else if (input.equals("C")){
                    
                    System.out.printf("\nPlease enter course ID: \n");

                    input = scanner.nextLine();
                    input = input.toUpperCase();
                    for(String[] row: TablesRepo.getCoursesTable()){
                        if(row[0].equals(input)){
                            course = new ProgramStructure(row[0], Integer.parseInt(row[1]), Integer.parseInt(row[2]), row[3]);
                        }
                    }
                    System.out.println();
                    course.printTable(course.getTable());
                    System.out.println();
                }else if(input.equals("L")){
                    user = null;
                    break;
                }else if(input.equals("Q")){
                    return false;
                }else{
                    System.out.printf("\nInvalid input: Please try again. \n");
                }

            //Admin branch.
            }else if(admin instanceof Admin){
                System.out.printf
                ("\nPlease select option: \nS)et term\nU)update table\nL)og out\nQ)uit\n");

                String input = scanner.nextLine();
                input = input.toUpperCase();
                if(input.toUpperCase().equals("S")){

                    System.out.printf("\nPlease enter the current term: \n");

                    input = scanner.nextLine();
                    input = input.toUpperCase();
                    if(input.equals("1") || input.equals("2")){
                        admin.setTerm(Integer.parseInt(input));
                        System.out.printf("\nTerm successfully set to %s\n", input);
                    }else{
                        System.out.printf("\nError: Invalid input\n");
                    }
                }else if (input.toUpperCase().equals("U")) {
                    updateTable();
                }else if (input.toUpperCase().equals("L")){
                    user = null;
                    break;
                }else if(input.toUpperCase().equals("Q")){
                    scanner.close();
                    return false;
                }else{
                    System.out.printf("\nInvalid input: Please try again. \n");
                }
            }
        }
        return true;
    }

    /** 
     * This method handles the updating of tables within the menu. Functionally, it is a submenu.
     */
    private void updateTable() throws FileNotFoundException{
        System.out.printf
        ("\nPlease select option: \nA)dmins\nC)ourses\nF)aculties\nL)ecturers\nM)odules\nR)ooms\nS)tudents\nT)erms\nE)xit\n");
        String input = scanner.nextLine();
        input = input.toUpperCase();
        if(input.equals("A")){
            System.out.printf("\nPlease enter admin ID: \n");
            String id = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter admin e-mail: \n");
            String email = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter admin password: \n");
            String password = scanner.nextLine();
            try {
                TablesRepo.addRowToAdminTable(TablesRepo.parseInputsIntoRow(id, email, password));
            } catch (FileNotFoundException e) {
                throw e;
            }
        }else if (input.equals("C")) {
            System.out.printf("\nPlease enter course ID: \n");
            String id = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter number of years: \n");
            String number = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the student count: \n");
            String students = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the faculty: \n");
            String faculty = scanner.nextLine().toUpperCase();
            try {
                TablesRepo.addRowToCoursesTable(TablesRepo.parseInputsIntoRow(id, number, students, faculty));
            } catch (FileNotFoundException e) {
                throw e;
            }
        }else if (input.equals("F")) {
            System.out.printf("\nPlease enter faculty ID: \n");
            String id = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the facultys name: \n");
            String name = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the facultys building \n");
            String building = scanner.nextLine().toUpperCase();
            try {
                TablesRepo.addRowToFacultyTable(TablesRepo.parseInputsIntoRow(id, name, building));
            } catch (FileNotFoundException e) {
                throw e;
            }
        }else if (input.equals("L")) {
            System.out.printf("\nPlease enter lecturers ID: \n");
            String id = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the lecturers name: \n");
            String name = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the lecturers faculty \n");
            String faculty = scanner.nextLine().toUpperCase();
            try {
                TablesRepo.addRowToLecturersTable(TablesRepo.parseInputsIntoRow(id, name, faculty));
            } catch (FileNotFoundException e) {
                throw e;
            }
        }else if (input.equals("M")) {
            System.out.printf("\nPlease enter modules ID: \n");
            String id = scanner.nextLine().toUpperCase().toUpperCase();
            System.out.printf("\nPlease enter the lecturers ID for this module: \n");
            String lecturer = scanner.nextLine().toUpperCase().toUpperCase();
            System.out.printf("\nPlease enter the course ID for this module \n");
            String courseID = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the lecture hours for this module \n");
            String lectureHours = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the lab hours for this module \n");
            String labHours = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the tutorial hours for this module \n");
            String tutorialHours = scanner.nextLine().toUpperCase();
            try {
                TablesRepo.addRowToModulesTable(TablesRepo.parseInputsIntoRow(id, lecturer, courseID, lectureHours, labHours, tutorialHours));
            } catch (FileNotFoundException e) {
                throw e;
            }
        }else if (input.equals("R")) {
            System.out.printf("\nPlease enter rooms ID: \n");
            String id = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter room type: ('TEACHING' OR 'LAB') \n");
            String type = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the capacity: \n");
            String capacity = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the bulding this room is in: \n");
            String bulding = scanner.nextLine().toUpperCase();
            try {
                TablesRepo.addRowToRoomsTable(TablesRepo.parseInputsIntoRow(id, type, capacity, bulding));
            } catch (FileNotFoundException e) {
                throw e;
            }
        }else if (input.equals("S")) {
            System.out.printf("\nPlease enter students ID: \n");
            String id = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease students name: \n");
            String name = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the students course: \n");
            String course = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the year of study for student: \n");
            String year = scanner.nextLine().toUpperCase();
            try {
                TablesRepo.addRowToStudentsTable(TablesRepo.parseInputsIntoRow(id, name, course, year));
            } catch (FileNotFoundException e) {
                throw e;
            }
        }else if (input.equals("T")) {
            System.out.printf("\nPlease enter the day for this event: \n");
            String day = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the module id: \n");
            String module = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the type of event \n");
            String typeOfEvent = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the room for the event \n");
            String room = scanner.nextLine().toUpperCase();
            System.out.printf("\nList of available times: \n");
            ArrayList<String> hours = UniversityHours.getFreeHours(day, room);
            System.out.printf("\n%s\n", hours.toString());
            System.out.printf("\nPlease enter the time for event start \n");
            String time = scanner.nextLine().toUpperCase();
            System.out.printf("\nPlease enter the event length; 1 or 2 (hours) \n");
            String length = scanner.nextLine().toUpperCase();
            String timeInput = String.format
            ("%d:00-%d:00", LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm")).getHour(), 
            LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm")).getHour() + Integer.parseInt(length));
            String lecturer;
            String course;
            String year;
            if(hours.contains(time)){
                for(String[] row: TablesRepo.getModulesTable()){
                    if(row[0].equals(module)){
                        lecturer = row[1].toUpperCase();
                        course = row[2].toUpperCase();
                        year = row[3].toUpperCase();
                        TablesRepo.addRowToTermsTable
                        (TablesRepo.parseInputsIntoRow
                            (day, timeInput, module, typeOfEvent, room, lecturer, course, year, 
                                Integer.toString(Term.getTerm())));
                    }
                }
                
            }else{
                System.out.printf("Invalid input: time unavailable.");
            }
        }else if(input.equals("E")){
            return;
        }else{
            System.out.printf("\nError: invalid input \n");
        }
    }
}