package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int broj = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl a) {
        if (broj < 50) {
            artikli[broj] = new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
            broj=broj+1;
        return true;
        }
        return false;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=0; i< broj; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl novi = artikli[i];
                artikli[i]=null;
                for(int j=i; j< broj-1; j++) {
                    artikli[j]=artikli[j+1];
                }
                broj--;
                return  novi;
            }
        }
        return null;

    }




}
