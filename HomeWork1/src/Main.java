// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Optional;
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

        String txt = scn.nextLine(); //Get Inputs,
        String num = txt.replace(" ", ""); //delete whitespace
        //System.out.println(num);

        //Split operator and numbers
        String operator = num.replaceAll("[^+*/-]", "");
        var numbers =  num.replaceAll("[^0-9.]", " ");


        //System.out.println(operator);
        //System.out.println(numbers);

        //separate two numbers
        var splitNumbers = numbers.split(" ");

        //System.out.println(splitNumbers);
        var num1 = Check(splitNumbers[0]);
        var num2  = Check(splitNumbers[1]);

//        System.out.println(num1.getClass());
//        System.out.println(Double.valueOf((String) num2));



        //Calculate Logic, BigDecimal > BigInteger > Double > Int, Check highest Type and calculate
        //Because at check function, use Generic type, for calculate, use Optional Class Type.
        if (isBigDecimal){

            Optional<BigDecimal> numOne = Optional.ofNullable(num1).map(Object::toString).map(BigDecimal::new);
            Optional<BigDecimal> numTwo = Optional.ofNullable(num2).map(Object::toString).map(BigDecimal::new);

            switch (operator){
                case "+":

                    System.out.println(numOne.get().add(numTwo.get()));
                    break;

                case "-":

                    System.out.println(numOne.get().subtract(numTwo.get()));
                    break;

                case "*":
                    System.out.println(numOne.get().multiply(numTwo.get()));
                    break;

                case "/":
                    System.out.println(numOne.get().divide(numTwo.get(), 4, BigDecimal.ROUND_HALF_UP));
                    break;
            }

        }

        else if (isBigInteger){
            Optional<BigInteger> numOne = Optional.ofNullable(num1).map(Object::toString).map(BigInteger::new);
            Optional<BigInteger> numTwo = Optional.ofNullable(num2).map(Object::toString).map(BigInteger::new);
            //BigInteger numOne = (BigInteger) num1;
            //BigInteger numTwo = (BigInteger) num2;

            switch (operator){
                case "+":
                    System.out.println(numOne.get().add(numTwo.get()));
                    break;

                case "-":
                    System.out.println(numOne.get().subtract(numTwo.get()));
                    break;

                case "*":
                    System.out.println(numOne.get().multiply(numTwo.get()));
                    break;

                case "/":
                    System.out.println(numOne.get().divide(numTwo.get()));
                    break;
            }


        }

        else if (isDouble){

            Optional<Double> numOne = Optional.ofNullable(num1).map(Object::toString).map(Double::parseDouble);
            Optional<Double> numTwo = Optional.ofNullable(num2).map(Object::toString).map(Double::parseDouble);


            switch (operator){
                case "+":
                    System.out.println(numOne.get() + numTwo.get());
                    break;

                case "-":
                    System.out.println(numOne.get() - numTwo.get());
                    break;

                case "*":
                    System.out.println(numOne.get() * numTwo.get());
                    break;

                case "/":
                    System.out.println(numOne.get() / numTwo.get());
                    break;
            }

        }

        else if (isInt){

            Optional<Integer> numOne = Optional.ofNullable(num1).map(Object::toString).map(Integer::parseInt);
            Optional<Integer> numTwo = Optional.ofNullable(num2).map(Object::toString).map(Integer::parseInt);

            switch (operator){
                case "+":
                    System.out.println(numOne.get() + numTwo.get());
                    break;

                case "-":
                    System.out.println(numOne.get() - numTwo.get());
                    break;

                case "*":
                    System.out.println(numOne.get() * numTwo.get());
                    break;

                case "/":
                    System.out.println(numOne.get() / numTwo.get());
                    break;
            }

        }


    }

    // Check its type and return it
    public static <T> T Check(String num){

        try {
            isInt = false;
            Integer number = Integer.parseInt(num);
            if(!isDouble && !isBigInteger && !isBigDecimal){
                isInt = true;
            }

            return (T) number;

        }catch(Exception e){

        }
        try {
            isDouble = false;
            Double number = Double.parseDouble(num);
            if(!isBigInteger && !isBigDecimal){
                isDouble = true;
            }

            return (T) number;

        }catch(Exception e){

        }
        try {
            isBigInteger = false;
            BigInteger number = new BigInteger(num);
            if(!isBigDecimal){
                isBigInteger = true;
            }

            return (T) number;

        }catch(Exception e){

        }
        try {
            isBigDecimal = false;
            BigDecimal number = new BigDecimal(num);
            isBigDecimal = true;
            return (T) number;

        }catch(Exception e){

        }

        return null;

    }//Check

}