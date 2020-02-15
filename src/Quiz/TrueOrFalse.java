package Quiz;

public class TrueOrFalse extends Question {
    private boolean answer;

    public TrueOrFalse(String questionName, boolean answer) {
        super(questionName);
    }

    public boolean evaluateAnswer(String userResponse) {
        if (userResponse.toLowerCase() == "a") {
            return true;
        }
        return false;
    }
}
