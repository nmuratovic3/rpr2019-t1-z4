package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {



    @Test
    void dodajArtikl() {
        Supermarket market= new Supermarket();
        Artikl cips= new Artikl("cips", 1, "254");
        market.dodajArtikl(cips);
        assertEquals(1, market.getBroj());

    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket market= new Supermarket();
        Artikl cips= new Artikl("cips", 1, "254");
        market.dodajArtikl(cips);
        market.izbaciArtiklSaKodom("254");
        assertEquals(1, market.getBroj());
    }
}