package sample.Lakiery;


public class Lakier {

    Object rodzaj;
    Object kolor;
    int ilosc;
    public Lakier(Object rodzaj, Object kolor, int ilosc) {
        this.rodzaj = rodzaj;
        this.kolor=kolor;
        this.ilosc = ilosc;

    }

    @Override
    public String toString() {
        return " \n"  + rodzaj + " "+kolor+", ilosc: " + ilosc + "szt"
                ;
    }
}
