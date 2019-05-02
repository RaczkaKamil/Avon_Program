package sample.Produkty.Perfumy;

public class Perfuma {
    Object rodzaj;
    int ilosc;

    public Perfuma(Object rodzaj, int ilosc) {
            this.rodzaj = rodzaj;
            this.ilosc = ilosc;
    }

    public Object getRodzaj() {
        return rodzaj;
    }

    public void setIlosc( int ilosc ) {
        this.ilosc = ilosc;
    }

    public int getIlosc() {
        return ilosc;
    }

    @Override
    public String toString() {
        return " \n"  + rodzaj + ", ilosc: " + ilosc + "szt"
                ;
    }
}
