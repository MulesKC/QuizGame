package Quiz;

public abstract class Question {
    public String questionName;
    public String questionText;


    public Question(String questionName, String questionText) {
        this.questionName = questionName;
        this.questionText = questionText;
    }

    public abstract void askQuestion();

    public abstract boolean evaluateAnswer(String userResponse);
}
