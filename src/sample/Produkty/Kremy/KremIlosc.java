package sample.Produkty.Kremy;




import java.util.ArrayList;
import java.util.List;

public class KremIlosc {
    private List<Krem> kremilosc;

    public KremIlosc()
    {
        kremilosc = new ArrayList<>();
    }

    public void Addkrem(Krem krem) {

        int i = 0;
        for (Krem per : kremilosc) {

            if (per.getRodzaj().equals(krem.getRodzaj()) && per.getWiek().equals(krem.getWiek())) {
                per.setIlosc(per.ilosc + krem.ilosc);
                i++;
            }

        }
        if (i == 0) {
            kremilosc.add(krem);
        }
    }


        public List<Krem> getKremIlosc() {


        return kremilosc;
    }
}
