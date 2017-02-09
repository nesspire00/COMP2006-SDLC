/*
 * 
 */
package sdlcgame;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Thomas Rollins
 */
public class VisualNovel {

    private String playerName;
    int dialogueIndex;
    private ArrayList<String> dialogueLines;
    private Main main = new Main();

    public VisualNovel(String name) {
        fillDialogue();
        playerName = name;
        dialogueIndex = 0;
    }

    /**
     * Fills the dialogue array
     */
    private void fillDialogue() {
        dialogueLines = new ArrayList<>();
        dialogueLines.add("Hello, my name is John Doe. I`m a Systems Analyst of the company 'Ab Intra'.");
        dialogueLines.add("Today we are going to start a new project - an educational computer game.");
        dialogueLines.add("The purpose of this game will be to help students who get stuck with the math.");
        dialogueLines.add("The game has few levels of difficulty. So, you can start from the beginning and move through the math with fun, by solving different kind of problems. ");
        dialogueLines.add("So, join our team and let`s start!");

        // PARA 2

        dialogueLines.add("Do you know about the SDLC? I`ll explain it to you. ");
        dialogueLines.add("System Development Life Cycle is a process to Plan, Analyze, Design, Implement and Support an information system.");
        dialogueLines.add("During the work on our game, you will be able to observe all stages.");
        dialogueLines.add("I will give you key points of each stage, so you can use it in any project you want, steps will be the same.");
        dialogueLines.add("We will start from Planning.");

        // STAGE 1 - PLANNING

        dialogueLines.add("The purpose of this stage is to perform a preliminary investigation to evaluate an opportunity or problem.");
        dialogueLines.add("1) Define a problem in the IS (with a help of request to the IT department (system request))");
        dialogueLines.add("2) Feasibility study (review anticipated costs, benefits and recommends a course of action based on different factors)");
        dialogueLines.add("3) Propose alternative solutions (to leave the system as is, improve it, or develop a new system)");
        dialogueLines.add("4) Develop a schedule ");
        dialogueLines.add("5) Develop a resource plan");
        dialogueLines.add("6) Develop a budget");

        //Dialogue line 17
        dialogueLines.add("(SOME WORDS BFORE THE QUIZ ON STAGE 1 STARTS)");

        // GAME ENTERS STAGE 1 QUIZ

        // STAGE 2 - ANALYZING

        dialogueLines.add(""); // Dummy line 18

        dialogueLines.add("Great! I’m happy that you understand the main principle of planning. And now we can start the other important stage.");
        dialogueLines.add("Have you ever heard about analyzing? The purpose of this stage is to build a logical model of the new system.");
        dialogueLines.add("1) Understand the system (interviews, survey, document review, observation and sampling)");
        dialogueLines.add("2) Model requirements");
        dialogueLines.add("3) Prioritize requirements");
        dialogueLines.add("4) Generate and evaluate alternatives");
        dialogueLines.add("5) Review recommendations with management");
        dialogueLines.add("6) Create system requirements document");
        dialogueLines.add("(WORDS BEFORE QUIZ 2 STARTS");

        // GAME ENTERS STAGE 2 QUIZ

        // STAGE 3
        dialogueLines.add("Very good! I’m impressed your results! ");
        dialogueLines.add("Designing is another important stage in your program life cycle.");
        dialogueLines.add("At this point you will create a physical model that is satisfy all documents requirements for the system.");
        dialogueLines.add("1) Design the solution based on the previous stages");
        dialogueLines.add("2) Design the application architecture");
        dialogueLines.add("3) Design the user interphase");
        dialogueLines.add("4) Identify necessary outputs, inputs, and processes");
        dialogueLines.add("5) Design system interfaces");
        dialogueLines.add("6) Design and integrate the DB");
        dialogueLines.add("7) Prototype for design details as required");
        dialogueLines.add("8) Design system controls");

        //QUIZ STAGE 3

        //STAGE 4
        dialogueLines.add("Wow! Your results are remarkable! You move forward really fast! ");
        dialogueLines.add("The next stage is Implementation.");
        dialogueLines.add("Here you will construct a new system, deliver a completely functioning and documented information system. Are you excited about it?");
        dialogueLines.add("1) Construct Software components");
        dialogueLines.add("2) Test the system");
        dialogueLines.add("3) Create documentation");
        dialogueLines.add("4) Perform any necessary modifications");
        dialogueLines.add("5) Evaluate the system");
        dialogueLines.add("6) Install the system and make it live");

        //QUIZ 4

        //STAGE 5
        dialogueLines.add("You are really good at it! My congratulations! Your project is almost done!");
        dialogueLines.add("There is only last step – Support and security. ");
        dialogueLines.add(". The purpose of this stage is to maintain, enhance, and protect the system, maximize return on the IT investment.");
        dialogueLines.add("1) Correct errors");
        dialogueLines.add("2) Adapt to changes in the environment");
    }

    /**
     * Set's the player name
     * add validation with the UI to prevent an empty string.
     *
     * @return
     */

    public String advance() throws IOException {
        dialogueIndex++;
        System.out.println(dialogueIndex);

        if (dialogueIndex == 18)
            main.startQuizStage1();


        if (dialogueIndex == 28) {
            main.startQuizStage2();
        } else
            return dialogueLines.get(dialogueIndex);
        return null;
    }
}
