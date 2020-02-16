package Quiz;


import java.util.ArrayList;
import java.util.List;

public class QuizRunner {
    public static void main(String args[]) {
        Quiz testQuiz = new Quiz();

        //lists for quiz questions
        List<String> lizardList = new ArrayList<>(
                List.of("chameleon", "dog", "bearded dragon", "turtle"));
        List<String> animalSoundOptions = new ArrayList<>(
                List.of("mooo","woof","neigh","chirp","roar"));

        Question dino = new TrueOrFalse("dino",
                "Are dinosaurs alive today?",
                false);
        Question isLizard = new Checkbox("isLizard",
                "Which of the following are lizards?",
                lizardList,
                "a,c");
        Question cowSound = new MultipleChoice("cowsound",
                "What sound does a cow make?",
                animalSoundOptions,
                "a");


        testQuiz.addQuestion(dino);
        testQuiz.addQuestion(isLizard);
        testQuiz.addQuestion(cowSound);

        testQuiz.runQuiz();

    }
}
