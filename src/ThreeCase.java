import java.util.Scanner;

public class ThreeCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();
        System.out.println(number % 4 == 0 && number > 9 ? "Yes" : "No");
    }
}

