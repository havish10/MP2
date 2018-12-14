import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c;

		System.out.print("Enter value for a: ");
		a = scanner.nextDouble();
		System.out.print("Enter value for b: ");
		b = scanner.nextDouble();
		System.out.print("Enter value for c: ");
		c = scanner.nextDouble();

		double answer1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		double answer2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

		System.out.println("The roots are " + answer1 + " and " + answer2);
		
		scanner.close();

	}
}
