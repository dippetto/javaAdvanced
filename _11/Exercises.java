package _11;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     * <p>
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     * <p>
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Main main = new Main();
        main.printResult();
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create a record called "Person" with fields for name, age and address.
     * <p>
     * Add a toString method to Person to print out the data in a different format
     * <p>
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Person persona = new Person("Mario", 22, "Via Soldato");
        System.out.println(persona);
    }

    /**
     * 3:
     * <p>
     * <p>
     * In the main method, create a BigInteger variable with a large value.
     * <p>
     * Create a BigDecimal variable with a large value
     * <p>
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     * <p>
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     * <p>
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Main main = new Main();
        BigInteger big = new BigInteger("122333333332452525235233245234523553");
        BigDecimal bigDecimal = new BigDecimal("52.1231363631");
        BigInteger divisore = new BigInteger("3");
        BigInteger resultDivide = big.divide(divisore);
        System.out.println("divisione big int = " + resultDivide);
        BigDecimal pi = new BigDecimal(Math.PI);
        try {
            BigDecimal resultPi = new BigDecimal(String.valueOf(bigDecimal.divide(pi)));
            System.out.println(resultPi);
        } catch (ArithmeticException exception) {
            System.out.println("Arithmetic exception");
        }
    }

}