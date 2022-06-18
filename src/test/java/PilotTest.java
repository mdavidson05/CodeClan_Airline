import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Stuart", "Pilot", "G1245","yes");
    }

    @Test
    public void checkPilotHasName(){
        assertEquals("Stuart", pilot.getPilotName());
    }

    @Test
    public void checkPilotHasRank(){
        assertEquals("Pilot", pilot.getPilotRank());
    }

    @Test
    public void checkPilotHasLicence(){
        assertEquals("G1245", pilot.getPilotLicence());
    }

    @Test
    public void checkPilotCanFlyPlane(){
        assertEquals("yes", pilot.getPilotCanFly());
    }
}
