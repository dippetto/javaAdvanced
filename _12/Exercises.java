package _12;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private static List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();

    /**
     * 1:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use forEach to print the selected even numbers
     * <p>
     * %
     */

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        filterEvenNumbers(ourNumbers);
    }

    private static void filterEvenNumbers(List<Integer> evenNumbers) {
        List numeriPari = evenNumbers.stream().filter(numeripari -> numeripari % 2 == 0).collect(Collectors.toList());
        numeriPari.forEach(System.out::println);
    }

    /**
     * 2:
     * <p>
     * <p>
     * Use filter to select only odd numbers from the list 'ourNumbers'
     * <p>
     * Use the toSet() method to collect the selected odd numbers in a Set
     * <p>
     * Print the resulting Set
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        printOddNumbers(ourNumbers);
    }

    private static void printOddNumbers(List<Integer> oddNumbers) {
        List numeriDispari = oddNumbers.stream().filter(numeridispari -> numeridispari % 2 != 0).collect(Collectors.toList());
        numeriDispari.forEach(System.out::println);
    }

    /**
     * 3:
     * <p>
     * <p>
     * Use map to convert the strings to uppercase
     * <p>
     * Use the toSet() method to collect the resulting uppercase strings in a Set
     * <p>
     * Print the resulting Set
     * <p>
     * BONUS: do so without creating any variables!
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        List<String> alice = List.of("Alice", "Bob", "Charlie");
        upperCase(alice);
    }

    private static void upperCase(List<String> toUpper) {

        toUpper.stream().map(upperName -> upperName.toUpperCase()).collect(Collectors.toSet()).forEach(System.out::println);
    }

    /**
     * 4:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use map to multiply the even numbers by 2
     * <p>
     * Use the toSet() method to collect the resulting numbers in a Set
     * <p>
     * Print the resulting Set
     */
    private static void exercise4() {
        System.out.println("\nExercise 4");
        filterEvenNumbersTimesTwo(ourNumbers);
    }

    private static void filterEvenNumbersTimesTwo(List<Integer> evenNumbersTimesTwo) {
        Set numeriPari = evenNumbersTimesTwo.stream().filter(numeripari -> numeripari % 2 == 0)
                .map(numeriPariPer2 -> numeriPariPer2 * 2).collect(Collectors.toSet());
        System.out.println(numeriPari);
    }
}