public class WageCalculator {

    private static final double WAGE_PER_HOUR = 40.00;
    public static final double MIN_WAGE_PER_HOUR = 10.00;

    public static double wageCalculation(double numberOfHours) {
        return numberOfHours * WAGE_PER_HOUR;

    }


}
