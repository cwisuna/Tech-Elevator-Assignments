public class Thing implements ThingInterface, Conscience{

    private String thingName;

    // getters and setters
    @Override
    public String getName() {
        return this.thingName;
    }

    // constructors
    public Thing(String thingName){
        this.thingName = thingName;
    }

    @Override
    public void createChaos() {
        System.out.println(this.thingName + " has made a mess.");
    }

    @Override
    public void cleanUp() {
        System.out.println(this.thingName + " has cleaned up his mess.");

    }

    @Override
    public void think() {
        System.out.println("kjlsdhakljsdhfk;ls");
    }

    @Override
    public void speak() {
        System.out.println("kljsadflkj;d;fjas");
    }
}
