package sample.Tusze;


import sample.Tusze.Tusz;

import java.util.ArrayList;
import java.util.List;

public class TuszIlosc {
    private List<Tusz> tuszIlosc;

    public TuszIlosc(){
        tuszIlosc = new ArrayList<>();

    }

    public void AddTusz(Tusz tusz) {

        tuszIlosc.add(tusz);
    }



    public List<Tusz> getTuszIlosc() {


        return tuszIlosc;
    }
}
