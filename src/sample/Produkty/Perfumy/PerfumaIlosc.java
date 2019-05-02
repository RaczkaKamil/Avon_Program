package sample.Produkty.Perfumy;

import java.util.ArrayList;
import java.util.List;

public class PerfumaIlosc {
    private List<Perfuma> perfumaIlosc;

    public PerfumaIlosc() {
        perfumaIlosc = new ArrayList<>();

    }

    public void AddPerf( Perfuma perf ) {
        int i = 0;
        for (Perfuma per : perfumaIlosc) {

            if (per.getRodzaj().equals(perf.getRodzaj())) {
                per.setIlosc(per.ilosc + perf.ilosc);
                i++;
            }

        }
        if (i == 0) {
            perfumaIlosc.add(perf);
        }
    }


    public List<Perfuma> getPerfumaIlosc() {


        return perfumaIlosc;
    }
}
