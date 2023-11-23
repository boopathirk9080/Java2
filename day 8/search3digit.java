import java.util.ArrayList;
public class ThreeDigitValues {
    public static void main(String[] args) {
        int[] array = {123, 45, 6789, 9876, 321, 8765};
        ArrayList<Integer> threeDigitValues = new ArrayList<>();
        for (int num : array) {
            if (num >= 100 && num <= 999) {
                threeDigitValues.add(num);
            }
        }
        System.out.println("Three-digit values in the array: " + threeDigitValues);
    }
}
