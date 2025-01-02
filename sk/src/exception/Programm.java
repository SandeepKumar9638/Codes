package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programm {

	public static void main(String[] args)  {
		
		        Scanner scanner = new Scanner(System.in);
		        boolean isValidInput = false;
		        
		        do {
		            try {
		                System.out.print("Enter the first number: ");
		                int num1 = scanner.nextInt();
		                
		                System.out.print("Enter the second number: ");
		                int num2 = scanner.nextInt();
		                
		                if (num2 == 0) {
		                    throw new ArithmeticException("Error: Division by zero is not allowed.");
		                }
		                
		                int result = num1 / num2;
		                System.out.println(num1 + " divided by " + num2 + " is " + result + ".");
		                isValidInput = true;
		                if(result==0) {
		                	throw new ArithmeticException("Error:  not allowed.");
		                }
		            } catch (InputMismatchException e) {
		                System.out.println("Error: Invalid input. Please enter numeric values.");
		                e.printStackTrace();
		                scanner.nextLine(); // Clear the input buffer
		            } catch (ArithmeticException e) {
		                System.out.println(e.getMessage());
		            }
		        } while (!isValidInput);
		        
		        scanner.close();
	}
}
