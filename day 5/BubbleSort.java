import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {1, 4, 9, 5, 7, 2, 3, 6, 8};

        System.out.println("Before sorting: " + Arrays.toString(a));

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("After sorting: " + Arrays.toString(a));
    }
}

