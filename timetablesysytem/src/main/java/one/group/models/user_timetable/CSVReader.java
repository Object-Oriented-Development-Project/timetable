package one.group.models.user_timetable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utility class for reading CSV files. All methods are static.
 */
public class CSVReader {     

    /** 
     * Default constructor. No parameters needed since all methods are static.
     */
    private CSVReader(){
    }
    
    /**
     * Reads a CSV file line by line and returns its contents as a list of strings.
     * Each line becomes a single string in the list.
     *
     * @param filePath the path to the CSV file
     * @return allData a list of strings representing each line in the CSV
     * @throws FileNotFoundException if the specified file does not exist
     */
    public static ArrayList<String> readToArrayList(String filePath) throws FileNotFoundException {
        ArrayList<String> allData = new ArrayList<>();
        try (Scanner input = new Scanner(new File(filePath))){
            while(input.hasNextLine()){
                allData.add(input.nextLine());
            }
        }
        return allData;
    }
}
