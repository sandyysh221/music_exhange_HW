package InstrumentsTest;

import Instruments.InstrumentTypes;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("CLP-775 PE", "Yamaha", InstrumentTypes.KEYBOARDS, 88);
    }

    @Test
    public void getName() {
        assertEquals("CLP-775 PE", piano.getName());
    }

    @Test
    public void getBrandName() {
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentTypes.KEYBOARDS, piano.getInstrumentTypes());
    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink-a-plink-a-plink", piano.play());
    }
}
