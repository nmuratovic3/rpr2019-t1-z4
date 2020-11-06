package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl cokolada = new Artikl("cokolada", 5, "567");
        assertEquals("cokolada", cokolada.getNaziv());

    }

    @Test
    void getCijena() {
        Artikl cokolada = new Artikl("cokolada", 5, "567");
        assertEquals(5, cokolada.getCijena());
    }


    @Test
    void getKod() {
        Artikl cokolada = new Artikl("cokolada", 5, "567");
        assertEquals("567", cokolada.getKod());
    }
}