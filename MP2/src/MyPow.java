import java.util.Scanner;

/**
 * @author netla Date: 12/13/18
 * 
 * Finds the value of x^y in two ways
 *
 */
public class MyPow {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		double exp1, exp2; 
		
		System.out.print("Enter a value for X: ");
		x = scanner.nextInt();
		System.out.print("Enter a value for Y: ");
		y = scanner.nextInt();
		
		exp1 = Math.exp(y * Math.log(x));
		exp2 = Math.pow(x, y);
				
		System.out.println("\nThe result from using the formula is: " + exp1);
		System.out.println("The result from using Math.pow() method is: " + exp2);
		scanner.close();
	}
}
