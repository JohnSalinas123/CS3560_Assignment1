import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SimulationDriver {

    // iVote Simulator
    /*
     *  Configure question types: two types of questions supported:
     *      => multiple choice (more than one choice can be chosen, including one choice)
     *      => single choice (only one choice can be chosen)
     *  Configure candidate answers as:
     *      ["A", "B", "C", "D"]
     *      [1. Right, 2. Wrong]
     *  Allow students to submit answers.
     *  Students:
     *      EveryStudent has a unique ID(String) and can submit and answer to the iVote serice
     *          => store students that have already submitted and answer, and their answer
     *              => if the same student submits answer use ID to search for and change their stored answer to new one
     *  Voting Service:
     *      => Output statistics of the submission results (no graphical interface, just normal printing)
     *          =>Example: 
     *              For multiple choice:
     *                  "A : 5, B : 12" or 
     *              For single choice:
     *                  "1. Right : 15, 2. Wrong: 20"
     * 
     * 
     */

    public static String randomSingleChoice() {

        String[] singleQ_bank = {
            "Is this the correct way to use abstraction?",
            "Is this use of interface correct?",
            "Will this code run?"
        };

        Random random = new Random();
        int randomNum = random.nextInt(3);

        return singleQ_bank[randomNum];

    }


    public static String randomMultipleChoice() {

        String[] multipleQ_bank = {
            "Which use of abstraction is correct?",
            "Which use of interfaces is correct?",
            "Which block of code shows composition?"};

        Random random = new Random();
        int randomNum = random.nextInt(3);


        return multipleQ_bank[randomNum];

    }

    public static void main(String[] args) {

        int numberOfStudents = 10;

        VotingService mainVotingService = new VotingService();

        // Multiple Choice run
        System.out.println("MULTIPLE CHOICE **************************************************************");
        ArrayList<Character> choicesList1 = new ArrayList<Character>(Arrays.asList('A','B','C','D','E'));
        ArrayList<Character> answers1 = new ArrayList<Character>();
        int randomNum = (int)(Math.random() * choicesList1.size());
        for (int i = 0;i < randomNum; i++) {
            answers1.add(choicesList1.get(i));
        }
  
        Question question1 = new MultipleChoice(randomMultipleChoice(),choicesList1,answers1);

        mainVotingService.setQuestion(question1);
        for (int i = 0; i < numberOfStudents;i++) {

            Student newStudent =  new Student(question1);
            mainVotingService.addStudentAnswer(newStudent);

        }

        // print out results
        mainVotingService.printStats();


        // Single Choice run
        System.out.println("SINGLE CHOICE ****************************************************************");
        ArrayList<Character> choicesList2 = new ArrayList<Character>(Arrays.asList('1','2'));
        int randomNum2 = (int)(Math.random() * choicesList2.size());

        Question question2 = new SingleChoice(randomSingleChoice(),choicesList2, choicesList2.get(randomNum2));

        mainVotingService.setQuestion(question2);
        for (int i = 0; i < numberOfStudents;i++) {

            Student newStudent2 =  new Student(question2);
            mainVotingService.addStudentAnswer(newStudent2);

        }

        // print out results
        mainVotingService.printStats();
        

    }
    
}
