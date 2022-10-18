import java.util.Objects;

public class SearchKey {
    private boolean isConsumer;
    private String modelNum;
    private int numOfElecMotors;
    private int chargeTime;
    private int numOfSeats;

    public SearchKey(boolean isConsumer, String modelNum, int numOfElecMotors,
                  int chargeTime, int numOfSeats) {
        this.isConsumer = isConsumer;
        this.modelNum = modelNum;
        this.numOfElecMotors = numOfElecMotors;
        this.chargeTime = chargeTime;
        this.numOfSeats = numOfSeats;
    }

    public String toString() {
        return isConsumer + modelNum + numOfElecMotors +
                chargeTime + numOfSeats;
    }

    // this override is required to find a match since
    // the key is an object of a custom class
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchKey that = (SearchKey) o; //isConsumer, modelNum, numOfElecMotors, chargeTime, numOfSeats
        return isConsumer == that.isConsumer && modelNum.equals(that.modelNum) &&
                numOfElecMotors == that.numOfElecMotors &&
                chargeTime == that.chargeTime && numOfSeats == that.numOfSeats;
    }

    // this override is required to find a match since
    // the key is an object of a custom class
    @Override
    public int hashCode() {
        return Objects.hash(isConsumer, modelNum, numOfElecMotors, chargeTime, numOfSeats);

    }
}

