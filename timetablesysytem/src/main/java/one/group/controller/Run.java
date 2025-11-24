package one.group.controller;
import java.io.FileNotFoundException;

import one.group.viewer.Menu;

/** The class for the controller segment of the programme. */
public class Run {
    /**
     * The main method for the controller.
     * @param args the command line arguments.
     * Uses the boolean value for 'go' to sustain a while loop, go is set to false when the menu returns false.
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException{
        Menu menu = new Menu();

        boolean go = true;

        while(go){
            go = menu.runMenu();
        }
    }
}