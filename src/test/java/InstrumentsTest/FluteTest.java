package InstrumentsTest;

import Instruments.Flute;
import Instruments.InstrumentTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute("PF-665 E Quantz", "Pearl Flute", InstrumentTypes.WOODWIND, 16, 500.00, 800.00);
    }

    @Test
    public void getName() {
        assertEquals("PF-665 E Quantz", flute.getName());
    }

    @Test
    public void getBrandName() {
        assertEquals("Pearl Flute", flute.getBrand());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentTypes.WOODWIND, flute.getInstrumentTypes());
    }

    @Test
    public void getNumberOfTonalHoles() {
        assertEquals(16, flute.getNumberOfToneHoles());
    }

    @Test
    public void canPlay() {
        assertEquals("Tootle ti toot", flute.play());
    }

    @Test
    public void getPriceItemWasBoughtFor() {
        assertEquals(500.00, flute.getBoughtPrice(), 0.01);
    }

    @Test
    public void getPriceItemWillBeSoldFor() {
        assertEquals(800.00, flute.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(300.00, flute.calculateMarkup(), 0.01);
    }
}
