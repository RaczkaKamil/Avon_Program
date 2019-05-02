package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import sample.Produkty.Kremy.*;
import sample.Produkty.Lakiery.*;
import sample.Produkty.Perfumy.Perfuma;
import sample.Produkty.Perfumy.PerfumaIlosc;
import sample.Produkty.Perfumy.PerfumaList;
import sample.Produkty.Perfumy.PerfumaMagazyn;
import sample.Produkty.Tusze.Tusz;
import sample.Produkty.Tusze.TuszIlosc;
import sample.Produkty.Tusze.TuszList;
import sample.Produkty.Tusze.TuszMagazyn;

import java.io.IOException;

public class SystemController {
    @FXML
    ComboBox<String> Perfuma_Rodzaj;
    @FXML
    ComboBox<String> Lakier_Rodzaj;
    @FXML
    ComboBox<String> Lakier_Kolor;
    @FXML
    ComboBox<String> Krem_Rodzaj;
    @FXML
    ComboBox<String> Krem_Wiek;
    @FXML
    ComboBox<String> Tusz_Rodzaj;
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
    ChoiceBox Perfuma_Choice;

    @FXML
    TextArea Area1;
    @FXML
    TextArea Area2;


    PerfumaList perfList = new PerfumaList();
    PerfumaIlosc perfIlosc = new PerfumaIlosc();
    LakierList laklist = new LakierList();
    LakierKolor lakkolor = new LakierKolor();
    LakierIlosc lakIlosc = new LakierIlosc();
    KremList kremlist = new KremList();
    KremWiek kremwiek = new KremWiek();
    KremIlosc kremIlosc = new KremIlosc();
    TuszList tuszList = new TuszList();
    TuszIlosc tuszIlosc = new TuszIlosc();
    PerfumaMagazyn perfmagazyn = new PerfumaMagazyn();
    LakierMagazyn lakmagazyn = new LakierMagazyn();
    KremMagazyn kremmagayzn = new KremMagazyn();
    TuszMagazyn tuszmagazyn = new TuszMagazyn();


    public void initialize() {
        Perfuma_Rodzaj();
        Lakier_Rodzaj();
        Lakier_Kolor();
        Krem_Rodzaj();
        Krem_Wiek();
        Tusz_Rodzaj();

    }


    public void Perfuma_Rodzaj() {
        Perfuma_Rodzaj.getItems().addAll(perfList.getPerfumalist());
    }

    private void Lakier_Rodzaj() {
        Lakier_Rodzaj.getItems().addAll(laklist.getLakierlist());
    }

    private void Lakier_Kolor() {
        Lakier_Kolor.getItems().addAll(lakkolor.getLakierkolor());
    }

    private void Krem_Rodzaj() {
        Krem_Rodzaj.getItems().addAll(kremlist.getKremlist());
    }

    private void Krem_Wiek() {
        Krem_Wiek.getItems().addAll(kremwiek.getKremwiek());
    }

    private void Tusz_Rodzaj() {
        Tusz_Rodzaj.getItems().addAll(tuszList.getTuszlista());
    }


    public void P_AKCEPTACJA() {
        int perfilosc = Integer.parseInt(Perfuma_ilosc.getText());
        Perfuma per = new Perfuma(Perfuma_Rodzaj.getSelectionModel().getSelectedItem(), perfilosc);
        perfIlosc.AddPerf(per);

        perfmagazyn.porownajMagazyn(per);
        showAc();
    }

    public void L_AKCEPTACJA() {
        int lakilosc = Integer.parseInt(Lakier_ilosc.getText());
        Lakier lak = new Lakier(Lakier_Rodzaj.getSelectionModel().getSelectedItem(), Lakier_Kolor.getSelectionModel().getSelectedItem(), lakilosc);
        lakIlosc.Addlak(lak);

        lakmagazyn.porownajMagazyn(lak);
        showAc();
    }

    public void K_AKCEPTACJA() {
        int kremilosc = Integer.parseInt(Krem_ilosc.getText());
        Krem kre = new Krem(Krem_Rodzaj.getSelectionModel().getSelectedItem(), Krem_Wiek.getSelectionModel().getSelectedItem(), kremilosc);
        kremIlosc.Addkrem(kre);

        kremmagayzn.porownajMagazyn(kre);
        showAc();

    }

    public void T_AKCEPTACJA() {
        int tuszilosc = Integer.parseInt(Tusz_ilosc.getText());
        Tusz tusz = new Tusz(Tusz_Rodzaj.getSelectionModel().getSelectedItem(), tuszilosc);
        tuszIlosc.AddTusz(tusz);

        tuszmagazyn.porownajMagazyn(tusz);
        showAc();

    }

    public void showAc() {


        Area1.setText("Perfumy: " + perfIlosc.getPerfumaIlosc().toString().substring(1).replace("]", "") + "\n" + "\n" +
                "Lakiery: " + lakIlosc.getLakierIlosc().toString().substring(1).replace("]", "") + "\n" + "\n" +
                "Kremy: " + kremIlosc.getKremIlosc().toString().substring(1).replace("]", "") + "\n" + "\n" +
                "Tusz: " + tuszIlosc.getTuszIlosc().toString().substring(1).replace("]", "") + "\n" + "\n");


        Area2.setText("Perfumy: " + perfmagazyn.getPerfumaMagazynZabrane().toString().substring(1).replace("]", "") + "\n" + "\n" +
                "Lakiery: " + lakmagazyn.getLakierMagazynZabrane().toString().substring(1).replace("]", "") + "\n" + "\n" +
                "Kremy: " + kremmagayzn.getKremMagazynZabrane().toString().substring(1).replace("]", "") + "\n" + "\n" +
                "Tusze: " + tuszmagazyn.getTuszMagazynZabrane().toString().substring(1).replace("]", "") + "\n" + "\n");

    }

    public void Magazyn( ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("Magazyn.fxml"));
        Scene tabScene = new Scene(root,1200,900);

        Stage windows = (Stage) ((Node) event.getSource()).getScene().getWindow();
        windows.setScene(tabScene);
        windows.setX(400);
        windows.setY(50);
        windows.show();
    }


}
