package one.group.viewer;

import java.util.Scanner;

import one.group.models.people.Admin;
import one.group.models.people.Lecturer;
import one.group.models.people.Person;
import one.group.models.people.Student;
import one.group.models.repositories.TablesRepo;
/** The class for the viewer segment of the programme. */
public class Menu {

    private static Person user;
    private static Admin admin;
    private static boolean adminStatus = false;
    private static boolean go = true;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        while(go == true){
            System.out.printf("Please enter user type: \nS)tudent\nL)ecturer\nA)dmin\nQ)uit\n");
            String input = scanner.nextLine();
            if(input.toUpperCase().equals("S")){
                System.out.printf("Please enter your ID:\n");
                input = scanner.nextLine();
                for(String row[]:TablesRepo.getStudentsTable()){
                    if(row[0].equals(input)){
                        user = new Student(row[1], input, row[2], Integer.parseInt(row[3]));
                        System.out.printf("Student log in successful!\n");
                        go = false;
                    }
                }
            }else if(input.toUpperCase().equals("L")){
                System.out.printf("Please enter your ID:\n");
                input = scanner.nextLine();
                for(String row[]:TablesRepo.getLecturersTable()){
                    if(row[0].equals(input)){
                        user = new Lecturer(input, row[1], row[2]);
                        System.out.printf("Lecturer log in successful!\n");
                        go = false;
                    }
                }
            }else if(input.toUpperCase().equals("A")){
                System.out.printf("Please enter your ID:\n");
                input = scanner.nextLine();
                for(String row[]:TablesRepo.getAdminTable()){
                    if(row[0].equals(input)){
                        System.out.printf("Please enter admin password:\n");
                        input = scanner.nextLine();
                        if(input == row[2]){
                        admin = new Admin(input, row[1], row[2]);
                        adminStatus = true;
                        System.out.printf("Admin log in successful!\n");
                        go = false;
                        }
                    }
                }            
            }else if(input.toUpperCase().equals("Q")){
                go = false;
            }
        }
    }
}
