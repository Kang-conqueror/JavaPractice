import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Exam {

    Scanner scn = new Scanner(System.in);

    public Student student;
    public Paper paper;
    public AnswerSheet answerSheet;

    public List<String> answers = new ArrayList<>();

    public Exam(){}

    public Exam(Student student){

        this.student = student;

    }

    public void createPaper(){
        this.paper = new Paper(3);
    }

    public void answerQuestions(){

        for (int i = 1; i <= this.paper.getCount(); i++){
            System.out.print(i + ". answer: ");
            String ans = scn.next();
            answers.add(ans);

        }

    }

    public void showScoreOfPaper(){

        int score = 0;

        for (int i = 0; i < this.paper.getCount(); i++){


            if (Objects.equals(answerSheet.getAnswers().get(i + 1), answers.get(i))){

                score++;
            }

        }
        System.out.println(score + "/" + this.paper.getCount());

    }

    public void exam(){


        this.paper.showPaper();

    }


}
