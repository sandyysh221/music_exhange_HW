package InstrumentsTest;

import Instruments.InstrumentTypes;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Bach 180S37", "Vincent Bach", InstrumentTypes.BRASS, 3);
    }

    @Test
    public void getName() {
        assertEquals("Bach 180S37", trumpet.getName());
    }

    @Test
    public void getBrandName() {
        assertEquals("Vincent Bach", trumpet.getBrand());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentTypes.BRASS, trumpet.getInstrumentTypes());
    }

    @Test
    public void getNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("Pah-pa-ra", trumpet.play());
    }
}
