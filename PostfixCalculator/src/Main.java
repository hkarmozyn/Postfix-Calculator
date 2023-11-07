import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Your Math Equation in Reverse Polish notation");
        String userInput = s.nextLine();

        PostFixCalculator calc = new PostFixCalculator();

        System.out.println("The answer is: " + calc.calculate(userInput));

    }
}