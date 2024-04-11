//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scn = new Scanner(System.in);

        Random rnd = new Random();

        ArrayList<ArrayList<String>> inputs = new ArrayList<>();

        ArrayList<ArrayList<Double>> centerPoints = new ArrayList<>();

        int k = 3;
        int dimension = 4;

        for (int i = 0; i < k; i++){

            ArrayList<Double> center = new ArrayList<>();

            for (int j = 0; j < dimension; j++){
                double randomDouble = rnd.nextDouble() * 10;
                center.add(randomDouble);
            }
            centerPoints.add(center);
        }

        while (true){

            String str = scn.next();
            if (Objects.equals(str, "end")) break;
            
        }

    }
}