package sdlcgame;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    VisualNovel visualNovel;
    protected String nameValue;
    private Main main = new Main();

    @FXML
    private TextField nameLabel;


    @Override
    public void initialize(URL fxmlLocation, ResourceBundle resources){

    }

    public void handleStartButton() throws IOException {

        nameValue = nameLabel.getText();
        System.out.println(nameValue);
        if (nameValue.isEmpty()) {
            System.out.println("Object not created");
        } else {

            System.out.println("VisualNovel Object is created, player name is: " + nameValue);
        }
        main.showSecondScene();

    }
}
