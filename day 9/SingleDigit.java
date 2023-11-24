import java.util.Scanner;

public class SingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a multi-digit number: ");
        int number = scanner.nextInt();

        int result = calculateDigitalRoot(number);

        System.out.println("The Single Digit of " + number + " is: " + result);

        scanner.close();
    }

    private static int calculateDigitalRoot(int num) {
        while (num > 9) {
            int tempSum = 0;
            while (num != 0) {
                tempSum += num % 10;
                num /= 10;
            }
            num = tempSum;
        }
        return num;
    }
}
