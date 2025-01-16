import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        
        // Calculate the perimeter
        double perimeter = 4 * side;
        
        // Display the result
        System.out.println("The perimeter of the square is: " + perimeter);
        
        scanner.close();
    }
}
