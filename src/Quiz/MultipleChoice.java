package Quiz;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoice extends Question {
    private char answer;
    private List<String> answerOptions = new ArrayList<>();


    public MultipleChoice(String questionName,ArrayList<String> answerOptions, char answer) {
        super(questionName);
        this.answerOptions = answerOptions;
        this.answer = answer;
    }


    public boolean evaluateAnswer(char userResponse) {
        if (userResponse == answer) { return true; }
        return false;
    }

    @Override
    public void askQuestion() {

    }

}
