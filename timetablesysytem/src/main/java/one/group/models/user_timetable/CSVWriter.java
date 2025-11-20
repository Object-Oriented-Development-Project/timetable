package one.group.models.user_timetable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter; 

public class CSVWriter{
    
    public CSVWriter(){}

    public static void writeToFile(String input, File fileToUpdate) throws FileNotFoundException {
        try(PrintWriter writeTo = new PrintWriter(fileToUpdate)){
             writeTo.print(input);
        }
    }
}