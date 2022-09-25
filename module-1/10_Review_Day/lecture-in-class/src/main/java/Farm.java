import java.util.List;

public class Farm {

    private String farmName;
    private List<Duck> ducks;

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public List<Duck> getDucks() {
        return ducks;
    }

    public void setDucks(List<Duck> ducks) {
        this.ducks = ducks;
    }

    public void addDuck(Duck duck){
        this.ducks.add(duck);
    }

    @Override
    public String toString() {
        return "Farm{" +
                "farmName='" + farmName + '\'' +
                ", ducks=" + ducks +
                '}';
    }
}
