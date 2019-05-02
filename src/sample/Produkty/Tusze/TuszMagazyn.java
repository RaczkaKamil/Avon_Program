package sample.Produkty.Tusze;


import java.util.ArrayList;
import java.util.List;

public class TuszMagazyn {
    private List<Tusz> tuszMagazyn;

    TuszMagazynZabrane tuszZabrane = new TuszMagazynZabrane();

    public TuszMagazyn(){
        tuszMagazyn = new ArrayList<>();
        tuszMagazyn.add(new Tusz("Wydłużający",100));
        tuszMagazyn.add(new Tusz("Koloryzujący",100));
        tuszMagazyn.add(new Tusz("Pogrubiający",100));
    }


    public void  porownajMagazyn(Tusz perf) {

        for (Tusz per : tuszMagazyn) {
            if (per.getRodzaj().equals(perf.getRodzaj())) {
                per.setIlosc(per.ilosc - perf.ilosc);
                tuszZabrane.porownajMagazynZabrane(per);
            }
        }
    }
    public List<Tusz> getPerfumaMagazyn() {


        return tuszMagazyn;
    }

    public List<Tusz> getTuszMagazynZabrane() {


        return tuszZabrane.getTuszMagazynZabrane();
    }

}