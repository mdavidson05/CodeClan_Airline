import java.util.ArrayList;
import java.util.Random;

public class Passenger {

    private String name;
    private int bags;
//    private int seatNumber;
    private String flight;
    private Random random;
    private ArrayList<Integer> seatNumber;

    public Passenger(String name, int bags, String flight, ArrayList<Integer> seatNumber) {
        this.name = name;
        this.bags = bags;
        this.flight = flight;
        this.seatNumber = seatNumber;

    }

    public String getPassengerName() {
        return this.name;
    }

    public int getPassengerBags() {
        return this.bags;
    }

    public String getPassengerFlight() {
        return flight;
    }

    public int getSeatNumber() {
        return seatNumber.size();
    }

    public String assignFlight(String flightNumber){
        this.flight = flightNumber;
        return this.flight;
    }

    public void assignSeat(){
        Random seat = new Random();
        int upperbound = 100;
        int int_random = seat.nextInt(upperbound);
        seatNumber.add(int_random);
//        return this.seatNumber;
    }

    public String getFlightNumber() {
        return this.flight;
    }

    public ArrayList<Integer> getPassengerSeat() {
        assignSeat();
        return this.seatNumber;
    }


}
