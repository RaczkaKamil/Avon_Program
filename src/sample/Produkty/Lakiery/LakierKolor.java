package sample.Produkty.Lakiery;

import java.util.ArrayList;
import java.util.List;

public class LakierKolor {
    private List<String> lakierkolor;
public LakierKolor()
{
    lakierkolor = new ArrayList<>();
    lakierkolor.add( "Biały");
    lakierkolor.add( "Czarny");
    lakierkolor.add( "Czerwony");
}
    public List<String> getLakierkolor() {
        return lakierkolor;
    }
}

