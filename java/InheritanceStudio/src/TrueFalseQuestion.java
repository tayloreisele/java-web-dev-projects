public class TrueFalseQuestion extends Question {
    // Constructor
    public TrueFalseQuestion(String questionText, String correctAnswer) {
        super(questionText, correctAnswer);
    }

    @Override
    public void displayQuestion() {
        System.out.println(question + " (True/False)");
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        // Using equalsIgnoreCase to make it case-insensitive
        return userAnswer.trim().equalsIgnoreCase(answer);
    }
}

