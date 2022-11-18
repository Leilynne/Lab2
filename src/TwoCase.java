import java.util.Scanner;

public class TwoCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();
        System.out.println(number % 5 == 2 && number % 7 == 1 ? "Yes" : "No");
    }
}


