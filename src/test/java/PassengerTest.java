import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Max", 1);
    }

    @Test
    public void checkPassengerHasName(){
        assertEquals("Max", passenger.getPassengerName());
    }

    @Test
    public void checkPassengerHasBags(){
        assertEquals(1, passenger.getPassengerBags());
    }




}
