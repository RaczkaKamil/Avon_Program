package sample.Lakiery;

import java.util.ArrayList;
import java.util.List;

public class LakierList {
    private List<String> lakierlist;

    public LakierList(){
        lakierlist = new ArrayList<>();

        lakierlist.add( "Nabłyszczający");
        lakierlist.add( "Wygładzający");
        lakierlist.add( "Żelowy");
    }
    public List<String> getLakierlist() {
        return lakierlist;
    }

}

