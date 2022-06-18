import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    CabinCrewMember crewMember1;
    Passenger passenger1;
    Pilot pilot;



    @Before
    public void before(){
        flight = new Flight();
        passenger1 = new Passenger("Max", 1);
        crewMember1 = new CabinCrewMember("John", "First Officer", "it's supposed to be on fire");
        pilot = new Pilot("Stuart", "Pilot", "Q12345", "yes");
        flight.addPassengers(passenger1);
        flight.addPilot(pilot);
        flight.addCabinCrewMembers(crewMember1);
        flight.addFlightNumber("FR273");
        flight.addDestination("BLN");
        flight.addDeparture("EDI");
        flight.addDepartureTime("1700");

//        flight.addCrewMember(crewMember1);


    }

    @Test
    public void checkFlightHasPilot(){
        assertEquals(1, flight.getPilotSize());

    }

    @Test
    public void checkFlightHasPassenger(){
        assertEquals(1, flight.getPassengerSize());
    }

    @Test
    public void checkFlightHasCrewMembers(){
        assertEquals(1, flight.getCrewMemberSize());

    }

    @Test
    public void checkFlightHasFlightNumber(){
        assertEquals("FR273", flight.getFlightNumber());
    }

    @Test
    public void checkFlightHasDestination(){
        assertEquals("BLN", flight.getFlightDestination());
    }

    @Test
    public void checkFlightHasDepartureAirport(){
        assertEquals("EDI", flight.getFlightDepartureAirport());
    }

    @Test
    public void checkFlightHasDepartureTime(){
        assertEquals("1700", flight.getFlightDepartureTime());
    }
}
