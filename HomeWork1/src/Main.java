// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static boolean isInt, isDouble, isBigInteger, isBigDecimal;

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.

        Scanner scn = new Scanner(System.in);

        String num = scn.next();
        num = num.replace(" ", "");

        String operator = num.replaceAll("[0-9.]", "");
        var numbers =  num.replaceAll("[^0-9.]", " ");

        var splitNumbers = numbers.split(" ");

        var num1 = Check(splitNumbers[0]);
        var num2  = Check(splitNumbers[1]);

        //Calculate Logic
        if (isBigDecimal){

            BigDecimal numOne = (BigDecimal)num1;
            BigDecimal numTwo = (BigDecimal)num2;

            switch (operator){
                case "+":

                    System.out.println(numOne.add(numTwo));
                    break;

                case "-":

                    System.out.println(numOne.subtract(numTwo));
                    break;

                case "*":
                    System.out.println(numOne.multiply(numTwo));
                    break;

                case "/":
                    System.out.println(numOne.divide(numTwo, 4, BigDecimal.ROUND_HALF_UP));
                    break;
            }

        }

        else if (isBigInteger){

            BigInteger numOne = (BigInteger) num1;
            BigInteger numTwo = (BigInteger) num2;

            switch (operator){
                case "+":
                    System.out.println(numOne.add(numTwo));
                    break;

                case "-":
                    System.out.println(numOne.subtract(numTwo));
                    break;

                case "*":
                    System.out.println(numOne.multiply(numTwo));
                    break;

                case "/":
                    System.out.println(numOne.divide(numTwo));
                    break;
            }


        }

        else if (isDouble){

            Double numOne = (Double) num1;
            Double numTwo = (Double) num2;

            switch (operator){
                case "+":
                    System.out.println(numOne + numTwo);
                    break;

                case "-":
                    System.out.println(numOne - numTwo);
                    break;

                case "*":
                    System.out.println(numOne * numTwo);
                    break;

                case "/":
                    System.out.println(numOne / numTwo);
                    break;
            }

        }

        else if (isInt){

            Integer numOne = (Integer) num1;
            Integer numTwo = (Integer) num2;

            switch (operator){
                case "+":
                    System.out.println(numOne + numTwo);
                    break;

                case "-":
                    System.out.println(numOne - numTwo);
                    break;

                case "*":
                    System.out.println(numOne * numTwo);
                    break;

                case "/":
                    System.out.println(numOne / numTwo);
                    break;
            }

        }


    }

    // Check its type
    public static Object Check(String num){

        try {
            isInt = false;
            var number = Integer.parseInt(num);
            isInt = true;
            return number;

        }catch(Exception e){

        }
        try {
            isDouble = false;
            var number = Double.parseDouble(num);
            isDouble = true;
            return number;

        }catch(Exception e){

        }
        try {
            isBigInteger = false;
            var number = new BigInteger(num);
            isBigInteger = true;
            return number;

        }catch(Exception e){

        }
        try {
            isBigDecimal = false;
            var number = new BigDecimal(num);
            isBigDecimal = true;
            return number;

        }catch(Exception e){

        }

        return null;

    }//Check

}