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


    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println(student1);

    }
    
}
