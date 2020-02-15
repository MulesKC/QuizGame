package Quiz;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private char answer;


    public MultipleChoice(String questionName, char answer) {
        super(questionName);
        this.answer = answer;
    }

}
