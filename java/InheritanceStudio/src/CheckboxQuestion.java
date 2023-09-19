import java.util.List;
import java.util.Arrays;

public class CheckboxQuestion extends Question {
    private List<String> choices;
    private List<String> correctAnswersList;

    // Constructor
    public CheckboxQuestion(String questionText, String correctAnswers, List<String> choices) {
        super(questionText, correctAnswers);
        this.choices = choices;
        this.correctAnswersList = Arrays.asList(correctAnswers.split(","));
    }

    @Override
    public void displayQuestion() {
        System.out.println(question);
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i));
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        List<String> userAnswersList = Arrays.asList(userAnswer.split(","));
        if (userAnswersList.size() != correctAnswersList.size()) {
            return false;
        }

        for (String answer : userAnswersList) {
            if (!correctAnswersList.contains(answer.trim())) {
                return false;
            }
        }
        return true;
    }
}
