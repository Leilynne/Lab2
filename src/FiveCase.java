import java.util.Scanner;

public class FiveCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();
        System.out.println(number / 1000 % 10);
    }
}