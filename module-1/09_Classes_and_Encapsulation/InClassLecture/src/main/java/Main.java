public class Main {

    public static void main(String[] args) {
        //make duck
        Duck myFirstDuck = new Duck("Donald", "White", 2, 3.0 );


            myFirstDuck.setWeight(3.0);
       String duckName = myFirstDuck.getName();
        Duck secondDuck = new Duck("Joe", "Blue", 2, 2.0 );

        System.out.println(myFirstDuck.toString());
        System.out.println(secondDuck.toString());

        myFirstDuck.eat();
        myFirstDuck.eat(3);
    }
}
