public class CatInTheHat extends Thing implements  Conscience{

    public CatInTheHat(String thingName) {
        super(thingName);
    }

    @Override
    public void think() {
        System.out.println("Hmmmmm....");
    }

    @Override
    public void speak() {
        System.out.println("Hello");

    }
}
