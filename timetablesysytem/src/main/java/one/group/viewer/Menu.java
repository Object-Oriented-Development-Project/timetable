package one.group.viewer;

import java.util.Scanner;

import one.group.models.repositories.TablesRepo;
/** The class for the viewer segment of the programme. */
public class Menu {

    boolean adminStatus = false;

    Scanner scanner = new Scanner(System.in);
    public void login(){
        System.out.printf("Please enter user type: \nS)tudent/nL)ecturer\nA)dmin");
        String input = scanner.nextLine();
        if(input.toUpperCase().equals("S")){
            System.out.printf("Please enter your ID:\n");
            input = scanner.nextLine();
            TablesRepo.getStudentsTable();
        }
    }
}
