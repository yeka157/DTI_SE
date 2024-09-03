import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the search string to remove: ");
        String searchString = scanner.nextLine();

        String result = removeFirstOccurrence(inputString, searchString);
        System.out.println("Resulting string: " + result);

        scanner.close();
    }

    public static String removeFirstOccurrence(String str, String searchStr) {
        int index = str.indexOf(searchStr);
        if (index != -1) {
            return str.substring(0, index) + str.substring(index + searchStr.length());
        }
        return str;
    }
}