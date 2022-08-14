package ItemsTest;

import Items.ItemTypes;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(ItemTypes.SHEET_MUSIC, "Fantasia in D Minor, K. 397", 15.00, 20.00);
    }

    @Test
    public void getItemType() {
        assertEquals(ItemTypes.SHEET_MUSIC, sheetMusic.getItemTypes());
    }

    @Test
    public void getSheetMusicName() {
        assertEquals("Fantasia in D Minor, K. 397", sheetMusic.getName());
    }

    @Test
    public void getPriceItemWasBoughtFor() {
        assertEquals(15.00, sheetMusic.getBoughtPrice(), 0.01);
    }

    @Test
    public void getPriceItemWillBeSoldFor() {
        assertEquals(20.00, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5.00, sheetMusic.calculateMarkup(), 0.01);
    }
}
