package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.Kremy.Krem;
import sample.Kremy.KremIlosc;
import sample.Kremy.KremList;
import sample.Kremy.KremWiek;
import sample.Lakiery.Lakier;
import sample.Lakiery.LakierIlosc;
import sample.Lakiery.LakierKolor;
import sample.Lakiery.LakierList;
import sample.Perfumy.Perfuma;
import sample.Perfumy.PerfumaIlosc;
import sample.Perfumy.PerfumaList;
import sample.Tusze.Tusz;
import sample.Tusze.TuszIlosc;
import sample.Tusze.TuszList;

public class Controller {
    @FXML
    ComboBox Perfuma_Rodzaj;
    @FXML
    ComboBox Lakier_Rodzaj;
    @FXML
    ComboBox Lakier_Kolor;
    @FXML
    ComboBox Krem_Rodzaj;
    @FXML
    ComboBox Krem_Wiek;
    @FXML
    ComboBox Tusz_Rodzaj;
    @FXML
    Button Perfuma_Akceptacja;
    @FXML
    Button Lakier_Akceptacja;
    @FXML
    Button Krem_Akceptacja;
    @FXML
    Button Tusz_Akceptacja;
    @FXML
    TextField Perfuma_ilosc;
    @FXML
    TextField Lakier_ilosc;
    @FXML
    TextField Krem_ilosc;
    @FXML
    TextField Tusz_ilosc;

    @FXML
    TextArea Area1;


    PerfumaList perfList = new PerfumaList();
    PerfumaIlosc perfIlosc = new PerfumaIlosc();
    LakierList laklist = new LakierList();
    LakierKolor lakkolor = new LakierKolor();
    LakierIlosc lakIlosc = new LakierIlosc();
    KremList kremlist = new KremList();
    KremWiek kremwiek = new KremWiek();
    KremIlosc kremIlosc = new KremIlosc();
    TuszList tuszList = new TuszList();
    TuszIlosc tuszIlosc=new TuszIlosc();

    public void initialize() {
        Perfuma_Rodzaj();
        Lakier_Rodzaj();
        Lakier_Kolor();
        Krem_Rodzaj();
        Krem_Wiek();
        Tusz_Rodzaj();
    }

    private void Perfuma_Rodzaj() {
        Perfuma_Rodzaj.getItems().addAll(perfList.getPerfumalist());
    }

    private void Lakier_Rodzaj() { Lakier_Rodzaj.getItems().addAll(laklist.getLakierlist()); }

    private void Lakier_Kolor() {  Lakier_Kolor.getItems().addAll(lakkolor.getLakierkolor()); }

    private void Krem_Rodzaj() {Krem_Rodzaj.getItems().addAll(kremlist.getKremlist());}

    private void Krem_Wiek() {Krem_Wiek.getItems().addAll(kremwiek.getKremwiek());}

    private void Tusz_Rodzaj() {Tusz_Rodzaj.getItems().addAll(tuszList.getTuszlista());}



    public void P_AKCEPTACJA() {
        int perfilosc = Integer.parseInt(Perfuma_ilosc.getText());
        Perfuma per = new Perfuma(Perfuma_Rodzaj.getSelectionModel().getSelectedItem(), perfilosc);
        perfIlosc.AddPerf(per);
        showAc();

    }

    public void L_AKCEPTACJA() {
        int lakilosc = Integer.parseInt(Lakier_ilosc.getText());
        Lakier lak = new Lakier(Lakier_Rodzaj.getSelectionModel().getSelectedItem(), Lakier_Kolor.getSelectionModel().getSelectedItem(), lakilosc);
        lakIlosc.Addlak(lak);
        showAc();
    }

    public void K_AKCEPTACJA() {
        int kremilosc = Integer.parseInt(Krem_ilosc.getText());
        Krem kre = new Krem(Krem_Rodzaj.getSelectionModel().getSelectedItem(), Krem_Wiek.getSelectionModel().getSelectedItem(), kremilosc);
        kremIlosc.Addkrem(kre);
        showAc();

    }

    public void T_AKCEPTACJA() {
        int tuszilosc = Integer.parseInt(Tusz_ilosc.getText());
        Tusz tusz = new Tusz(Tusz_Rodzaj.getSelectionModel().getSelectedItem(), tuszilosc);
        tuszIlosc.AddTusz(tusz);
        showAc();

    }

    public void showAc() {
        Area1.setText("Perfumy: " + "\n" + perfIlosc.getPerfumaIlosc().toString() + "\n" + "\n" +
                "Lakiery: " + "\n" + lakIlosc.getLakierIlosc().toString() + "\n" + "\n"+
                "Kremy: " + "\n"+ kremIlosc.getKremIlosc().toString() + "\n" + "\n"+
                "Tusz: " + "\n" + tuszIlosc.getTuszIlosc().toString() + "\n" + "\n");

    }
}
