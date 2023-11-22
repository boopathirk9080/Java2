import java.util.Arrays;

public class TwoDArraySort {
    public static void main(String[] args) {
        int[][] array = {
            {5, 2, 9},
            {7, 1, 3},
            {4, 8, 6}
        };

        // Sorting each row of the 2D array individually
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println("Sorted 2D Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
