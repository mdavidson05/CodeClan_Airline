import java.util.ArrayList;

public class FlightManager{

    Plane plane;
    Flight flight;
//    ArrayList<Passenger> passengers;

    public FlightManager(Plane plane, Flight flight) {
        this.plane = plane;
        this.flight = flight;
    }


    public int getBaggageWeightForEachPassenger() {
        return plane.getWeightFromEnum()/plane.getCapacityFromEnum();
    }

    public int getBaggageWeightForAllPassengers() {
        return this.flight.getPassengerSize() * getBaggageWeightForEachPassenger();
        //passengersARRAYLIST.size()*weightperpassenger
    }


    public int getBaggageWeightRemaining() {
        return plane.getWeightFromEnum() - getBaggageWeightForAllPassengers();

    }
}
