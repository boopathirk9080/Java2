import java.util.Scanner;

public class StringLength_ConcatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        int sumLength = str1.length() + str2.length();
        System.out.println("Sum of lengths: " + sumLength);

        String concatString = str1 +" "+str2;
        System.out.println("Concatenated string: " + concatString);

        scanner.close();
    }
}