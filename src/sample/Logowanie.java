package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.LogowanieLista.LogowanieList;


import java.io.IOException;



public class Logowanie {

    @FXML
    TextField login;
    @FXML
    PasswordField haslo;

    public void Logowanie( ActionEvent event) throws IOException {

        LogowanieList logList= new LogowanieList();
            if(logList.Access(login.getText(),haslo.getText())==true)
            {
                Parent root = FXMLLoader.load(getClass().getResource("System.fxml"));
                Scene tabScene = new Scene(root,1200,900);

                Stage windows = (Stage) ((Node) event.getSource()).getScene().getWindow();
                windows.setScene(tabScene);
                windows.setX(400);
                windows.setY(50);
                windows.show();
            }


            else {
                System.out.println("Zle haslo!");
            }



    }

    public void Logowanie2( ActionEvent event) throws IOException {


            Parent root = FXMLLoader.load(getClass().getResource("System.fxml"));
            Scene tabScene = new Scene(root,1200,900);

            Stage windows = (Stage) ((Node) event.getSource()).getScene().getWindow();
            windows.setScene(tabScene);
            windows.setX(400);
            windows.setY(50);
            windows.show();
        }



}
