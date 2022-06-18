import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void checkPlaneHasCapacity(){
        assertEquals(100, plane.getCapacityFromEnum());
    }

    @Test
    public void checkPlaneHasWeight(){
        assertEquals(200, plane.getWeightFromEnum());
    }

}
