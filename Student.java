import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class Student {

    private UUID ID;
    private List<Character> answer;
    

    // student is presented with question
    public Student(Question curQuestion) {

        this.ID = UUID.randomUUID();
        

        // generate answers
        List<Character> choicesCopy = new ArrayList<>(curQuestion.getChoices());
        int numChoices = curQuestion.getChoicesLength();

        Set<Character> answerSet = new HashSet<>();
        
        Random rand1 = new Random();
        int numAnswers = rand1.nextInt(numChoices);

        if (numAnswers == 0) {
            numAnswers++;
        }
        
        while (answerSet.size() != numAnswers) {
            Random rand2 = new Random();
            int randomNum = rand2.nextInt(numChoices);
            answerSet.add(choicesCopy.get(randomNum));
            
        }

        this.answer = new ArrayList<>(answerSet);

    }

    public UUID getStudentID() {

        return this.ID;

    }

    public List<Character> getStudentAnswer() {
        
        return new ArrayList<>(this.answer);

    }

    public String toString() {

        System.out.println();
        StringBuilder studentStr = new StringBuilder();

        studentStr.append("Student\nID:" + this.ID + "\n");
        studentStr.append("Answers: ");
        for (int i = 0; i < this.answer.size(); i++) {
            Character curAnswer = this.answer.get(i);
            System.out.print(curAnswer);
            System.out.println(curAnswer);
            studentStr.append(curAnswer + " ");
        }

        return studentStr.toString();


    }


    
    


}