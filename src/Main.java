import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();
        System.out.println(number % 3 == 0 ? "Yes" : "No");
    }
}
