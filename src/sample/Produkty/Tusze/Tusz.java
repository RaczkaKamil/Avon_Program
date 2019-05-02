package sample.Produkty.Tusze;

public class Tusz {
    Object rodzaj;
    int ilosc;
    public Tusz(Object rodzaj, int ilosc) {
        this.rodzaj = rodzaj;
        this.ilosc = ilosc;
    }

    public Object getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj( Object rodzaj ) {
        this.rodzaj = rodzaj;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc( int ilosc ) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return " \n"  + rodzaj + ", ilosc: " + ilosc + "szt"
                ;
    }
}
