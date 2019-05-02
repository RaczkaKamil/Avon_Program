package sample.Produkty.Lakiery;

import java.util.ArrayList;
import java.util.List;

public class LakierMagazyn {
    private List<Lakier> lakierMagazyn;
LakierMagazynZabrane lakzabrane = new LakierMagazynZabrane();
    public LakierMagazyn(){
        lakierMagazyn = new ArrayList<>();
        lakierMagazyn.add(new Lakier("Nabłyszczający","Biały", 100));
        lakierMagazyn.add(new Lakier("Nabłyszczający","Czarny", 100));
        lakierMagazyn.add(new Lakier("Nabłyszczający","Czerwony", 100));

        lakierMagazyn.add(new Lakier("Wygładzający","Biały", 100));
        lakierMagazyn.add(new Lakier("Wygładzający","Czarny", 100));
        lakierMagazyn.add(new Lakier("Wygładzający","Czerwony", 100));

        lakierMagazyn.add(new Lakier("Żelowy","Biały", 100));
        lakierMagazyn.add(new Lakier("Żelowy","Czarny", 100));
        lakierMagazyn.add(new Lakier("Żelowy","Czerwony", 100));


    }

    public void  porownajMagazyn(Lakier laki) {

        for (Lakier per : lakierMagazyn) {

            if (per.getKolor().equals(laki.getKolor()) && per.getRodzaj().equals(laki.getRodzaj())) {
                per.setIlosc(per.ilosc - laki.ilosc);
                lakzabrane.porownajMagazynZabrane(per);
            }
        }
    }


    public List<Lakier> getLakierMagazyn() {

        return lakierMagazyn;
    }

    public List<Lakier> getLakierMagazynZabrane() {


        return lakzabrane.getPerfumaIloscZabrane();
    }

}
