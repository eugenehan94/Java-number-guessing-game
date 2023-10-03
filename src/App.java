import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int maximum = 10;
        int minimum = 1;
        int range = maximum - minimum + 1;
        int randomNumber = (int) (Math.random() * range) + minimum;
        String userInput;

        while (true) {
            System.out.println("Please enter a number between: " + minimum + " - " + maximum);
            System.out.println("Random number is: " + randomNumber);
            userInput = scan.next();
            try {
                int inputValue = Integer.parseInt(userInput);
                if (inputValue < minimum || inputValue > maximum) {
                    System.out.println("\nPlease enter a valid number within given range");
                } else if (inputValue == randomNumber) {
                    System.out.println("YOU GUESSED CORRECTLY!");
                    System.out.println("Game will now restart");
                    randomNumber = (int) (Math.random() * range) + minimum;
                } else {
                    System.out.println("\nNice Try! But guess again");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nInput invalid!");
            }
        }
    }
}
