package InstrumentsTest;

import Instruments.InstrumentTypes;
import Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin("Lipinski Stradivarius", "Stradivarius", InstrumentTypes.STRINGS, 4, 100000.00, 500000.00);
    }

    @Test
    public void getName() {
        assertEquals("Lipinski Stradivarius", violin.getName());
    }

    @Test
    public void getBrandName() {
        assertEquals("Stradivarius", violin.getBrand());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentTypes.STRINGS, violin.getInstrumentTypes());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Zing zing zing", violin.play());
    }

    @Test
    public void getPriceItemWasBoughtFor() {
        assertEquals(100000.00, violin.getBoughtPrice(), 0.01);
    }

    @Test
    public void getPriceItemWillBeSoldFor() {
        assertEquals(500000.00, violin.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(400000.00, violin.calculateMarkup(), 0.01);
    }
}
