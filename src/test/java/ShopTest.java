import Instruments.InstrumentTypes;
import Instruments.Piano;
import Items.ItemTypes;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {
    Shop shop;
    Piano piano;
    SheetMusic sheetMusic1;
    SheetMusic sheetMusic2;

    @Before
    public void before() {
        shop = new Shop("Sandy's Music Exchange");
        piano = new Piano("CLP-775 PE", "Yamaha", InstrumentTypes.KEYBOARDS, 88, 5000.00, 15000.00);
        sheetMusic1 = new SheetMusic(ItemTypes.SHEET_MUSIC, "Piano Concerto No. 21 in C Major", 15.00, 20.00);
        sheetMusic2 = new SheetMusic(ItemTypes.SHEET_MUSIC, "River Flows In You", 15.00, 20.00);
    }

    @Test
    public void canGetStoreName() {
        assertEquals("Sandy's Music Exchange", shop.getName());
    }

    @Test
    public void shopStartsWithNoStock() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddToStock() {
        shop.addItemToStock(piano);
        assertEquals(1, shop.getStockCount());
        assertTrue(shop.getStock().contains(piano));
    }

    @Test
    public void fromRemoveFromStock() {
        shop.addItemToStock(piano);
        shop.addItemToStock(sheetMusic1);
        shop.addItemToStock(sheetMusic2);
        assertEquals(3, shop.getStockCount());
        shop.removeItemFromStock(sheetMusic2);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canCalculatePotentialProfit() {
        shop.addItemToStock(piano);
        shop.addItemToStock(sheetMusic1);
        shop.addItemToStock(sheetMusic2);
        assertEquals(10010, shop.calculatePotentialProfit(), 0.01);
    }

}
