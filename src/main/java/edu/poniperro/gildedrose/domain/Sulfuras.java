package edu.poniperro.gildedrose.domain;

import edu.poniperro.gildedrose.domain.NormalItem;

public class Sulfuras extends NormalItem {

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {}

}