package javaadvanced._13;

import org.junit.jupiter.api.Assertions;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     * The following code is supposed to do a factorial of the number five, which looks like this: 5*4*3*2*1 = 120
     *
     * Find and fix the error using the debugger
     *
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        int number = 5;
        int factorial = calculateFactorial(number);
        Assertions.assertEquals(120, factorial);

        System.out.println(calculateFactorial(5));      // prova del 9
    }

    private static int calculateFactorial(int number) {
        //Fix this code
        int result = 1;
        for (int i = number; i >= 1; i -= 1) {      // i -= 2 --> per avere risultato 120, bisognava decrementare di 1 e non di 2 come di default nell'esercizio
            result = result * i;
        }
        return result;


    }

    /**
     * 2:
     *
     * The following code is supposed to reverse a string
     *
     * Find and fix the error using the debugger
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        String input = "hello";
        String reversedString = reverseString(input);
        Assertions.assertEquals("olleh", reversedString);

        System.out.println(reversedString);     // prova del 9
    }

    private static String reverseString(String input) {
        //Fix this code

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {     //  i >= 1 --> nella condizione andava impostato 0 e non 1 come di default nell'esercizio, altrimenti si va fuori limite
            reversed = reversed + input.charAt(i);     // reversed += reversed + input.charAt(i) --> bisognava rimuovere l'operatore - che aggiungeva altri elementi alla stringa
        }
        return reversed;
    }

    /**
     * 3:
     *
     * The following code is supposed to check if a number is positive or negative
     * but there is a semantic error in the if statement.
     *
     * Find and fix the error using the debugger
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Assertions.assertFalse(isPositive(-5));
        Assertions.assertFalse(isPositive(-55));
        Assertions.assertTrue(isPositive(0));      // Assertions.assertFalse(isPositive(0)); --> bisognava cambiare l'asserzione che non è falsa come di default nell'esercizio
        Assertions.assertTrue(isPositive(5));      // e commentata sopra, ma ci si dovrebbe aspettare che sia vera
        Assertions.assertTrue(isPositive(55));
        Assertions.assertTrue(isPositive(4567));

        System.out.println(isPositive(0));      // prova del 9
    }

    private static boolean isPositive(int num) {
        //Fix this code
        return num >= 0;
    }
}
