package sdlcgame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Nikita on 2/07/17.
 */
public class DialogueController implements Initializable{

    @FXML private Label name;
    @FXML public Label dialogueLabel;
    protected Controller controller = new Controller();
    protected VisualNovel visualNovel = new VisualNovel(controller.nameValue);
    private Main main = new Main();

    @Override
    public void initialize(URL fxmlLocation, ResourceBundle resources) {
        name.setText("John");
        dialogueLabel.setText("Hello, my name is John Doe. I`m a Systems Analyst of the company 'Ab Intra'.");
    }

    public void handleDialogueButtonPress() throws IOException {

        dialogueLabel.setText(visualNovel.advance());
    }

    public void dialogueStage2() throws IOException {
        visualNovel.dialogueIndex = 18;
        handleDialogueButtonPress();
    }
}
