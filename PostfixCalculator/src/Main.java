import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        PostFixCalculator calc = new PostFixCalculator();

        try {

            Scanner fromFile = new Scanner(new File("input.txt"));

            while (fromFile.hasNextLine()) {
                String input = fromFile.nextLine();
                System.out.println("Expression in postfix notation: " + input);
                System.out.println("Result: " + calc.calculate(input));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}