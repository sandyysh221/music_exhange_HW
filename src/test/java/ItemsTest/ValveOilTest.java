package ItemsTest;

import Items.ItemTypes;
import Items.ValveOil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValveOilTest {
    ValveOil valveOil;

    @Before
    public void before() {
        valveOil = new ValveOil(ItemTypes.VALVE_OIL, "Bach Valve Oil", 3.00, 7.00);
    }

    @Test
    public void getItemType() {
        assertEquals(ItemTypes.VALVE_OIL, valveOil.getItemTypes());
    }

    @Test
    public void getValveOilName() {
        assertEquals("Bach Valve Oil", valveOil.getName());
    }
    @Test
    public void getPriceItemWasBoughtFor() {
        assertEquals(3.00, valveOil.getBoughtPrice(), 0.01);
    }

    @Test
    public void getPriceItemWillBeSoldFor() {
        assertEquals(7.00, valveOil.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.00, valveOil.calculateMarkup(), 0.01);
    }
}

