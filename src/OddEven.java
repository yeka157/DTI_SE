import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isOdd = isOdd(number);
        System.out.println(isOdd);
        scanner.close();
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
}