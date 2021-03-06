package edu.poniperro.gildedrose.domain;

public final class Item {

    public String name;
    public int sellIn;
    public int quality;

    public Item (String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public double getSell_in() {
        return sellIn;
    }

    public String getName() {
        return name;
    }

    public double getQuality() {
        return quality;
    }
}