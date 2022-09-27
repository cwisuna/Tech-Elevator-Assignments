import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Thing catInTheHat = new CatInTheHat("Cat-in-the-hat");

        catInTheHat.speak();
        catInTheHat.think();
        catInTheHat.createChaos();
        catInTheHat.cleanUp();

        Thing thing1 = new Thing("Thing 1");
        thing1.speak();
        thing1.think();
        thing1.createChaos();
        thing1.cleanUp();
//
//        List<Thing> things = new ArrayList<>();
//        for (int i = 0; i <  100; i++) {
//            things.add(new Thing("Thing " + i));
//        }
//
//        for(Thing item : things){
//            item.createChaos();
//        }
    }
}
