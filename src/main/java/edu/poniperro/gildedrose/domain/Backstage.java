package edu.poniperro.gildedrose.domain;

public class Backstage extends NormalItem {
    public Backstage(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }
    @Override
    public void updateQuality() {
        int quality = getQuality();
        int sellIn = getSellIn();

        if (sellIn >= 10){
            setQuality(quality + 1);
        } else if (sellIn >= 5) {
            setQuality(quality + 2);
        } else if (sellIn >= 0) {
            setQuality(quality + 3);
        } else {
            setQuality(0);
        }
    }

    public double getSell_in() {
        return getSellIn();
    }
}
