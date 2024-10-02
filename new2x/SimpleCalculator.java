import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello! This is Simple Calculator from WMA4B");
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        
        int choice = scanner.nextInt();
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        switch (choice) {
            case 1:
                System.out.println("Result: " + addition(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtraction(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiplication(num1, num2));
                break;
            case 4:
                try {
                    System.out.println("Result: " + division(num1, num2));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 5:
                System.out.println("Result: " + modulus(num1, num2));
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}