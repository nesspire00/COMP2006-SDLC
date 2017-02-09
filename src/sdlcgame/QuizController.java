package sdlcgame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Nikita on 2/08/17.
 */
public class QuizController implements Initializable {

    @FXML
    private RadioButton opt1;
    @FXML
    private RadioButton opt2;
    @FXML
    private RadioButton opt3;
    @FXML
    private RadioButton opt4;
    @FXML
    private Label questionText;
    private Quiz quiz = new Quiz();
    private int quizCounter;
    private Main main = new Main();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        questionText.setText(quiz.startQuizGUI());
        System.out.println(quiz.quizScore);
    }

    public void checkInput() throws IOException {
        int userAnswerID = 0;

        if (opt1.isSelected())
            userAnswerID = 1;
        if (opt2.isSelected())
            userAnswerID = 2;
        if (opt3.isSelected())
            userAnswerID = 3;
        if (opt4.isSelected())
            userAnswerID = 4;

        int correctAnswer = -1;
        for (int j = 0; j < 4; j++) {
            if (quiz.answerPool[j][1].equalsIgnoreCase("true"))
                correctAnswer = j + 1;
        }

        if (quiz.answerPool[userAnswerID - 1][1].equalsIgnoreCase("true")) {
            quiz.quizScore++;
            System.out.println("Question answered correctly");
        } else {
            System.out.println("Question answered incorrectly");
        }
        nextQuestion();
    }

    private void nextQuestion() throws IOException {
        if (quizCounter == 4)
            main.returnDialogue2();
        questionText.setText(quiz.startQuizGUI());
        quizCounter++;
    }

    public void quizStage2() {
        quiz.idStartPoint = 6;
        questionText.setText(quiz.startQuizGUI());
        System.out.println(quiz.quizScore);
    }
}