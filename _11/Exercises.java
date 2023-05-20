package javaadvanced._11;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

        /**
         * 1:
         *
         *
         * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
         *
         * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
         *
         * Experiment with different values of x and observe the output
         */
        private static void exercise1() {
            System.out.println("\nExercise 1: ");

            Random random = new Random();

            int x = random.nextInt(100);

            int ternaryOperator = x >= 50 ? x : x;
            System.out.println(ternaryOperator);

            boolean comparison1 = x >= 50;
            System.out.println("x is greater than or equal to 50 = " + comparison1);

            boolean comparison2 = x <= 50;
            System.out.println("x is less than 50 = " + comparison2);
        }

        /**
         * 2:
         *
         *
         * Create a record called "Person" with fields for name, age and address.
         *
         * Add a toString method to Person to print out the data in a different format
         *
         * Print the record to the console
         */
        private static void exercise2 () {
            System.out.println("\nExercise 2: ");

            Person person = new Person(" Sergio Mattarella", 81, " Palazzo del Quirinale, 00187 Roma");
            System.out.println(person);
        }

        /**
         * 3:
         *
         *
         * In the main method, create a BigInteger variable with a large value.
         *
         * Create a BigDecimal variable with a large value
         *
         * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
         *
         * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
         *
         * Print the results
         */
        private static void exercise3 () {
            System.out.println("\nExercise 3: ");
            // Your code here
            BigInteger soooBigInteger = new BigInteger("65734901837394857812354950605836474208");
            BigDecimal sooBigDecimal = new BigDecimal("5627.8967949309349293923928365701");

            soooBigInteger = soooBigInteger.divide(new BigInteger("3"));
            System.out.println("The new value of Big Integer is = " + soooBigInteger);

            try {
                sooBigDecimal = sooBigDecimal.divide(new BigDecimal(Math.PI));
                System.out.println("And the new value of Big Decimal is = " + sooBigDecimal);
            } catch (ArithmeticException exception){
                exception.printStackTrace();
                System.err.println("Espansione decimale non terminante; nessun risultato decimale rappresentabile esatto.");
                System.exit(0);
            }

        }

}
