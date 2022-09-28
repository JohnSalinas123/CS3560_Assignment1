import java.util.List;

public class SingleChoice extends Question {

    private Character answer;


    public SingleChoice(String content,List<Character> choices, Character answer) {

        this.setQuestion(content);
        this.setChoices(choices);
        this.answer = answer;
    

    }


    

    
    
}
