import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion mcq1 = new MultipleChoiceQuestion("What is the capital of France?", "Paris", Arrays.asList("London", "Berlin", "Paris", "Madrid"));
        TrueFalseQuestion tfq1 = new TrueFalseQuestion("Is Norman my cat?", "True");
        CheckboxQuestion cbq1 = new CheckboxQuestion("How old is Norman?", "7", Arrays.asList("2", "4", "7", "8"));

        myQuiz.addQuestion(mcq1);
        myQuiz.addQuestion(tfq1);
        myQuiz.addQuestion(cbq1);

        myQuiz.runQuiz();
        myQuiz.gradeQuiz();

    }
}