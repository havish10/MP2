import java.util.Scanner;

/**
 * @author netla Date: 12/13/18
 * 
 *         Finds roots of a quad function
 *
 */
public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c, answer1 = 0, answer2 = 0;
		double discriminant;

		System.out.print("Enter value for a: ");
		a = scanner.nextDouble();
		System.out.print("Enter value for b: ");
		b = scanner.nextDouble();
		System.out.print("Enter value for c: ");
		c = scanner.nextDouble();

		discriminant = Math.pow(b, 2) + (-4 * a * c);

		if (discriminant < 0) {
			System.out.println("No roots");
		} else {
			answer1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			answer2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			System.out.println("The roots are " + answer1 + " and " + answer2);
		}

		scanner.close();

	}
}
