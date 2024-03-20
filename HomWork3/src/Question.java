import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Question {

    Scanner scanner = new Scanner(System.in);

    String text;

    String[] options;

    public Question(){

    }

    public Question(String text, String[] options){

        this.text = text;
        this.options = options;


    }


    public boolean Check(char[] answers){



        return false;
    }

    public void print(){

        System.out.println(this.text);
        System.out.println(Arrays.toString(this.options));
        System.out.print("答案: ");

    }



}