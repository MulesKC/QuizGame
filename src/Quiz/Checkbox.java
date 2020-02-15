package Quiz;

import java.util.ArrayList;
import java.util.List;

public class Checkbox extends Question {

    private String answerSet;
    private List<String> answerOptions = new ArrayList<>();

    public Checkbox(String questionName, ArrayList<String> answerOptions, String answerSet) {
        super(questionName);
        this.answerOptions = answerOptions;
        this.answerSet = answerSet;
    }

    public boolean evaluateAnswer(String userResponse) {
        int correct = 0;
        int expectedCorrect = 0;

        char[] lowerCaseUserResponse = userResponse.toLowerCase().toCharArray();
        char[] lowerCaseAnswerSet = answerSet.toLowerCase().toCharArray();


        for (char answerEntry : lowerCaseAnswerSet) {
            //checks for letter to skip commas, etc
            if (Character.isLetter(answerEntry)) {
                expectedCorrect++;

                for (char userEntry : lowerCaseUserResponse) {

                    if (Character.isLetter(userEntry)) {
                        if (userEntry == answerEntry) {
                            correct++;
                        }
                    }
                }
            }
        }
        if (correct == expectedCorrect) {
            return true;
        } else {
            return false;
        }
    }
}
