public class Passenger {

    private String name;
    private int bags;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
    }

    String getPassengerName() {
        return this.name;
    }

    public int getPassengerBags() {
        return this.bags;
    }
}
