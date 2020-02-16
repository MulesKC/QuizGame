package Quiz;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoice extends Question {
    private String answer;
    private List<String> answerOptions = new ArrayList<>();


    public MultipleChoice(String questionName, String questionText, List<String> answerOptions, String answer) {
        super(questionName, questionText);
        this.answerOptions = answerOptions;
        this.answer = answer;
    }

    @Override
    public boolean evaluateAnswer(String userResponse) {
        if (userResponse.contains(answer)) { return true; }
        return false;
    }

    @Override
    public void askQuestion() {
        char alphaIdentifier = 'A';

        System.out.println(questionText);

        for (int i = 0; i < answerOptions.size(); i++) {
            System.out.println(alphaIdentifier + ". " + answerOptions.get(i));
            alphaIdentifier++;
        }
    }

}
