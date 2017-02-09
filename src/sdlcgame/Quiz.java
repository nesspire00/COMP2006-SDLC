/**
 * ************* TODO
 * ASSIGN THE ANSWERID
 */
package sdlcgame;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Thomas Rollins
 */
public class Quiz {
    private ArrayList<Questions> questionPool;
    private final int POOL_SIZE = 25; //assumes 5 questions per stage in Questions.java
    public int idStartPoint;
    private Questions nextQuestion;
    private String quesiton, answer;
    int quizScore = 0;
    String[][] answerPool;

    public Quiz() {
        questionPool = new ArrayList<>();
        idStartPoint = 0;

        for (int i = idStartPoint; i < POOL_SIZE - idStartPoint; i++) {
            Questions newQuestion = new Questions(i);
            questionPool.add(newQuestion);
        }

    }

    public String startQuizGUI() {
        final int NUMBER_OF_QUESTIONS = 5; // currently set to 5 for testing


        pullNextQuestion();
        String answerPool[][] = new String[4][2];
        this.answerPool = answerPool;
        for (int j = 0; j < 3; j++) {
            answerPool[j][0] = pullAltAnswers(nextQuestion.getAltAnswers());
            answerPool[j][1] = "";
        }
        answerPool[3][0] = nextQuestion.getAnswerContent();
        answerPool[3][1] = "true";

        shuffleArray(answerPool);

        return pullQuestion() + "\n1: " + answerPool[0][0] + " \n2: " + answerPool[1][0] + "\n3: " + answerPool[2][0] + "\n4: " + answerPool[3][0];
    }


    /**
     * shuffles the questionPool and starts the quiz and pulls the questions
     * (1-by-1) from the questionPool
     * <p>
     * currently does not implement the answer ID or randomize the positions of the alt
     * answers and the actual answer. assumes the correct answer is always the first.
     * Most of the output is for testing only.
     */


    public void shuffleArray(String[][] array) {
        SecureRandom rng = new SecureRandom();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rng.nextInt(4);
            String temp[] = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    /**
     * returns the quiz as a string
     *
     * @return
     */
    @Override
    public String toString() {
        String quizString = "";
        for (Questions question : questionPool) {
            quizString += question.toString() + "\n";
        }
        return quizString;
    }

    /**
     * randomly assorts the questions within the questionPool.
     *
     * @param arrayList
     */
    private void shuffle(ArrayList arrayList) {
        Collections.shuffle(arrayList);
    }

    /**
     * pulls the next question from questionPool and removes from Pool.
     * assigns all relevant info from Question to local variables to be pulled
     * by the UI
     */
    private void pullNextQuestion() {
        nextQuestion = questionPool.get(0);
//        ArrayList<String> altAnswers = new ArrayList<>();
//        altAnswers = nextQuestion.getAltAnswers();

        // assign outputs to UI before removing from quetionPool
        questionPool.remove(0);
    }

    public String pullQuestion() {
        String question;

        question = nextQuestion.getQuestionContent();
        return question;
    }

    public String pullAnswer() {
        String answer;

        answer = nextQuestion.getAnswerContent();
        return answer;
    }

    /**
     * returns the first alt answer from the arrayList
     * must be called in a loop.
     *
     * @param altAnswers
     * @return
     */
    public String pullAltAnswers(ArrayList<String> altAnswers) {
        String altAnswer = altAnswers.get(0);
        altAnswers.remove(0);
        return altAnswer;
    }
}
