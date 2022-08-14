package ItemsTest;

import Items.ItemTypes;
import Items.Items;
import Items.TuningKit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TuningKitTest {

    TuningKit tuningKit;

    @Before
    public void before() {
        tuningKit = new TuningKit(ItemTypes.TUNING_KIT, "MiriamSong Professional Piano Tuning Kit", 60.00, 90.00);
    }

    @Test
    public void getItemType () {
        assertEquals(ItemTypes.TUNING_KIT, tuningKit.getItemTypes());
    }

    @Test
    public void getTuningKitName() {
        assertEquals("MiriamSong Professional Piano Tuning Kit", tuningKit.getName());
    }
    @Test
    public void getPriceItemWasBoughtFor() {
        assertEquals(60.00, tuningKit.getBoughtPrice(), 0.01);
    }

    @Test
    public void getPriceItemWillBeSoldFor() {
        assertEquals(90.00, tuningKit.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(30.00, tuningKit.calculateMarkup(), 0.01);
    }
}
