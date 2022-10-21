import java.util.Map;

public class Main {
    public static void main(String[] args) {
        boolean isGetAnother = true;

        // pulls the variety of rivean vehicle configuarations and
        // details from the text file and loads them into a map
        // of key-value pairs
        Map<SearchKey, String> riveanInfo = LoadMapFromDataFile.loadMap();

        // Control loop
        while (isGetAnother) {
            // grabs user input from the CLI and returns
            // an initialized object of the MapKey class
            SearchKey searchKey = UserCli.handler();
            // Searches through the riveanInfo object which contains
            // key-value pairs of vehicle configurations and details
            String description = riveanInfo.get(searchKey);
            // display the value of the key-value pair that matched
            // the user configuration
            UserCli.outputResult(description);
            // ask user to continue or end program
            isGetAnother = UserCli.getAnother();
        }
    }
}


            /*
            // Test Code for debugging
            int cnt=1;
            System.out.println("Testing: User Selection Key: " + userKey);
            for (Map.Entry<MapKey, String> item : riveanInfo.entrySet()) {
                System.out.println("Testing: Item " + cnt + " Key: " + item.getKey());
                System.out.println("Testing: Item " + cnt + " Value: " + item.getValue());
                cnt++;
            }
            */