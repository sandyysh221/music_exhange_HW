package InstrumentsTest;

import Instruments.Drums;
import Instruments.InstrumentTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drums drums;

    @Before
    public void before() {
        drums = new Drums("The Ringo", "Ludwig Drums", InstrumentTypes.PERCUSSION, 3);
    }

    @Test
    public void getName() {
        assertEquals("The Ringo", drums.getName());
    }

    @Test
    public void getBrandName() {
        assertEquals("Ludwig Drums", drums.getBrand());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentTypes.PERCUSSION, drums.getInstrumentTypes());
    }

    @Test
    public void getNumberOfPieces() {
        assertEquals(3, drums.getNumberOfPieces());
    }

    @Test
    public void canPlay() {
        assertEquals("Ba dum tss", drums.play());
    }
}
