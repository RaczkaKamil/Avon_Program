package sample.Perfumy;

public class Perfuma {
    Object rodzaj;
    int ilosc;
    public Perfuma(Object rodzaj, int ilosc) {
            this.rodzaj = rodzaj;
            this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return " \n"  + rodzaj + ", ilosc: " + ilosc + "szt"
                ;
    }
}
