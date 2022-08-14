package ItemsTest;

import Items.FluteMop;
import Items.ItemTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteMopTest {

    FluteMop fluteMop;

    @Before
    public void before() {
        fluteMop = new FluteMop(ItemTypes.FLUTE_MOP, "Flute Mop AS", 5.00, 8.00);
    }

    @Test
    public void getItemType() {
        assertEquals(ItemTypes.FLUTE_MOP, fluteMop.getItemTypes());
    }

    @Test
    public void getFluteMopName() {
        assertEquals("Flute Mop AS", fluteMop.getName());
    }
    @Test
    public void getPriceItemWasBoughtFor() {
        assertEquals(5.00, fluteMop.getBoughtPrice(), 0.01);
    }

    @Test
    public void getPriceItemWillBeSoldFor() {
        assertEquals(8.00, fluteMop.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3.00, fluteMop.calculateMarkup(), 0.01);
    }
}
