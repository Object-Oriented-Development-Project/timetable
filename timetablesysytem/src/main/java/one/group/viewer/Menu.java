package one.group.viewer;

import java.util.Scanner;

import one.group.models.people.Admin;
import one.group.models.people.Lecturer;
import one.group.models.people.Person;
import one.group.models.people.Student;
import one.group.models.programmes.ProgramStructure;
import one.group.models.repositories.TablesRepo;
import one.group.models.rooms.Classroom;
import one.group.models.rooms.Labroom;
import one.group.models.rooms.Room;
/** The class for the viewer segment of the programme. */
public class Menu {

    private Person user;
    private Admin admin;
    private Room room;
    private Module module;
    private ProgramStructure course;
    private boolean adminStatus = false;
    private boolean go = true;
    private Scanner scanner = new Scanner(System.in);

    public boolean runMenu(){
        
        while(go == true){

            System.out.printf("Please enter user type: \nS)tudent\nT)eacher\nA)dmin\nQ)uit\n");

            String input = scanner.nextLine();
            if(input.toUpperCase().equals("S")){
                System.out.printf("Please enter your ID:\n");
                input = scanner.nextLine();
                for(String row[]:TablesRepo.getStudentsTable()){
                    if(row[0].equals(input.toUpperCase())){
                        user = new Student(row[1], input, row[2], Integer.parseInt(row[3]));
                        System.out.printf("Student log in successful!\n");
                        go = false;
                    }
                }
            }else if(input.toUpperCase().equals("T")){

                System.out.printf("Please enter your ID:\n");

                input = scanner.nextLine();
                for(String row[]:TablesRepo.getLecturersTable()){
                    if(row[0].equals(input)){
                        user = new Lecturer(row[1], input , row[2]);
                        System.out.printf("Lecturer log in successful!\n");
                        go = false;
                    }
                }
            }else if(input.toUpperCase().equals("A")){

                System.out.printf("Please enter your ID:\n");

                input = scanner.nextLine();
                for(String row[]:TablesRepo.getAdminTable()){
                    if(row[0].equals(input)){
                        System.out.printf("Please enter your password:\n");
                        input = scanner.nextLine();
                        if(input.equals(row[2])){
                        admin = new Admin(input, row[1], row[2]);
                        adminStatus = true;
                        System.out.printf("Admin log in successful!\n");
                        go = false;
                        }
                    }
                }            
            }else if(input.toUpperCase().equals("Q")){
                return false;
            }
        }

        go = true;
        while(go == true){
            if(user instanceof Student || user instanceof Lecturer){

            System.out.printf
            ("Please select option: \nU)ser timetable\nA)Room timetable\nM)odule timetable\nC)ourse timetable\nL)ogout\nQ)uit\n");

                String input = scanner.nextLine();
                if(input.toUpperCase().equals("U")){
                    user.printTable(user.getTable());
                }else if (input.toUpperCase().equals("R")){
                    System.out.printf("Please enter the room number: ");
                    input = scanner.nextLine();
                    input = input.toUpperCase();
                    for(String[] row: TablesRepo.getRoomsTable()){
                        if(row[0].equals(room.getID())){
                            if(row[1].equals("TEACHING")){
                                room = new Classroom(input, Integer.parseInt(row[2]), row[3]);
                            }else{
                                room = new Labroom(input, Integer.parseInt(row[2]), row[3]);
                            }
                        }
                    }
                    room.printTable(room.getTable());
                }else if(input.toUpperCase().equals("L")){
                    break;
                }else if(input.toUpperCase().equals("Q")){
                    return false;
                }
            }
        }
        return true;
    }
}