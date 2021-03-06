import java.util.Scanner;

/**
 * @author hnetla8053 Date: 11/30/18
 * 
 *         Confirms the weight of your package
 *
 */
public class PackageCheck {
	public static void main(String[] args) {
		double weight, surfaceArea, height, width, length;
		Scanner scanner = new Scanner(System.in);

		System.out.print(" Enter package weight in kilograms: ");
		weight = scanner.nextDouble();

		System.out.print("\n Enter package length in centimeters: ");
		length = scanner.nextDouble();

		System.out.print("\n Enter package width in centimeters: ");
		width = scanner.nextDouble();

		System.out.print("\n Enter package height in centimeters: ");
		height = scanner.nextDouble();

		surfaceArea = height * width * length;

		if (weight > 27) {
			if (surfaceArea > 100000) {
				System.out.println("Too heavy and too large");
			} else {
				System.out.println("Too heavy");
			}
		} else {
			if (surfaceArea > 0.1) {
				System.out.println("Too large");
			}
		}
		
		scanner.close();

	}
}
