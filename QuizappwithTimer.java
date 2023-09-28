import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizappwithTimer {
    private static int score = 0;
    private static int questionIndex = 0;
    private static boolean isTimerExpired = false;

    // Define the quiz questions and answers
    private static final String[] questions = {
        "What is the world\u2019s smallest country? ",
        "Banksy is most associated with which city?",
        "What nationality was Charlie Chaplin?",
        "What is the largest mammal?",
        "Which planet is closest to the Sun?"
    };

    private static final String[] answers = {
        "atican City",
        "Bristol",
        "British ",
        "Blue Whale",
        "Mercury "
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        System.out.println("Welcome to the Quiz Application!");
        System.out.println("You have 20 seconds to answer each question.");

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                isTimerExpired = true;
                System.out.println("Time's up!");
            }
        }, 20000);

        while (questionIndex < questions.length) {
            System.out.println("\nQuestion " + (questionIndex + 1) + ": " + questions[questionIndex]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!isTimerExpired) {
                if (userAnswer.equalsIgnoreCase(answers[questionIndex])) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is: " + answers[questionIndex]);
                }
            } else {
                System.out.println("Sorry, you ran out of time for this question.");
            }

            questionIndex++;
            isTimerExpired = false;
        }

        timer.cancel();

        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}





