import java.util.ArrayList;
import java.util.List;

public abstract class Question {
    
    private String question;
    private List<Character> choices;

    public String getQuestion() {

        return this.question;

    }

    public void setQuestion(String question) {

        this.question = question;

    }

    public List<Character> getChoices() {

        return new ArrayList<>(this.choices);

    }

    public int getChoicesLength() {

        return choices.size();

    }

    public void setChoices(List<Character> curChoices) {

        this.choices = new ArrayList<>(curChoices);

    }



    




}
