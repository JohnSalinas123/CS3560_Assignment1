import java.util.ArrayList;
import java.util.List;

public abstract class Question {
    
    private String question;
    private List<Character> choices;

    // get the question
    public String getQuestion() {

        return this.question;

    }

    // set the question
    public void setQuestion(String question) {

        this.question = question;

    }  

    // get the choices for the question
    public List<Character> getChoices() {

        return new ArrayList<>(this.choices);

    }

    // get the number of choices
    public int getChoicesLength() {

        return choices.size();

    }

    // set the choices
    public void setChoices(List<Character> curChoices) {

        this.choices = new ArrayList<>(curChoices);

    }



    




}
