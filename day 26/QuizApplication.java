import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. What is the size of int in Java?",
            "2. Which keyword is used to inherit a class in Java?",
            "3. Which method is the entry point of Java program?",
            "4. Who developed Java?"
        };

        String[][] options = {
            {"1. 8 bit", "2. 16 bit", "3. 32 bit", "4. 64 bit"},
            {"1. this", "2. super", "3. extends", "4. implements"},
            {"1. start()", "2. main()", "3. run()", "4. init()"},
            {"1. Dennis Ritchie", "2. James Gosling", "3. Bjarne Stroustrup", "4. Guido van Rossum"}
        };

        int[] answers = {3, 3, 2, 2}; // correct option numbers
        int score = 0;

        System.out.println("🎯 Welcome to Quiz Application\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String opt : options[i]) {
                System.out.println(opt);
            }

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = sc.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong Answer\n");
            }
        }

        System.out.println("🏁 Quiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        if (score == questions.length) {
            System.out.println("🏆 Excellent!");
        } else if (score >= 2) {
            System.out.println("👍 Good job!");
        } else {
            System.out.println("📚 Keep practicing!");
        }

        sc.close();
    }
}