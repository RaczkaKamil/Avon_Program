package sample.Tusze;

import java.util.ArrayList;
import java.util.List;

public class TuszList {
    private List<String> tuszlista;

    public TuszList(){
        tuszlista = new ArrayList<>();

        tuszlista.add( "Wydłużający");
        tuszlista.add( "Koloryzujący");
        tuszlista.add( "Pogrubiający");

    }



    public List<String> getTuszlista() {
        return tuszlista;
    }
}