// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.

        //Get Two of inputs
        var num1 = Check();
        var num2 = Check();

        //Calculate Logic



    }

    //Get inputs and Check its type
    public static Object Check(){

        Scanner scn = new Scanner(System.in);


        if (scn.hasNextInt()) {

            return scn.nextInt();
        }

        else if (scn.hasNextDouble()){

            return scn.nextDouble();
        }

        else if (scn.hasNextBigInteger()) {

            return scn.nextBigInteger();
        }

        else if (scn.hasNextBigDecimal()) {

            return scn.nextBigDecimal();
        }

        return null;

    }//Check

}