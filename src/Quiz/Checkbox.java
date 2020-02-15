package Quiz;

import java.util.ArrayList;

public class Checkbox extends Question {

    private ArrayList<String> answer = new ArrayList<>();

    public Checkbox(String questionName, ArrayList<String> answer) {
        super(questionName);
        this.answer = answer;
    }

    public boolean evaluator(ArrayList<String> response) {
        for (String each : answer) {
            for (String item : response) {
                if (each.equals(item)) {

                }
            }
        }

    }
}
