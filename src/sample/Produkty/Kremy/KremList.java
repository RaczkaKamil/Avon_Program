package sample.Produkty.Kremy;

import java.util.ArrayList;
import java.util.List;

public class KremList {
    private List<String> kremlist;

    public KremList(){
        kremlist = new ArrayList<>();

        kremlist.add( "Nawilżający");
        kremlist.add( "Ujędrniający");
        kremlist.add( "Matujący");
    }
    public List<String> getKremlist() {
        return kremlist;
    }

}

