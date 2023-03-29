public class FoodQuiz {
    private int score;
    public FoodQuiz(int score) {
        this.score = score;
    }

    public static String[] getAnswerOptions( ) {
        String[] answers = new String[4];

        answers[0] = "main course";
        answers[1] = "dessert";
        answers[2] = "starter";
        answers[3] = "snack";

        return answers;
    }

    public static String getQuestionText() {
        return "What type of dish is described above?";
    }

    public int getScore() {
        return score;
    }

    public void increaseScore() {
        this.score++;
    }

    public String getAnswer() {
        return null;
    }

    public void nextQuestion() {

    }

    public boolean checkAnswer(String answerText) {
        return false;
    }

    public int getRound() {
        return 0;
    }
}
