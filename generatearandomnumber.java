import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the minimum number: ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum number: ");
        int max = scanner.nextInt();

        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
    }
}
