package sample.Produkty.Lakiery;



import java.util.ArrayList;
import java.util.List;

public class LakierIlosc {
    private List<Lakier> lakierilosc;

    public LakierIlosc()
    {
        lakierilosc = new ArrayList<>();
    }

    public void Addlak(Lakier lakier) {
        int i = 0;
        for (Lakier per : lakierilosc) {

            if (per.getRodzaj().equals(lakier.getRodzaj())&& per.getKolor().equals(lakier.getKolor())){
                per.setIlosc(per.ilosc + lakier.ilosc);
                i++;
            }

        }
        if (i == 0) {
            lakierilosc.add(lakier);
        }

    }

    public List<Lakier> getLakierIlosc() {


        return lakierilosc;
    }
}
