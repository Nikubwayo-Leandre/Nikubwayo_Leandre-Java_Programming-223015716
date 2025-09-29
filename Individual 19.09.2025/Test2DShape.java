
package TestShapeCalculation;
import java.util.Scanner;

public class Test2DShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
        
        while (continueProgram) {
            // Display main menu
            System.out.println("\n===  SHAPE CALCULATOR(Hitamo) ===");
            System.out.println("Select a shape:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            int shapeChoice = scanner.nextInt();
            
            // Check if user wants to exit
            if (shapeChoice == 5) {
                System.out.println("Thank you for using the system");
                break;
            }
            
            // Direct to appropriate shape class based on choice
            switch (shapeChoice) {
                case 1:
                    TestRectangle.calculateRectangle();
                    break;
                case 2:
                    TestCircle.calculateCircle();
                    break;
                case 3:
                    TestSquare.calculateSquare();
                    break;
                case 4:
                    TestTriangle.calculateTriangle();
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-5.");
            }
            
            // Ask if user wants to continue with another shape
            System.out.print("\nWould you like to calculate another shape? (Yes/No): ");
            String continueChoice = scanner.next().toLowerCase();
            continueProgram = continueChoice.equals("yes");
        }
        
        System.out.println("Thank you for using the system(Murakoze Gukoresha Sisiteme!!!!!!!!)");
        scanner.close();
    }
}