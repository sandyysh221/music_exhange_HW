package ItemsTest;

import Items.DrumSticks;
import Items.ItemTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks(ItemTypes.DRUM_STICKS, "Vic Firth American Classic 5B", 10.00, 20.00);
    }

    @Test
    public void getItemType() {
        assertEquals(ItemTypes.DRUM_STICKS, drumSticks.getItemTypes());
    }

    @Test
    public void getDrumsticksName() {
        assertEquals("Vic Firth American Classic 5B", drumSticks.getName());
    }
    @Test
    public void getPriceItemWasBoughtFor() {
        assertEquals(10.00, drumSticks.getBoughtPrice(), 0.01);
    }

    @Test
    public void getPriceItemWillBeSoldFor() {
        assertEquals(20.00, drumSticks.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10.00, drumSticks.calculateMarkup(), 0.01);
    }
}
