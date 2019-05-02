package sample.Produkty.Perfumy;

import java.util.ArrayList;
import java.util.List;

public class PerfumaList {
   private List<String> perfumalist;

public PerfumaList(){
    perfumalist = new ArrayList<>();

    perfumalist.add( "Avon");
    perfumalist.add( "Adidas");
    perfumalist.add( "Nelson");

}



    public List<String> getPerfumalist() {
        return perfumalist;
    }
}