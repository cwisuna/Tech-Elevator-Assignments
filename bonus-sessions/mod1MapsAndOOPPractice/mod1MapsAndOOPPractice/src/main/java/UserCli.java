import java.util.Scanner;

public class UserCli {
    static Scanner scan = new Scanner(System.in);

    public static SearchKey handler() {
        boolean isConsumer = true;
        System.out.println("Welcome to the Rivean Configure Your Vehicle Tool.");
        System.out.print("Enter Consumer or Commercial: ");
        String consumerOrCommercial = scan.nextLine();
        if(consumerOrCommercial.equals("Commercial")) {
            System.out.println("Sorry, Commercial Electric Delivery Vans not implemented at this time.");
            System.out.println("Switching to Consumer.");
        }
        System.out.print("Enter SUV module number (R1S) or pick up truck (R1T) nodule number: ");
        String modelNum = scan.nextLine();
        System.out.print("Enter 2 or 4 number of electric motors: ");
        String numOfMotStr = scan.nextLine();
        int numOfElecMotors = Integer.parseInt(numOfMotStr);
        System.out.print("Enter 30 or 120 minute charge time: ");
        String chargeTimeStr = scan.nextLine();
        int chargeTime = Integer.parseInt(chargeTimeStr);
        String numOfPasStr = "5";
        if(modelNum.equals("R1S")) {
            System.out.print("Enter 5 or 7 passangers: ");
            numOfPasStr = scan.nextLine();
        }
        int numOfPas = Integer.parseInt(numOfPasStr);

        SearchKey searchKey = new SearchKey(isConsumer, modelNum,
                numOfElecMotors, chargeTime,
                numOfPas);
        return searchKey;
    }

    public static boolean getAnother() {
        boolean isContinue = true;
        System.out.print("Look up another Rivean (yes or no): ");
        String lookUp = scan.nextLine();
        if (lookUp.equals("no")) { isContinue = false; }
        return isContinue;
    }

    public static void outputResult(String description) {
        System.out.println("\nRevian Vehicle details: " + description + "\n");
    }
}
