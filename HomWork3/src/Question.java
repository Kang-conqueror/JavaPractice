import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Question {

    String text;

    String[] options;

    public Question(){

    }

    public Question(String text, String[] options){

        this.text = text;
        this.options = options;
        System.out.println(text);
        System.out.println(Arrays.toString(options));

    }


    public boolean Check(char[] answers){



        return false;
    }

    public void print(){

        System.out.println("恭喜，答对了！");
        System.out.println("还得努力呀！");

    }

}