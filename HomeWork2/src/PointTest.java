import java.util.List;
import java.util.Random;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PointTest {

     
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Random random = new Random();

        double dis;

        List<Point> normalPoints = new ArrayList<>();
        List<Point> diagonalPoints = new ArrayList<>();

        for (int i = 0; i < 2; i++){

            int x = random.nextInt(10);
            int y = random.nextInt(10);
            
            normalPoints.add(new Point(x, y));

        }

        for (int i = 0; i < 2; i++){

            int x = random.nextInt(10);

            diagonalPoints.add(new Point(x));

        }

        dis = normalPoints.get(0).distance();
        System.out.println(dis);

        dis = diagonalPoints.get(0).distance();
        System.out.println(dis);

        Point p0 = normalPoints.get(0);
        Point p1 = normalPoints.get(1);

        dis = p0.distance(p1.x, p1.y);
        System.out.println(dis);

        dis = p0.distance(p1);
        System.out.println(dis);

        p0 = diagonalPoints.get(0);
        p1 = diagonalPoints.get(1);

        dis = p0.distance(p1.x, p1.y);
        System.out.println(dis);

        dis = p0.distance(p1);
        System.out.println(dis);


    }
}