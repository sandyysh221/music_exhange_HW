package ItemsTest;

import Items.ItemTypes;
import Items.ShoulderRest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoulderRestTest {
    ShoulderRest shoulderRest;

    @Before
    public void before() {
        shoulderRest = new ShoulderRest(ItemTypes.SHOULDER_REST, "Kun Collapsible Shoulder Rest", 100.00, 150.00);
    }

    @Test
    public void getItemType() {
        assertEquals(ItemTypes.SHOULDER_REST, shoulderRest.getItemTypes());
    }

    @Test
    public void getShoulderRestName() {
        assertEquals("Kun Collapsible Shoulder Rest", shoulderRest.getName());
    }
    @Test
    public void getPriceItemWasBoughtFor() {
        assertEquals(100.00, shoulderRest.getBoughtPrice(), 0.01);
    }

    @Test
    public void getPriceItemWillBeSoldFor() {
        assertEquals(150.00, shoulderRest.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50.00, shoulderRest.calculateMarkup(), 0.01);
    }
}
