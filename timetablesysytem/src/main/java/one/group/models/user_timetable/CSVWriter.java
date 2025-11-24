package one.group.models.user_timetable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList; 
/** Utility class for writing to CSV files. All methods are static. */
public class CSVWriter{
    
    /** Constructor with no parameters. */
    public CSVWriter(){}

    /**
     * Method to write the input String to the target csv file.
     * @param input the String to input
     * @param fileToUpdate the target file to write to
     * @throws FileNotFoundException throws this if no file found at the filepath given
     */
    public static void writeToFile(File file, ArrayList<String[]> table) throws FileNotFoundException {
        try(PrintWriter writer = new PrintWriter(file)){
            for(String[] row: table){
                int j  = row.length;
                for(int i = 0;i < j;i++){
                    if(i == j - 1){
                        writer.print(String.format(row[i]));
                    }else{
                        writer.print(String.format(row[i] + ","));
                    }
                }
                writer.println();
            }
        }
    }
}