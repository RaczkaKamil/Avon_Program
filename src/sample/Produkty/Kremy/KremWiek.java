package sample.Produkty.Kremy;

import java.util.ArrayList;
import java.util.List;

public class KremWiek {
    private List<String> kremwiek;
    public KremWiek()
    {
        kremwiek = new ArrayList<>();
        kremwiek.add( "20+");
        kremwiek.add( "40+");
        kremwiek.add( "60+");
    }
    public List<String> getKremwiek() {
        return kremwiek;
    }
}

