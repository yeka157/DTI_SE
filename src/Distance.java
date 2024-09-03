import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in centimeters: ");
        double centimeters = scanner.nextDouble();
        double kilometers = centimeters / 100000;
        System.out.println(kilometers + " km");
        scanner.close();
    }
}