package sample.Produkty.Tusze;


import java.util.ArrayList;
import java.util.List;

public class TuszIlosc {
    private List<Tusz> tuszIlosc;

    public TuszIlosc(){
        tuszIlosc = new ArrayList<>();

    }

    public void AddTusz(Tusz tusz) {
        int i = 0;
        for (Tusz per : tuszIlosc) {

            if (per.getRodzaj().equals(tusz.getRodzaj())) {
                per.setIlosc(per.ilosc + tusz.ilosc);
                i++;
            }

        }
        if (i == 0) {
            tuszIlosc.add(tusz);
        }
    }



    public List<Tusz> getTuszIlosc() {


        return tuszIlosc;
    }
}
