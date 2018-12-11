import java.util.Scanner;

/**
 * @author hnetla8053 Date: 12/10/18
 * 
 * 
 *
 */
public class Delivery {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double d1, d2, d3;

		System.out.print("Enter First Dimension: ");
		d1 = scanner.nextDouble();

		System.out.print("\nEnter Second Dimension: ");
		d2 = scanner.nextDouble();

		System.out.print("\nEnter First Dimension: ");
		d3 = scanner.nextDouble();

		if (d1 > 10 || d2 > 10 || d3 > 10) {
			System.out.println("Reject");
		} else {
			System.out.println("Accept");
		}

		scanner.close();
	}
}
