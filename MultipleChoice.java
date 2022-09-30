import java.util.ArrayList;
import java.util.List;

public class MultipleChoice extends Question {

    private List<Character> answer;
    
    
    public MultipleChoice(String question, List<Character> choices, List<Character> answer) {

        this.setQuestion(question);
        this.setChoices(choices);
        this.answer = answer;
        
    }



}
