import java.util.ArrayList;
import java.util.List;

public class MultipleChoice extends Question {

    private List<Character> answer;
    
    
    public MultipleChoice(String content, List<Character> choices, List<Character> answer) {

        this.setQuestion(content);
        this.answer = answer;
        this.setChoices(choices);

    }



}
