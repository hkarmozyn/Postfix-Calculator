/**
 * Main.java
 * Authors: Luke O’Drobinak, Hugh Karmozyn
 * Date: 11/7/2023
 * Collaborators:
 * Citations: Google, Stack Overflow
 **/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Create a new PostFixCalculator instance
        PostFixCalculator calc = new PostFixCalculator();

        try {

            // Read the postfix expressions from file
            Scanner fromFile = new Scanner(new File("input.txt"));
            FileWriter fileWriter = new FileWriter("log.txt");


            // Read postfix expressions from file, calculate them, then print the result
            while (fromFile.hasNextLine()) {
                String input = fromFile.nextLine();
                String toLog = "Expression in postfix notation: " + input + "\n" + "Result: " + calc.calculate(input);
                fileWriter.write(toLog + "\n");
            }

            // Close the file
            fileWriter.close();
            fromFile.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}