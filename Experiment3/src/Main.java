import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    static List<Student> Students = new ArrayList<>();

    static List<String> classNames = new ArrayList<>();

    static String Name;
    static int Year;

    static List<String> Class = new ArrayList<>();

    static List<Integer> Grade = new ArrayList<>();

    int totalGrade;
    public static void get(){


        Name =  scanner.nextLine();

        Year = scanner.nextInt();

        scanner.nextLine();

        Class = new ArrayList<>();

        String[] inputs = scanner.nextLine().split(" ");

        Class.addAll(Arrays.asList(inputs));



        Grade = new ArrayList<>();

        inputs = scanner.nextLine().split(" ");

        for (String name : inputs){
            Grade.add(Integer.parseInt(name));
        }



    }

    public static void set(){

        Students.add(new Student(Name, Year, Class, Grade));

    }


    public static void main(String[] args) {

        String[] inputs = scanner.nextLine().split(" ");

        for (String name : inputs){
            classNames.add(name);
        }


        int studentCount = 3;

        for (int i = 0; i < studentCount; i++){
            get();
            set();
        }

        for (int i = 0; i < studentCount; i++){
            Students.get(i).showMessage();

        }

    }

}