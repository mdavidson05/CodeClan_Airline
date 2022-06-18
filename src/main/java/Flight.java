import java.util.ArrayList;

public class Flight {

    PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Pilot> pilots;
    private ArrayList<Passenger> passengers;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private String pilot;

    public Flight(){
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public void addPassengers(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void addFlightNumber(String flightNumber) {
        this.flightNumber = (flightNumber);
    }

    public int getPilotSize() {
        return this.pilots.size();
    }

    public int getPassengerSize() {
        return this.passengers.size();
    }

    public int getCrewMemberSize() {
        return this.cabinCrewMembers.size();
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public void addCabinCrewMembers(CabinCrewMember crewMember1) {
        this.cabinCrewMembers.add(crewMember1);

    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void addDestination(String bln) {
        this.destination = bln;
    }

    public void addDeparture(String edi) {
        this.departureAirport = edi;
    }

    public void addDepartureTime(String s) {
        this.departureTime = s;
    }

    public String getFlightDestination() {
        return this.destination;
    }

    public String getFlightDepartureAirport() {
        return this.departureAirport;
    }

    public String getFlightDepartureTime() {
        return this.departureTime;
    }
}
