package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    List<Question> quizQuestions = new ArrayList<>();

    public void addQuestion(Question newQuestion) {
        boolean isAlreadyAQuestion = false;
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

    public void runQuiz() {
        int correctAnswers = 0;
        int totalQuestions = 0;

        for (Question question : quizQuestions) {
            totalQuestions++;
            Scanner input = new Scanner(System.in);
            question.askQuestion();
            String response = input.nextLine();
            System.out.println("\n");

            if (question.evaluateAnswer(response)) {
                correctAnswers++;
            }

        }

        System.out.println("You got " + correctAnswers + " out of " + totalQuestions + " questions correct!");
    }


}
