public class SameDigitNumbers {
    public static void main(String[] args) {
        System.out.println("Numbers with the same repeated digit from 11 to 999:");

        for (int i = 11; i <= 999; i++) {
            if (hasSameRepeatedDigit(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean hasSameRepeatedDigit(int num) {
        if (num < 10) {
            return false;
        }

        int digit = num % 10;

        while (num > 0) {
            if (num % 10 != digit) {
                return false;
            }
            num /= 10;
        }

        return true;
    }
}
