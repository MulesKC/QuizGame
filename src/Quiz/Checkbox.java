package Quiz;

import java.util.ArrayList;
import java.util.List;

public class Checkbox extends Question {

    private String answerSet;
    private List<String> answerOptions = new ArrayList<>();

    public Checkbox(String questionName, String questionText, List<String> answerOptions, String answerSet) {
        super(questionName, questionText);
        this.answerOptions = answerOptions;
        this.answerSet = answerSet;
    }

    @Override
    public boolean evaluateAnswer(String userResponse) {
        int correct = 0;
        int expectedCorrect = 0;
        int userEntries = 0;

        char[] lowerCaseUserResponse = userResponse.toLowerCase().toCharArray();
        char[] lowerCaseAnswerSet = answerSet.toLowerCase().toCharArray();
        char[] checkedLetters = new char[26];



        for (char answerEntry : lowerCaseAnswerSet) {
           // checks for letter to skip commas, etc
            if (Character.isLetter(answerEntry)) {
                //counts expected # of answers
                expectedCorrect++;

                for (char userEntry : lowerCaseUserResponse) {
                    if (Character.isLetter(userEntry)) {

                        if (userEntry == answerEntry) {
                            //user answered correctly!
                            correct++;
                            break;
                        }
                    }
                }
            }
        }


        //checks number of answers submitted to later match number of answers expected
        for (char userEntry : lowerCaseUserResponse) {
            if (Character.isLetter(userEntry)) {
                userEntries++;
            }
        }

        //checks if they missed any (didn't have a match vs. number of answers expected)
        if (correct == expectedCorrect) {
            //checks if they gave any extra answers that were not in answers expected
            if (userEntries == expectedCorrect) {
                return true;
            }
        }
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
