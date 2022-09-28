import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class VotingService {

    private Question curQuestion;
    private HashMap<UUID, List<Character>> answerMap = new HashMap<>();

    public void setQuestion(Question newQuestion) {

        this.curQuestion = newQuestion;
        if (answerMap != null) {
           this.answerMap.clear(); 
        }
        

    }

    public void addStudentAnswer(Student student) {

        UUID student_id = student.getStudentID();
        List<Character> student_answer = student.getStudentAnswer();
        
        this.answerMap.put(student_id, student_answer);

    }
    

    public void printStats() {

        int numberOfStudents = this.answerMap.size();
        int numberOfAnswers = 0;

        List<Character> choicesCopy = this.curQuestion.getChoices();
        HashMap<Character, Integer> stats = new HashMap<>();

        for(List<Character> values : answerMap.values()) {

            for (Character val : values) {

                numberOfAnswers ++;
                stats.merge(val, 1, Integer::sum);

            }

        }
        
        StringBuilder statStr = new StringBuilder();
        statStr.append("Question: " + this.curQuestion.getQuestion() + "\n");
        statStr.append("Number of Students:" + numberOfStudents + "\n");
        statStr.append("Number of answers:" + numberOfAnswers + "\n");

        for(Character answer : choicesCopy) {

            statStr.append(answer);
            statStr.append(" " + stats.get(answer) + "\n");

        }
        

        System.out.println(statStr.toString());

    }
    
}

