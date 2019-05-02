package sample.Produkty.Perfumy;

import java.util.ArrayList;
import java.util.List;

public class PerfumaMagazynZabrane {
    private List<Perfuma> perfumaMagazynZabrane;

    public PerfumaMagazynZabrane()
    {
        perfumaMagazynZabrane = new ArrayList<>();
    }

    public void porownajMagazynZabrane( Perfuma perf) {

        int i = 0;
        for (Perfuma per : perfumaMagazynZabrane) {
            if (per.getRodzaj().equals(perf.getRodzaj())) {
                perfumaMagazynZabrane.remove(per);
                perfumaMagazynZabrane.add(perf);
               i++;
            }
        }

        if (i==0)
        {
            perfumaMagazynZabrane.add(perf);
        }



    }

    public List<Perfuma> getPerfumaIloscZabrane()
    {


        return perfumaMagazynZabrane;
    }

}

