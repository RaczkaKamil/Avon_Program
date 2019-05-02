package sample.Produkty.Kremy;


import java.util.ArrayList;
import java.util.List;

public class KremMagazynZabrane {
    private List<Krem> kremMagazynZabrane;

    public KremMagazynZabrane() {
        kremMagazynZabrane = new ArrayList<>();
    }

    public void porownajMagazynZabrane( Krem laki ) {
        int i = 0;
        for (Krem per : kremMagazynZabrane) {
            if (per.getRodzaj().equals(laki.getRodzaj())) {
                kremMagazynZabrane.remove(per);
                kremMagazynZabrane.add(laki);
                i++;
            }
        }

        if (i == 0) {
            kremMagazynZabrane.add(laki);
        }


    }

    public List<Krem> getKremMagazynZabrane() {

        return kremMagazynZabrane;
    }


}

