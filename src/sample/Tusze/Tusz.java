package sample.Tusze;

public class Tusz {
    Object rodzaj;
    int ilosc;
    public Tusz(Object rodzaj, int ilosc) {
        this.rodzaj = rodzaj;
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return " \n"  + rodzaj + ", ilosc: " + ilosc + "szt"
                ;
    }
}
