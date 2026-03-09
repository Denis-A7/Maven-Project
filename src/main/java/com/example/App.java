import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator Application ===");
        System.out.println();
        
        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = performCalculation(num1, operator, num2);
            
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            System.out.println();
            
            System.out.print("Do you want to continue? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for using the calculator!");
                break;
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static double performCalculation(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    return 0;
                }
                return num1 / num2;
            case '%':
                return num1 % num2;
            default:
                System.out.println("Invalid operator!");
                return 0;
        }
    }
}
