import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static List<List<Object>> AL =
            new ArrayList<>(
                    Arrays.asList(
                            Arrays.asList(1, "zhangSan", 28, 98),
                            Arrays.asList(2, "Lisi", 21, 100),
                            Arrays.asList(3, "KangKang", 27, 89),
                            Arrays.asList(4, "LiMing", 19, 92),
                            Arrays.asList(5, "WangGang", 22, 66),
                            Arrays.asList(6, "ZhaoXin", 24, 85),
                            Arrays.asList(7, "LiuWei", 20, 78),
                            Arrays.asList(8, "BaiZhanTang", 16, 99)

                    ));


    static String[] Name =
            {"ZhangSan", "Lisi", "KangKang", "LiMing", "WangGang", "ZhaoXin", "LiuWei", "BaiZhanTang"};


    static Integer[] Age =
            {28, 21, 27, 19, 22, 24, 20, 16};

    static int[] Grade =
            {98, 100, 89, 92, 66, 85, 78, 99};


    static Comparator<List<Object>> nameCompare = new Comparator<List<Object>>() {
        @Override
        public int compare(List<Object> o1, List<Object> o2) {

            String name1 = (String) o1.get(1);
            String name2 = (String) o2.get(1);
            return name1.compareTo(name2);
        }
    };

    static Comparator<List<Object>> ageCompare = new Comparator<List<Object>>() {
        @Override
        public int compare(List<Object> o1, List<Object> o2) {

            int name1 = (int) o1.get(2);
            int name2 = (int) o2.get(2);
            return -1 * Integer.compare(name1, name2);
        }
    };

    static Comparator<List<Object>> gradeCompare = new Comparator<List<Object>>() {
        @Override
        public int compare(List<Object> o1, List<Object> o2) {

            int name1 = (int) o1.get(3);
            int name2 = (int) o2.get(3);
            return Integer.compare(name1, name2);
        }
    };


    public static void main(String[] args){

        Arrays.sort(Name);
        System.out.println(Arrays.toString(Name));

        Arrays.sort(Age, Collections.reverseOrder());
        System.out.println(Arrays.toString(Age));

        Arrays.sort(Grade);
        System.out.println(Arrays.toString(Grade));

        System.out.println();

        //Sort by Name
        Collections.sort(AL,nameCompare);

        for (List<Object> aL : AL){
            System.out.println(aL);
        }

        System.out.println();

        //Sort by Age, Descending
        Collections.sort(AL, ageCompare);

        for (List<Object> aL : AL){
            System.out.println(aL);
        }

        System.out.println();


        //Sort by Grade
        Collections.sort(AL, gradeCompare);

        for (List<Object> aL : AL){
            System.out.println(aL);
        }

        System.out.println();


    }

}