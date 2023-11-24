import java.util.Scanner;

public class ArrayScanAndPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Elements of the array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        scanner.close();
    }
}
