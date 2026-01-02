import java.util.*;

public class Exam {
    private List<Question> questions = new ArrayList<>();
    private int score = 0;

    public Exam() {
        questions.add(new Question(
                "What is Java?",
                new String[]{"Programming Language", "OS", "Browser", "Database"},
                1));

        questions.add(new Question(
                "Which keyword is used to inherit a class?",
                new String[]{"this", "super", "extends", "implements"},
                3));
    }

    public void startExam() {
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println("\n" + q.question);
            for (int i = 0; i < q.options.length; i++) {
                System.out.println((i + 1) + ". " + q.options[i]);
            }

            System.out.print("Select option: ");
            int ans = sc.nextInt();

            if (ans == q.correctAnswer) {
                score++;
            }
        }
    }

    public void showResult() {
        System.out.println("\nExam Submitted!");
        System.out.println("Your Score: " + score + "/" + questions.size());
    }
}
