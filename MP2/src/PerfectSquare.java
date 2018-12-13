import java.util.Scanner;

/**
 * @author netla Date: 12/13/18
 * 
 *         Tells the user wethere the number is a perfect square
 *
 */
public class PerfectSquare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.print("Enter an integer: ");
		number = scanner.nextInt();

		if (Math.sqrt(number) % 1 == 0) {
			System.out.println("Perfect Square");
		} else {
			System.out.println("Not a perfect Square");	
		}

	}
}
