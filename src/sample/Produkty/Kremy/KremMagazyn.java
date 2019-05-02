package sample.Produkty.Kremy;

import java.util.ArrayList;
import java.util.List;

public class KremMagazyn {
    private List<Krem> kremMagazyn;

    KremMagazynZabrane kremzabrane = new KremMagazynZabrane();

    public KremMagazyn(){
        kremMagazyn = new ArrayList<>();
        kremMagazyn.add(new Krem("Nawilżający","20+", 100));
        kremMagazyn.add(new Krem("Nawilżający","40++", 100));
        kremMagazyn.add(new Krem("Nawilżający","60+", 100));

        kremMagazyn.add(new Krem("Ujędrniający","20+", 100));
        kremMagazyn.add(new Krem("Ujędrniający","40+", 100));
        kremMagazyn.add(new Krem("Ujędrniający","60+", 100));

        kremMagazyn.add(new Krem("Matujący","20+", 100));
        kremMagazyn.add(new Krem("Matujący","40++", 100));
        kremMagazyn.add(new Krem("Matujący","60+", 100));


    }

    public void  porownajMagazyn(Krem laki) {

        for (Krem per : kremMagazyn) {

            if (per.getWiek().equals(laki.getWiek()) && per.getRodzaj().equals(laki.getRodzaj())) {
                per.setIlosc(per.ilosc - laki.ilosc);
                kremzabrane.porownajMagazynZabrane(per);
            }
        }
    }


    public List<Krem> getKremMagazyn() {

        return kremMagazyn;
    }

    public List<Krem> getKremMagazynZabrane() {


        return kremzabrane.getKremMagazynZabrane();
    }

}
