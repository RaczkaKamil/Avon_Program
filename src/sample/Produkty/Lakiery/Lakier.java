package sample.Produkty.Lakiery;


public class Lakier {

    Object rodzaj;
    Object kolor;
    int ilosc;
    public Lakier(Object rodzaj, Object kolor, int ilosc) {
        this.rodzaj = rodzaj;
        this.kolor=kolor;
        this.ilosc = ilosc;

    }

    public Object getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj( Object rodzaj ) {
        this.rodzaj = rodzaj;
    }

    public Object getKolor() {
        return kolor;
    }

    public void setKolor( Object kolor ) {
        this.kolor = kolor;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc( int ilosc ) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return " \n"  + rodzaj + " "+kolor+", ilosc: " + ilosc + "szt"
                ;
    }
}
