package sample.Kremy;


public class Krem {

    Object rodzaj;
    Object wiek;
    int ilosc;

    public Krem(Object rodzaj, Object wiek, int ilosc) {
        this.rodzaj = rodzaj;
        this.wiek=wiek;
        this.ilosc = ilosc;

    }

    @Override
    public String toString() {
        return " \n"  + rodzaj + " "+wiek+", ilosc: " + ilosc + "szt"
                ;
    }
}
