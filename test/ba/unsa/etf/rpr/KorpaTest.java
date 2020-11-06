package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
class KorpaTest {

    @Test
    void ogranicenjeBrojaArtikala() {
        Korpa kosara= new Korpa();
        kosara.setBroj(50);
        Artikl objekat = new Artikl( "Knjiga", 5, "7");
        assertFalse(kosara.dodajArtikl(objekat));
    }

    @Test
    void testiraIzbaciArtiklSaKodom() {
        Korpa kosara=new Korpa();
        Artikl jabuke= new Artikl("Jabuke", 2, "559");
        Artikl cokolada=new Artikl("Cokolada", 2, "47");
        kosara.dodajArtikl(jabuke);
        kosara.dodajArtikl(cokolada);
        kosara.izbaciArtiklSaKodom("559");
        assertEquals(1, kosara.getBroj());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa kosara=new Korpa();
        Artikl cokolada=new Artikl("cokolada", 2, "47");
        assertEquals(2, kosara.dajUkupnuCijenuArtikala());

    }
}