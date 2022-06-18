import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("John", "First Officer", "it's supposed to be on fire");
    }

    @Test
    public void checkCabinCrewMemberHasName(){
        assertEquals("John", cabinCrewMember.getCabinCrewMemberName());
    }

    @Test
    public void checkCabinCrewMemberHasRanks(){
        assertEquals("First Officer", cabinCrewMember.getCabinCrewMemberRank());
    }

    @Test
    public void checkCabinCrewMemberCanGiveMessageToPassenger(){
        assertEquals("it's supposed to be on fire", cabinCrewMember.getMessageToPassenger());
    }
}
