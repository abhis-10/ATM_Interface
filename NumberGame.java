import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minimum value of the range");
        int min = sc.nextInt();
        System.out.println("Enter the maximum value of the range");
        int max = sc.nextInt();
        int score = 0;
        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Guess a number between " +min+ " and " +max);

        int userInput = sc.nextInt();
        while (randomNumber != userInput) {
            if (userInput > randomNumber) {
                System.out.println("your number is larger than the random number!");
                System.out.println("Guess a number between one and ten");
                userInput = sc.nextInt();
                score += 1;
            } else if (userInput < randomNumber) {
                System.out.println("your number is less than the random number!");
                System.out.println("Guess a number between one and ten");
                userInput = sc.nextInt();
                score += 1;
            }
            sc.close();
        }
        System.out.println("your number matches with the random number!");
        System.out.println(" randomNumber was: " + randomNumber + " and userInput was: " + userInput);
        System.out.println("Your score based on the attempts taken is:" + score);

    }
}