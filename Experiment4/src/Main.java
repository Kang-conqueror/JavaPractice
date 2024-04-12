//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scn = new Scanner(System.in);

        Random rnd = new Random();

        ArrayList<ArrayList<Double>> inputs = new ArrayList<>();

        ArrayList<ArrayList<Double>> centerPoints = new ArrayList<>();

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        String fileName = "cluster.txt";
        PrintWriter writer = new PrintWriter(desktopPath + "/" + fileName);


        int k = 3;
        int dimension = 4;
        //double centerpivot = 5.0;

        Map<Integer, ArrayList<ArrayList<Double>>> map = new HashMap<>();

        DecimalFormat df = new DecimalFormat("#.#");

        for (int i = 0; i < k; i++){

            ArrayList<Double> center = new ArrayList<>();

            for (int j = 0; j < dimension; j++){

                double randomNumber = rnd.nextDouble() * 10;
                randomNumber = Double.parseDouble(df.format(randomNumber));
                center.add(randomNumber);

            }

            centerPoints.add(center);

        }

        while (true){

            String str = scn.next();
            if (Objects.equals(str, "end")) break;

            try {
                String[] strInput = str.split(",");
                if (strInput.length != dimension){
                    System.out.println("Input error");
                    return;
                }

                ArrayList<Double> dbInput = new ArrayList<>();
                for (String strIpt : strInput){
                    dbInput.add(Double.parseDouble(strIpt));
                }
                inputs.add(dbInput);

            }catch(Exception e){
                System.out.println("Input error");
                return;
            }
        }

        while (true){


            for (int i =0 ; i < k; i++){
                ArrayList<ArrayList<Double>> value = new ArrayList<>();
                map.put(i, value);
                //System.out.println(map.containsKey(i));
            }


            for (ArrayList<Double> aryIpt : inputs){

                double distance = 0.0;
                int group = 0;


                for (int i = 0; i < k; i++){

                    double sum = 0.0;


                    for (int j = 0; j < dimension; j++){

                        sum += Math.pow(aryIpt.get(j) - centerPoints.get(i).get(j), 2);
                    }


                    double root = Math.sqrt(sum);
                    root = Double.parseDouble(df.format(root));


                    if (distance == 0 || distance > root){
                        distance = root;
                        group = i;
                    }

                }

                map.get(group).add(aryIpt);
            }

            boolean centerEqualCheck = true;

            for (int i =0 ; i < k; i++){

                int cnt = 0;
                double[] pointSums = new double[dimension];

                for (ArrayList<Double> dbPnt : map.get(i)){

                    for (int j = 0; j < dimension; j++){
                        pointSums[j] += dbPnt.get(j);
                    }

                    cnt++;
                }

                for (int j = 0; j < dimension; j++){
                    pointSums[j] = pointSums[j] / cnt ;
                    //pointSums[j] = Double.parseDouble(df.format(pointSums[j]));

                }


                for (int j = 0; j < dimension; j++){

                    //이전의 중심 좌표가 새로운 중심 좌표와 다르다면 갱신 후 변동 변수 조정
                    if (Math.abs(centerPoints.get(i).get(j) - pointSums[j]) >= 0.1){
                        centerEqualCheck = false;
                        centerPoints.get(i).set(j, pointSums[j]);
                    }
                }

            }


            if (centerEqualCheck){
                //System.out.println("break!");
                break;
            }

        }

        for (int i = 0; i < k; i++){

            for (ArrayList<Double> dbPnt : map.get(i)){

                for (int j = 0; j < dimension; j++){
                    writer.print(dbPnt.get(j) + ",");
                }

            }
            writer.println("Group" + (i + 1));
        }
        writer.close();

    }
}