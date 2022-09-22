public class Duck {

    //properties
    private String name;
    private String color;
    private int feet;
    private double weight;

    //can only access private properties with getters and setters, can set public properties without getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    //constructor
//    public Duck(){
//        System.out.println("My duck is being created");
//    }



    public Duck(String name, String color, int feet, double weight){
        this.name = name;
        this.color = color;
        this.feet = feet;
        this.weight = weight;

    }
    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", feet=" + feet +
                ", weight=" + weight +
                '}';
    }
    //methods

    public void eat(int feedInGrams) {
        this.weight += (feedInGrams * 0.1);
    }

    public void eat() {
    }
}
