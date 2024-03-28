import java.util.Arrays;
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static String[][] sourceInfo =
            {       {"1001", "zhangs", "male", "21"},
                    {"1002", "lis", "male", "23"},
                    {"1003", "wangwu", "female", "21"},
                    {"1004", "zhangs", "male", "24"},
                    {"1005", "zhaol", "female", "25"},
                    {"1006", "qingqi", "male", "21"},
            };



    public static void main(String[] args) {


        Student[] students = new Student[sourceInfo.length];

        for (int i = 0; i < sourceInfo.length; i++){
            students[i] = new Student(sourceInfo[i][0], sourceInfo[i][1], sourceInfo[i][2], sourceInfo[i][3]);
        }

        StringArray stringArray = new StringArray();
        stringArray.getSource(sourceInfo);


        System.out.println("ID    NAME      GENDER  AGE");
        System.out.println("--------------------------------------");
        for (Student s : students){
            s.printStudents();
        }

        System.out.println();

        System.out.println("ID    NAME      GENDER  AGE");
        System.out.println("--------------------------------------");
        stringArray.printStudents();


    }
}