package _4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.io.File;

public class Main {

    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;
        if (!Files.exists(MY_PATH)) {
            createFile();
            writeFile(myString);
        } else {
            writeFile(myString);
        }
        

    }

    private static void createFile() {
        try {
            Files.createFile(MY_PATH);
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    private static void writeFile(String myString) {
        try {
            StringBuilder fileContentBuilder = new StringBuilder();
            fileContentBuilder.append(myString);
            fileContentBuilder.append(myString);
            Files.writeString(Path.of("testo.txt"), fileContentBuilder.toString());
            System.out.println("Success");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Path testo = Path.of("testo.txt");
        System.out.println(readFromFile(testo));


    }

    private static String readFromFile(Path MY_PATH) {
        try {
            return Files.readString(Path.of("testo.txt"));
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
        return null;
    }

    /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split

        try {
            countLines();
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    private static int countLines() {
        int conto = 0;
        Path testo = Path.of("testo.txt");
        String counterLines = readFromFile(testo);
        ArrayList<String> spazi = new ArrayList<>();
        String[] counterLinee = counterLines.split("\n");
        for (String test : counterLinee) {
            conto++;
        }
        System.out.println("Le linee (a capo) del file sono " + conto);
        return conto;
    }

    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     * <p>
     * Then deletes the previous file with Files.delete() use inside the try block
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        try {
            countWords();
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    private static int countWords() {
        int conto = 1;
        Path testo = Path.of("testo.txt");
        String counterWords = readFromFile(testo);
        ArrayList<String> spazi = new ArrayList<>();
        String[] counterParole = counterWords.split(" ");
        for (String test : counterParole) {
            conto++;
        }
        System.out.println(" Il conto delle parole è " + conto);
        return conto;
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");
        if (!Files.exists(PATH_IN_A_FOLDER)) {

            try {
                Files.createDirectory(myDirectoryPath);
                Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");
                System.out.println(Files.readString(PATH_IN_A_FOLDER));

            } catch (Exception exception) {
                System.err.println("There was an error!");
                exception.printStackTrace();
                System.exit(0);
            }
        } else {
            try {
                System.out.println(Files.readString(PATH_IN_A_FOLDER));

            } catch (Exception exception) {
                System.err.println("There was an error!");
                exception.printStackTrace();
                System.exit(0);
            }
        }
    }
}
