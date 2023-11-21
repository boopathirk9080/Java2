import java.util.Scanner;

public class CountNumberOfWords {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("Number Of Words is: " + count);
    }
}
