package sample.Lakiery;



import sample.Lakiery.Lakier;

import java.util.ArrayList;
import java.util.List;

public class LakierIlosc {
    private List<Lakier> lakierilosc;

    public LakierIlosc()
    {
        lakierilosc = new ArrayList<>();
    }

    public void Addlak(Lakier lakier) {

        lakierilosc.add(lakier);
    }

    public List<Lakier> getLakierIlosc() {


        return lakierilosc;
    }
}
