import java.util.Scanner;
import java.util.InputMismatchException;
	public class InputMismatchException1 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	
	System.out.println("Enter two integers: ");
	int number1 = 0;
	int number2 = 0;
	boolean isValid = false; 
	while (!isValid) {
		
		try {
			number1 = input.nextInt();
			number2 = input.nextInt();
			 isValid = true;
		} catch (InputMismatchException ex) {
			input.nextLine();
			System.out.println("Invalid input ....");
			System.out.println("Enter two integers: ");
		}
	}
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));		
 }
}
		

 
 /**
 *Write a program that prompts the user to read two integers 
 *and displays their sum. Your program should prompt the 
 *user to read the number again if the input is incorrect.
 *
 */

