package one.group.models.user_timetable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/** Class for reading CSV files on behalf of other classes, it has static methods. */
public class CSVReader {

    /**No parameters needed for constructor, class is only needed for static methods. */
    public CSVReader() {

    }
    
    /** Read a csv file line by line and then make a 1D array of that line before putting the
     *  array in a list to form the files data. */
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
