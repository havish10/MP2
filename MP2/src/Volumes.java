import java.util.Scanner;

/**
 * @author netla Date: 12/13/18
 * 
 *         Calculates various volumes
 */
public class Volumes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double l, w, h;
		double d;
		double s;

		// Rectangle
		System.out.println("Rectangular Prism");
		System.out.print("Enter the length: ");
		l = scanner.nextDouble();
		System.out.print("Enter the width: ");
		w = scanner.nextDouble();
		System.out.print("Enter the height: ");
		h = scanner.nextDouble();

		System.out.println("The volume is " + l * w * h + "\n");

		// Sphere
		System.out.println("Spheroid");
		System.out.print("Enter the radius: ");
		d = scanner.nextDouble();

		System.out.println("The volume is " + (Math.PI * Math.pow(d * 2, 3)) / 6 + "\n");

		// Sphere
		System.out.println("Cubeoid");
		System.out.print("Enter the length of each side: ");
		s = scanner.nextDouble();

		System.out.print("The volume is " + Math.pow(s, 3));
		
		scanner.close();
	}
}
