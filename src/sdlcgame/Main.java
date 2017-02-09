package sdlcgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        Parent mainScreen = FXMLLoader.load(getClass().getResource("startPage.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(mainScreen, 970, 375));
        primaryStage.show();
    }

    public void showSecondScene() throws IOException {
        Parent dialogue = FXMLLoader.load(getClass().getResource("DialogueScreen.fxml"));

        if (window == null)
            System.out.print("The primary stage is null");
        window.setScene(new Scene(dialogue, 600, 400));
    }

    public void startQuizStage1() throws IOException {
        Parent quiz = FXMLLoader.load(getClass().getResource("QuizScreen.fxml"));
        window.setScene(new Scene(quiz, 790, 550));
    }
    public void startQuizStage2() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("QuizScreen.fxml"));
        GridPane layout = loader.load();
        QuizController controller = loader.getController();
        controller.quizStage2();

        Scene scene = new Scene(layout, 790, 550);
        window.setScene(scene);
    }

    public void returnDialogue2() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("DialogueScreen.fxml"));
        GridPane layout = loader.load();
        DialogueController controller = loader.getController();
        controller.dialogueStage2();

        Scene scene = new Scene(layout);
        window.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
