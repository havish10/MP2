import java.util.Scanner;

/**
 * @author hnetla8053 Date: 11/26/18
 * 
 *         Calculates circle circumfrence with fail safe
 */
public class CircleCircumfrence {
	public static void main(String[] args) {
		final double PI = Math.PI;
		int r;
		double c;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		r = scanner.nextInt();

		if (r < 0) {
			System.out.println("WHY ARE YOU ENETERING IN NEGATIVE RADII!!!");
			System.out.println("Try again with a positive radii: ");
			r = scanner.nextInt();
		}
		c = 2 * PI * r;

		System.out.println("The circumfrence is " + c);

		scanner.close();

	}
}
