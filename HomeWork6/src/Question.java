import java.util.List;

public class Question {

    public String title;

    public List<String> options;

    public String answer;

    public Question(){

    }

    public Question(String subject, List<String> option, String answer){

        title = subject;
        options = option;
        this.answer = answer;

    }

    public void showQuestion(){
        System.out.println(title);

        for (int i = 0; i < options.size(); i++){

            System.out.print((i + 1) + ". " + options.get(i));
            System.out.print("  ");
        }
        System.out.println();
        System.out.println();

    }

    public String getAnswer(){
        return this.answer;
    }



}
