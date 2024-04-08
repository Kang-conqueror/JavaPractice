import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int questionCount = 3;
        Student std = new Student("Java");
        AnswerSheet ans = new AnswerSheet();
        Exam exam = new Exam(std);
        exam.createPaper();

        Question q1 = new Question("This question's Answer is A", new ArrayList<>(Arrays.asList("A", "B", "C", "D")), "A");
        Question q2 = new Question("This question's Answer is B", new ArrayList<>(Arrays.asList("A", "B", "C", "D")), "B");
        Question q3 = new Question("This question's Answer is C", new ArrayList<>(Arrays.asList("A", "B", "C", "D")), "C");

        List<Question> questions = new ArrayList<>(Arrays.asList(q1, q2, q3));

        for (int i = 1; i <= questionCount; i++){
            //System.out.println(i);
            exam.paper.addQuestions(i);
            exam.paper.getQuestions().put(i, questions.get(i - 1));
            ans.addAnswer(i, questions.get(i - 1).getAnswer());
        }

        exam.answerSheet = ans;

        exam.exam();
        exam.answerQuestions();

        System.out.print(std.getName() + ": ");
        exam.showScoreOfPaper();


    }
}