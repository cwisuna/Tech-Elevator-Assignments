import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoadMapFromDataFile {

    public static Map<SearchKey, String> loadMap() {
        boolean isConsumer = true;
        String path = "c:/Users/Student/workspace/mod1MapsAndOOPPractice/src/main/java/riveanData.txt";
        File dataFile = new File(path);

        if (!dataFile.exists()) {
            System.out.println(path + " Does not exist, exit program");
            System.exit(1);
        } else if (!dataFile.isFile()) {
            System.out.println(path + " Not a text file, exit program");
            System.exit(1);
        }

        Map<SearchKey, String> riveanInfo = new HashMap<SearchKey, String>();
        try (Scanner data = new Scanner(dataFile)) {
            data.nextLine();  // header to data file, not parsed
            while (data.hasNextLine()) {
                String input = data.nextLine();
                String[] fileArray = input.split(":");
                if (fileArray[0].equals("Commercial")) {
                    isConsumer = false;
                }
                riveanInfo.put(new SearchKey(isConsumer, fileArray[1],
                                Integer.parseInt(fileArray[2]),
                                Integer.parseInt(fileArray[3]),
                                Integer.parseInt(fileArray[4])),
                        fileArray[5]);
            }
        } catch (
                FileNotFoundException e) {
            System.err.println("The file does not exist." + e.getMessage());
        }
        return riveanInfo;
    }

}