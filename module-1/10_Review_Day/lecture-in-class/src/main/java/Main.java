import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

//        System.out.println( WageCalculator.MIN_WAGE_PER_HOUR);
//
//        WageCalculator calc = new WageCalculator();
//
//        System.out.println(calc.wageCalculation(40));
//
//        System.out.println(WageCalculator.wageCalculation(40));
//
//
//        String str = "NLR 10 Java Blue";
//        String instructor = "Greg";
//        String otherInstructor = "Rich";
//        String s = String.format("My class is %s. My instuctor is %s and I wish my instructor were %s", str, instructor, otherInstructor);
//
//        System.out.println(s);
//
//        double wageResult = WageCalculator.wageCalculation(40);
//
//        System.out.println(String.format("Wages due: $%.4f", wageResult));
//        System.out.printf("Print F Wages due: $%.2f",wageResult);
//
//
//        //========================================
//        System.out.println();
//        System.out.println("=============================");
//        System.out.println();
//
//        LocalDateTime myDateObject = LocalDateTime.now();
//
//        System.out.println("The time is now " + myDateObject);
//
//        DateTimeFormatter myFormattingObject = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        DateTimeFormatter AmericanDateOnly = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//
//        System.out.println("Formatted Date: " + AmericanDateOnly.format(myDateObject));
//
//
//        System.out.println("Start of the universe: " +  AmericanDateOnly.format(LocalDateTime.MIN));
//
//        switchStatementExample(1);
//        switchStatementExample(3);
//        switchStatementExample(4);
//        switchStatementExample(5);
//        switchStatementExample(12);

        Farm myFarm = new Farm();
        myFarm.setFarmName("Java Blue Heaven");

        List<Duck> flock = new ArrayList<>();


        for (int i = 0; i < 100; i++) {

            flock.add(new Duck());
        }

        myFarm.setDucks(flock);


        System.out.println( myFarm.toString());
       ;
    }

    public static void switchStatementExample(int dayOfWeek){

        switch(dayOfWeek){
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4:
            case 5:
                System.out.println("Still the work week");
                break;
            default:
                System.out.println("Some other day");
                break;

        }

    }
}
