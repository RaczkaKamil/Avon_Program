package sample.Kremy;




import sample.Kremy.Krem;

import java.util.ArrayList;
import java.util.List;

public class KremIlosc {
    private List<Krem> kremilosc;

    public KremIlosc()
    {
        kremilosc = new ArrayList<>();
    }

    public void Addkrem(Krem krem) {

        kremilosc.add(krem);
    }

    public List<Krem> getKremIlosc() {


        return kremilosc;
    }
}
