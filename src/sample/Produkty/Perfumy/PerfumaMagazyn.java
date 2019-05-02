package sample.Produkty.Perfumy;

import java.util.ArrayList;
import java.util.List;

public class PerfumaMagazyn {
    private List<Perfuma> perfumaMagazyn;
    PerfumaMagazynZabrane perfZabrane = new PerfumaMagazynZabrane();

    public PerfumaMagazyn(){
        perfumaMagazyn = new ArrayList<>();
        perfumaMagazyn.add(new Perfuma("Avon",100));
        perfumaMagazyn.add(new Perfuma("Adidas",100));
        perfumaMagazyn.add(new Perfuma("Nelson",100));
    }


    public void  porownajMagazyn(Perfuma perf) {

        for (Perfuma per : perfumaMagazyn) {
            if (per.getRodzaj().equals(perf.getRodzaj())) {
                per.setIlosc(per.ilosc - perf.ilosc);
                perfZabrane.porownajMagazynZabrane(per);
            }
        }
    }
    public List<Perfuma> getPerfumaMagazyn() {


        return perfumaMagazyn;
    }

    public List<Perfuma> getPerfumaMagazynZabrane() {


        return perfZabrane.getPerfumaIloscZabrane();
    }

}