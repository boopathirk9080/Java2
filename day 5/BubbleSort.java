import java.util.Arrays;

public class BubbleSortScut {
    public static void main(String[] args) {
        int a[] = {1, 4, 9, 5, 7, 2, 3, 6, 8};
        
        System.out.println("Before sorting: " + Arrays.toString(a));

        Arrays.parallelSort(a);

        System.out.println("After sorting: " + Arrays.toString(a));
    }
}
