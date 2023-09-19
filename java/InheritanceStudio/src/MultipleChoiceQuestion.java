import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> choices;

    public MultipleChoiceQuestion(String questionText, String correctAnswer, List<String> choices) {
        super(questionText, correctAnswer);
        this.choices = choices;
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
        return userAnswer.equalsIgnoreCase(answer);
    }
}

