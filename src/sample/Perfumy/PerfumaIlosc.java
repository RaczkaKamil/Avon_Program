package sample.Perfumy;

import sample.Perfumy.Perfuma;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerfumaIlosc {
    private List<Perfuma> perfumaIlosc;

    public PerfumaIlosc(){
        perfumaIlosc = new ArrayList<>();

    }

    public void AddPerf(Perfuma perfuma) {

            perfumaIlosc.add(perfuma);
    }



    public List<Perfuma> getPerfumaIlosc() {


        return perfumaIlosc;
    }
}
