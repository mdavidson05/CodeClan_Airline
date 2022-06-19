import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    FlightManager flightManager;
    PlaneType planeType;
    Passenger passenger1;
    CabinCrewMember crewMember1;
    Pilot pilot;
    ArrayList<Passenger> passengers;
    Plane plane;
    Passenger passenger;


    @Before
    public void before(){
        flight = new Flight();
        planeType = PlaneType.BOEING747;
        plane = new Plane(planeType);
        crewMember1 = new CabinCrewMember("John", "First Officer", "it's supposed to be on fire");
        pilot = new Pilot("Stuart", "Pilot", "Q12345", "yes");
        flight.addPilot(pilot);
        flight.addCabinCrewMembers(crewMember1);
        flight.addFlightNumber("FR273");
        flight.addDestination("BLN");
        flight.addDeparture("EDI");
        flight.addDepartureTime("1700");
        flightManager = new FlightManager(plane, flight);



    }

    @Test
    public void findHowMuchBaggageWeightForEachPassenger(){
        assertEquals(2, flightManager.getBaggageWeightForEachPassenger());
    }

    @Test
    public void findHowMuchBaggageWeightForAllPassengers(){
        assertEquals(0, flightManager.getBaggageWeightForAllPassengers());
    }

    @Test
    public void findHowMuchBaggareWeightRemainingOnFlight(){
        assertEquals(200, flightManager.getBaggageWeightRemaining());

    }

    @Test
    public void checkPassengerHasFlightNumber() {
        passenger1 = new Passenger("Max", 1, flight.getFlightNumber(), flight.getPassengerSeat());
        flight.addPassengers(passenger1);
        assertEquals("FR273", flight.getFlightNumber());

    }

    @Test
    public void checkPassengerHasSeat() {
        passenger1 = new Passenger("Max", 1, flight.getFlightNumber(), flight.getPassengerSeat());
        flight.addPassengers(passenger1);
        assertEquals(1, flight.getPassengerSeatSize());

    }
}
