import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String text = scanner.nextLine();
        boolean isPalindrome = isPalindrome(text);
        System.out.println(isPalindrome);
        scanner.close();
    }

    public static boolean isPalindrome(String n) {
        String reversed = "";
        for (int i = 0; i < n.length(); i++) {
            reversed = n.charAt(i) + reversed;
        }
        return reversed.toLowerCase().equals(n.toLowerCase());
    }
}