
import java.util.ArrayList;
import java.util.List;

public class Student {


    String Name;
    int Year;

    List<String> Class;

    List<Integer> Grade;

    int totalGrade;

    public Student(String Name, int Year, List<String> Class, List<Integer> Grade){

        this.Name = Name;
        this.Year = Year;
        this.Class = Class;
        this.Grade = Grade;

        for (int grade : Grade) {
            this.totalGrade += grade;

        }
    }


    public void getHours(){

        System.out.println(totalGrade);

    }


    public void showMessage(){

        System.out.println(Name);
        System.out.println(Year);

        for (int i = 0; i < Class.size(); i++){

            System.out.print(Class.get(i));
            if (i != Class.size() - 1){
                System.out.print(" ");
            }

        }

        System.out.println();

        for (int i = 0; i < Class.size(); i++){

            System.out.print(Grade.get(i));
            if (i != Class.size() - 1){
                System.out.print(" ");
            }

        }

        System.out.println();

        getHours();

        System.out.println();
    }


}
