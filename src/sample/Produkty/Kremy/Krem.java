package sample.Produkty.Kremy;


public class Krem {

    public int ilosc;
    Object rodzaj;
    Object wiek;


    public Krem(Object rodzaj, Object wiek, int ilosc) {
        this.rodzaj = rodzaj;
        this.wiek=wiek;
        this.ilosc = ilosc;

    }

    public Object getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj( Object rodzaj ) {
        this.rodzaj = rodzaj;
    }

    public Object getWiek() {
        return wiek;
    }

    public void setWiek( Object wiek ) {
        this.wiek = wiek;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc( int ilosc ) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return " \n"  + rodzaj + " "+wiek+", ilosc: " + ilosc + "szt"
                ;
    }
}
