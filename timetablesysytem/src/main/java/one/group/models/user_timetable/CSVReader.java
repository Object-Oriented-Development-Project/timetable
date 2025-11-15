package one.group.models.user_timetable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {

    public CSVReader() {

    }

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
