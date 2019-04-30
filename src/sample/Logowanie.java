package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Logowanie {

    public void Logowanie( ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene tabScene = new Scene(root,1200,900);


        Stage windows = (Stage) ((Node) event.getSource()).getScene().getWindow();
        windows.setScene(tabScene);
        windows.setX(250);
        windows.setY(50);
        windows.show();
    }
}
