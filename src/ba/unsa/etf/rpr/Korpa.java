package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int broj = 0;

    public boolean dodajArtikl(Artikl a) {
        if (broj < 50) {
            artikli[broj] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            broj = broj + 1;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i = 0; i<broj; i++) {
            if(artikli[i].getKod().equals(kod)){
                Artikl novi = artikli[i];
                artikli[i]=null;
                for(int j = i; j < broj -1; j++){
                    artikli[j]=artikli[j+1];
                }
                broj--;
                return  novi;

            }
        }
        return  null;
    }
    public  int dajUkupnuCijaenuArtikala(){
        int cijena=0;
        for( int i=0; i<broj; i++){
            cijena=cijena+artikli[i].getCijena();
        }
        return cijena
    }
}
