package Quiz;


public class TrueOrFalse extends Question {
    private boolean answer;

    public TrueOrFalse(String questionName, String questionText, boolean answer) {
        super(questionName, questionText);
        this.answer = answer;
    }

    @Override
    public boolean evaluateAnswer(String userResponse) {
        if (userResponse.toLowerCase().equals("a") || userResponse.toLowerCase().equals("true")) {
            return (answer == true);
        } else if (userResponse.toLowerCase().equals("b") || userResponse.toLowerCase().equals("false"))  {
            return (answer == false);
        } else {return false;}
    }

    @Override
    public void askQuestion() {

        System.out.println("True or False. " + this.questionText + "\n");
        System.out.println("A. True" + "\n" + "B. False");
    }
}
