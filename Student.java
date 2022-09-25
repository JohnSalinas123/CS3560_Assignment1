import java.util.UUID;

public class Student {

    private UUID ID;
    //private boolean hasAnswered = false;

    public Student() {

        this.ID = UUID.randomUUID();

    }

    public String toString() {

        return "Student\nID:" + this.ID;

    }
    


}