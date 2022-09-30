import java.util.List;

public class SingleChoice extends Question {

    private Character answer;


    public SingleChoice(String question,List<Character> choices, Character answer) {

        this.setQuestion(question);
        this.setChoices(choices);
        this.answer = answer;
    

    }


    

    
    
}
