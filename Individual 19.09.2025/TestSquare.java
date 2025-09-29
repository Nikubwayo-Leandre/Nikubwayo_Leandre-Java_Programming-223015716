package TestShapeCalculation;
import ShapeCalculation.Square;
import java.util.Scanner;

public class TestSquare {
    
    public static void calculateSquare() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== SQUARE CALCULATION ===");
        
        // Get side length
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        
        // Create square object
        Square square = new Square(side);
        
        // Ask what to calculate
        System.out.println("What would you like to calculate?");
        System.out.println("A. Area");
        System.out.println("B. Perimeter");
        System.out.print("Enter your choice (A/B): ");
        char calcChoice = scanner.next().toUpperCase().charAt(0);
        
        // Perform calculation
        if (calcChoice == 'A') {
            double area = square.calculateArea();
            System.out.println("The area of the square is: " + area);
        } else if (calcChoice == 'B') {
            double perimeter = square.calculatePerimeter();
            System.out.println("The perimeter of the square is: " + perimeter);
        } else {
            System.out.println("Invalid choice!");
        }
    }
    
    // Keep main method for direct execution
    public static void main(String[] args) {
        calculateSquare();
        
        // Ask if user wants to continue
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to continue? (Yes/No): ");
        String continueChoice = scanner.next().toLowerCase();
        if (!continueChoice.equals("yes")) {
            System.out.println("Thank you for using the system");
        }
        scanner.close();
    }
}