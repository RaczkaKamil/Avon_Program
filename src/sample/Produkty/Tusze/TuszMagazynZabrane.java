package sample.Produkty.Tusze;


import java.util.ArrayList;
import java.util.List;

public class TuszMagazynZabrane {
    private List<Tusz> tuszMagazynZabrane;

    public TuszMagazynZabrane()
    {
        tuszMagazynZabrane = new ArrayList<>();
    }

    public void porownajMagazynZabrane( Tusz perf) {

        int i = 0;

        for (Tusz per : tuszMagazynZabrane) {
            if (per.getRodzaj().equals(perf.getRodzaj())) {
                tuszMagazynZabrane.remove(per);
                tuszMagazynZabrane.add(perf);
                i++;
            }
        }

        if (i==0)
        {
            tuszMagazynZabrane.add(perf);
        }



    }

    public List<Tusz> getTuszMagazynZabrane()
    {


        return tuszMagazynZabrane;
    }

}

