public class Quiz {
    String questionOne;
    String questionsTwo;

    public Quiz(String questionOne, String questionsTwo) {
        this.questionOne = questionOne;
        this.questionsTwo = questionsTwo;

    }

    public String getQuestionOne() {
        return this.questionOne;
    }

    public String getQuestionsTwo() {
        return this.questionsTwo;
    }

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz("What is happening today?", "Should I go for a walk? ");
        System.out.println(myQuiz.getQuestionOne());
        System.out.println(myQuiz.getQuestionsTwo());
    }
}
