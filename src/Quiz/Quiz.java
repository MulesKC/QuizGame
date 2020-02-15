package Quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    List<Question> quizQuestions = new ArrayList<>();
    boolean isAlreadyAQuestion;

    public void addQuestion(Question newQuestion) {
        for (Question question : quizQuestions) {
            if (question.questionName == newQuestion.questionName) {
                System.out.println("Question is already in database!");
                isAlreadyAQuestion = true;
            }
        }
        if (!isAlreadyAQuestion) {
            quizQuestions.add(newQuestion);
        }
    }



}
