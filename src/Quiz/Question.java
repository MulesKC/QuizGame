package Quiz;

public abstract class Question {
    public String questionName;

    public Question(String questionName) {
        this.questionName = questionName;
    }

    public abstract boolean evaluator();

}
