import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the side of the square: ");
        double side = scanner.nextDouble();

        double area = side * side;

        System.out.println("The area of the square with side length " + side + " units is: " + area + " square units");

        scanner.close();
    }
}
