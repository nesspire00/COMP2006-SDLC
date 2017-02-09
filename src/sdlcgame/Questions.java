/**
 ************************** AS OF 1PM 31-01-2017 ******************************
 * QUESITON.JAVA CLASS IS COMPLETE EXCEPT FOR ADDING THE SPESIFIC CONTENT 
 * (QUESTIONS AND ANSWERS). 
 * THE BASIC LOGIC IS AS FOLLOWS:
 * QUIZ.JAVA CLASS CALLS QUESTION.JAVA CLASS TO RETURN A QUESTION AND ANSWER
 * THE QUESTION IS DETERMINED BY THE ARGUMENTS OF THE StageID AND questionID.
 * 
 * ****************************  TODO  **********************************
 * - ADD THE ACTUAL QUESTIONS AND ANSEWRS IN THE getStage[X]Question() and
 * getStage[X]Answer(). AS WELL AS THE ALT-ANSWERS IN populateAltAnswers()
 */
package sdlcgame;

import java.util.ArrayList;

/**
 *
 * @author Thomas Rollins
 */
public class Questions {
    private int questionID;
    private ArrayList<String> altAnswers = new ArrayList<>();

    public Questions (int questionID)
    {
        this.questionID = questionID;
        System.out.println(questionID);
        populateAltAnswers();
    }
    
//    @Override
//    public String toString() // currently set up for testing
//    {
//        String output = " Question ID: " + questionID + "\nQuestion: " +
//                getQuestionContent();
//        output += "\nAnswer: " + getAnswerContent() +"\nAlt-Answer 1: " + getAltAnswer1() +
//                "\nAlt-Answer 2: " + getAltAnswer2() + "\nAlt-Answer 3: " + getAltAnswer3()
//                + "\n";
//        return output;
//    }

    
    /**
     * pulls and returns a question according to stageID and quesitonID
     * @return 
     */
    public String getQuestionContent()
    {
        String question;
        if (questionID < 6 && questionID > -1)
        {
            question = getStage1Question();
        }
        else if (questionID < 13 && questionID > 5)
        {
            question = getStage2Question();
        }
        else if (questionID < 19 && questionID > 12)
        {
            question = getStage3Question();
        }
        else if (questionID < 25 && questionID > 18)
        {
            question = getStage4Question();
        }
        else if (questionID < 31 && questionID > 24)
        {
            question = getStage5Question();
        }
        else throw new IllegalArgumentException("invalid question ID");
        return question;
    }
    
    /**
     * returns the answer of the question as a String
     * @return 
     */
    public String getAnswerContent()
    {
       String answer;
        if (questionID < 6 && questionID > -1)
        {
            answer = getStage1Answer();
        }
        else if (questionID < 13 && questionID > 5)
        {
            answer = getStage2Answer();
        }
        else if (questionID < 19 && questionID > 12)
        {
            answer = getStage3Answer();
        }
        else if (questionID < 25 && questionID > 18)
        {
            answer = getStage4Answer();
        }
        else if (questionID < 31 && questionID > 24)
        {
            answer = getStage5Answer();
        }
        else throw new IllegalArgumentException("invalid question ID - Answers");
        return answer;
    }
    
    /**
     * returns an ArrayList containing 3 alt answers for the question determined 
     * by stageID and questionID
     * @return 
     */
    private ArrayList populateAltAnswers() {
        switch (questionID) {
            case 0:
                altAnswers.add("Stage: 1 Question: 1 AltAnswer: 1");
                altAnswers.add("Stage: 1 Question: 1 AltAnswer: 2");
                altAnswers.add("Stage: 1 Question: 1 AltAnswer: 3");
                break;
            case 1:
                altAnswers.add("Stage: 1 Question: 2 AltAnswer: 1");
                altAnswers.add("Stage: 1 Question: 2 AltAnswer: 2");
                altAnswers.add("Stage: 1 Question: 2 AltAnswer: 3");
                break;
            case 2:
                altAnswers.add("Stage: 1 Question: 3 AltAnswer: 1");
                altAnswers.add("Stage: 1 Question: 3 AltAnswer: 2");
                altAnswers.add("Stage: 1 Question: 3 AltAnswer: 3");
                break;
            case 3:
                altAnswers.add("Stage: 1 Question: 4 AltAnswer: 1");
                altAnswers.add("Stage: 1 Question: 4 AltAnswer: 2");
                altAnswers.add("Stage: 1 Question: 4 AltAnswer: 3");
                break;
            case 4:
                altAnswers.add("Stage: 1 Question: 5 AltAnswer: 1");
                altAnswers.add("Stage: 1 Question: 5 AltAnswer: 2");
                altAnswers.add("Stage: 1 Question: 5 AltAnswer: 3");
                break;
            case 5:
                altAnswers.add("Stage: 1 Question: 6 AltAnswer: 1");
                altAnswers.add("Stage: 1 Question: 6 AltAnswer: 2");
                altAnswers.add("Stage: 1 Question: 6 AltAnswer: 3");
                break;
            case 6:
                altAnswers.add("Stage: 2 Question: 1 AltAnswer: 1");
                altAnswers.add("Stage: 2 Question: 1 AltAnswer: 2");
                altAnswers.add("Stage: 2 Question: 1 AltAnswer: 3");
                break;
            case 7:
                altAnswers.add("Stage: 2 Question: 2 AltAnswer: 1");
                altAnswers.add("Stage: 2 Question: 2 AltAnswer: 2");
                altAnswers.add("Stage: 2 Question: 2 AltAnswer: 3");
                break;
            case 8:
                altAnswers.add("Stage: 2 Question: 3 AltAnswer: 1");
                altAnswers.add("Stage: 2 Question: 3 AltAnswer: 2");
                altAnswers.add("Stage: 2 Question: 3 AltAnswer: 3");
                break;
            case 9:
                altAnswers.add("Stage: 2 Question: 4 AltAnswer: 1");
                altAnswers.add("Stage: 2 Question: 4 AltAnswer: 2");
                altAnswers.add("Stage: 2 Question: 4 AltAnswer: 3");
                break;
            case 10:
                altAnswers.add("Stage: 2 Question: 5 AltAnswer: 1");
                altAnswers.add("Stage: 2 Question: 5 AltAnswer: 2");
                altAnswers.add("Stage: 2 Question: 5 AltAnswer: 3");
                break;
            case 11:
                altAnswers.add("Stage: 2 Question: 6 AltAnswer: 1");
                altAnswers.add("Stage: 2 Question: 6 AltAnswer: 2");
                altAnswers.add("Stage: 2 Question: 6 AltAnswer: 3");
                break;
            case 12:
                altAnswers.add("Stage: 3 Question: 1 AltAnswer: 1");
                altAnswers.add("Stage: 3 Question: 1 AltAnswer: 2");
                altAnswers.add("Stage: 3 Question: 1 AltAnswer: 3");
                break;
            case 13:
                altAnswers.add("Stage: 3 Question: 2 AltAnswer: 1");
                altAnswers.add("Stage: 3 Question: 2 AltAnswer: 2");
                altAnswers.add("Stage: 3 Question: 2 AltAnswer: 3");
                break;
            case 14:
                altAnswers.add("Stage: 3 Question: 3 AltAnswer: 1");
                altAnswers.add("Stage: 3 Question: 3 AltAnswer: 2");
                altAnswers.add("Stage: 3 Question: 3 AltAnswer: 3");
                break;
            case 15:
                altAnswers.add("Stage: 3 Question: 4 AltAnswer: 1");
                altAnswers.add("Stage: 3 Question: 4 AltAnswer: 2");
                altAnswers.add("Stage: 3 Question: 4 AltAnswer: 3");
                break;
            case 16:
                altAnswers.add("Stage: 3 Question: 5 AltAnswer: 1");
                altAnswers.add("Stage: 3 Question: 5 AltAnswer: 2");
                altAnswers.add("Stage: 3 Question: 5 AltAnswer: 3");
                break;
            case 17:
                altAnswers.add("Stage: 3 Question: 6 AltAnswer: 1");
                altAnswers.add("Stage: 3 Question: 6 AltAnswer: 2");
                altAnswers.add("Stage: 3 Question: 6 AltAnswer: 3");
                break;
            case 18:
                altAnswers.add("Stage: 4 Question: 1 AltAnswer: 1");
                altAnswers.add("Stage: 4 Question: 1 AltAnswer: 2");
                altAnswers.add("Stage: 4 Question: 1 AltAnswer: 3");
                break;
            case 19:
                altAnswers.add("Stage: 4 Question: 2 AltAnswer: 1");
                altAnswers.add("Stage: 4 Question: 2 AltAnswer: 2");
                altAnswers.add("Stage: 4 Question: 2 AltAnswer: 3");
                break;
            case 20:
                altAnswers.add("Stage: 4 Question: 3 AltAnswer: 1");
                altAnswers.add("Stage: 4 Question: 3 AltAnswer: 2");
                altAnswers.add("Stage: 4 Question: 3 AltAnswer: 3");
                break;
            case 21:
                altAnswers.add("Stage: 4 Question: 4 AltAnswer: 1");
                altAnswers.add("Stage: 4 Question: 4 AltAnswer: 2");
                altAnswers.add("Stage: 4 Question: 4 AltAnswer: 3");
                break;
            case 22:
                altAnswers.add("Stage: 4 Question: 5 AltAnswer: 1");
                altAnswers.add("Stage: 4 Question: 5 AltAnswer: 2");
                altAnswers.add("Stage: 4 Question: 5 AltAnswer: 3");
                break;
            case 23:
                altAnswers.add("Stage: 4 Question: 6 AltAnswer: 1");
                altAnswers.add("Stage: 4 Question: 6 AltAnswer: 2");
                altAnswers.add("Stage: 4 Question: 6 AltAnswer: 3");
                break;
            case 24:
                altAnswers.add("Stage: 5 Question: 1 AltAnswer: 1");
                altAnswers.add("Stage: 5 Question: 1 AltAnswer: 2");
                altAnswers.add("Stage: 5 Question: 1 AltAnswer: 3");
                break;
            case 25:
                altAnswers.add("Stage: 5 Question: 2 AltAnswer: 1");
                altAnswers.add("Stage: 5 Question: 2 AltAnswer: 2");
                altAnswers.add("Stage: 5 Question: 2 AltAnswer: 3");
                break;
            case 26:
                altAnswers.add("Stage: 5 Question: 3 AltAnswer: 1");
                altAnswers.add("Stage: 5 Question: 3 AltAnswer: 2");
                altAnswers.add("Stage: 5 Question: 3 AltAnswer: 3");
                break;
            case 27:
                altAnswers.add("Stage: 5 Question: 4 AltAnswer: 1");
                altAnswers.add("Stage: 5 Question: 4 AltAnswer: 2");
                altAnswers.add("Stage: 5 Question: 4 AltAnswer: 3");
                break;
            case 28:
                altAnswers.add("Stage: 5 Question: 5 AltAnswer: 1");
                altAnswers.add("Stage: 5 Question: 5 AltAnswer: 2");
                altAnswers.add("Stage: 5 Question: 5 AltAnswer: 3");
                break;
            case 29:
                altAnswers.add("Stage: 5 Question: 6 AltAnswer: 1");
                altAnswers.add("Stage: 5 Question: 6 AltAnswer: 2");
                altAnswers.add("Stage: 5 Question: 6 AltAnswer: 3");
                break;
            default:
                throw new IllegalArgumentException("Invalid questionID -> alt answers");
        }
        return altAnswers;
    }
    
    /**
     * returns the ArrayList containing all three alt Answers
     * @return 
     */
    public ArrayList getAltAnswers()
    {
        return altAnswers;
    }
    
    /**
     * returns alt answer 1
     * @return 
     */
    public String getAltAnswer1()
    {
        return altAnswers.get(0);
    }
    
    /**
     * returns alt answer 2
     * @return 
     */
    public String getAltAnswer2()
    {
        return altAnswers.get(1);
    }
     
    /**
     * returns alt answer 3
     * @return 
     */
     public String getAltAnswer3()
    {
        return altAnswers.get(2);
    }
    /**
     * returns a Stage 1 question according to the questionID
     * @return 
     */
    private String getStage1Question()
    {
        switch (questionID)
        {
            case 1:
                return "Stage 1 Question 1";
            case 2:
                return "Stage 1 Question 2";
            case 3:
                return "Stage 1 Question 3";
            case 4:
                return "Stage 1 Question 4";
            case 5:
                return "Stage 1 Question 5";
            default:
                return "Stage 1 Question 6";
        }
    }
    
    /**
     * returns a Stage 2 question according to the questionID
     * @return 
     */
    private String getStage2Question()
    {
        switch (questionID)
        {
            case 1:
                return "Stage 2 Question 1";
            case 2:
                return "Stage 2 Question 2";
            case 3:
                return "Stage 2 Question 3";
            case 4:
                return "Stage 2 Question 4";
            case 5:
                return "Stage 2 Question 5";
            default:
                return "Stage 2 Question 6";
        }
    }
    
    /**
     * returns a Stage 3 question according to the questionID
     * @return 
     */
    private String getStage3Question()
    {
        switch (questionID)
        {
            case 1:
                return "Stage 3 Question 1";
            case 2:
                return "Stage 3 Question 2";
            case 3:
                return "Stage 3 Question 3";
            case 4:
                return "Stage 3 Question 4";
            case 5:
                return "Stage 3 Question 5";
            default:
                return "Stage 3 Question 6";
        }
    }
    
    /**
     * returns a Stage 4 question according to the questionID
     * @return 
     */
    private String getStage4Question()
    {
        switch (questionID)
        {
            case 1:
                return "Stage 4 Question 1";
            case 2:
                return "Stage 4 Question 2";
            case 3:
                return "Stage 4 Question 3";
            case 4:
                return "Stage 4 Question 4";
            case 5:
                return "Stage 4 Question 5";
            default:
                return "Stage 4 Question 6";
        }
    }
    
    /**
     * returns a Stage 5 question according to the questionID
     * @return 
     */
    private String getStage5Question()
    {
        switch (questionID)
        {
            case 1:
                return "Stage 5 Question 1";
            case 2:
                return "Stage 5 Question 2";
            case 3:
                return "Stage 5 Question 3";
            case 4:
                return "Stage 5 Question 4";
            case 5:
                return "Stage 5 Question 5";
            default:
                return "Stage 5 Question 6";
        }
    }
    
    /**
     * Returns a Stage 1 answer according to the questionID
     * @return 
     */
    private String getStage1Answer()
    {
        switch (questionID)
        {
            case 1:
                return "Stage 1 Answer 1";
            case 2:
                return "Stage 1 Answer 2";
            case 3:
                return "Stage 1 Answer 3";
            case 4:
                return "Stage 1 Answer 4";
            case 5:
                return "Stage 1 Answer 5";
            default:
                return "Stage 1 Answer 6";
        }
    }
    
    /**
     * Returns a Stage 3 answer according to the questionID
     * @return 
     */
    private String getStage2Answer()
    {
        switch (questionID)
        {
            case 1:
                return "Stage 2 Answer 1";
            case 2:
                return "Stage 2 Answer 2";
            case 3:
                return "Stage 2 Answer 3";
            case 4:
                return "Stage 2 Answer 4";
            case 5:
                return "Stage 2 Answer 5";
            default:
                return "Stage 2 Answer 6";
        }
    }
    
    /**
     * Returns a Stage 3 answer according to the questionID
     * @return 
     */
    private String getStage3Answer()
    {
        switch (questionID)
        {
            case 1:
                return "Stage 3 Answer 1";
            case 2:
                return "Stage 3 Answer 2";
            case 3:
                return "Stage 3 Answer 3";
            case 4:
                return "Stage 3 Answer 4";
            case 5:
                return "Stage 3 Answer 5";
            default:
                return "Stage 3 Answer 6";
        }
    }
    
    /**
     * Returns a Stage 4 answer according to the questionID
     * @return 
     */
    private String getStage4Answer()
    {
        switch (questionID)
        {
            case 1:
                return "Stage 4 Answer 1";
            case 2:
                return "Stage 4 Answer 2";
            case 3:
                return "Stage 4 Answer 3";
            case 4:
                return "Stage 4 Answer 4";
            case 5:
                return "Stage 4 Answer 5";
            default:
                return "Stage 4 Answer 6";
        }
    }
    
    /**
     * Returns a Stage 5 answer according to the questionID
     * @return 
     */
    private String getStage5Answer()
    {
        switch (questionID)
        {
            case 1:
                return "Stage 5 Answer 1";
            case 2:
                return "Stage 5 Answer 2";
            case 3:
                return "Stage 5 Answer 3";
            case 4:
                return "Stage 5 Answer 4";
            case 5:
                return "Stage 5 Answer 5";
            default:
                return "Stage 5 Answer 6";
        }
    }
    


}
