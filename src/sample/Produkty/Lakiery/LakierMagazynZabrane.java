package sample.Produkty.Lakiery;

import java.util.ArrayList;
import java.util.List;

public class LakierMagazynZabrane {
    private List<Lakier> lakierMagazynZabrane;

    public LakierMagazynZabrane()
    {
        lakierMagazynZabrane = new ArrayList<>();
    }

    public void porownajMagazynZabrane( Lakier laki) {

        int i = 0;
        for (Lakier per : lakierMagazynZabrane) {
            if (per.getRodzaj().equals(laki.getRodzaj())) {
                lakierMagazynZabrane.remove(per);
                lakierMagazynZabrane.add(laki);
                i++;
            }
        }

        if (i==0)
        {
            lakierMagazynZabrane.add(laki);
        }



    }

    public List<Lakier> getPerfumaIloscZabrane()
    {

        return lakierMagazynZabrane;
    }


}

