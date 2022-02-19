package edu.poniperro.gildedrose;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import edu.poniperro.gildedrose.domain.*;
import org.junit.Test;

public class TestGildedRose {
    @Test
    public void TestAgedBrie() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        assertEquals("Aged Brie", cheese.getName());
        assertEquals(2, cheese.getSell_in(), 0);
        assertEquals(0, cheese.getQuality(), 0);
    }

    @Test
    public void crearBackstage() {

        Backstage pass = new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", pass.getName());
        assertEquals(15, pass.getSell_in(), 0);
        assertEquals(20, pass.getQuality(), 0);
    }

    @Test
    public void TestItem() {

        Item item = new Item("+5 Dexterity Vest", 10, 20);

        assertEquals("+5 Dexterity Vest", item.getName());
        assertEquals(10, item.getSell_in(), 0);
        assertEquals(20, item.getQuality(), 0);
        System.out.println(item);
    }

    @Test
    public void TestNormalItem() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        assertEquals("+5 Dexterity Vest", normal.getName());
        assertEquals(10, normal.getSell_in(), 0);
        assertEquals(20, normal.getQuality(), 0);
    }
    @Test
    public void TestSulfuras() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        assertEquals("Sulfuras, Hand of Ragnaros", sulfuras.getName());
        assertEquals(0, sulfuras.getSell_in(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }
}
