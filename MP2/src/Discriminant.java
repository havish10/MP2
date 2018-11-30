import java.util.Scanner;

/**
 * @author hnetla8053 Date: 11/28/18
 * 
 *         This program finds out how many roots a quadratic has.
 *
 */
public class Discriminant {
	public static void main(String[] args) {
		String roots;
		double discriminant;
		double a;
		double b;
		double c;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Enter 'a' value: ");
		a = scanner.nextDouble();
		
		System.out.print("\n Enter 'b' value: ");
		b = scanner.nextDouble();
		
		System.out.print("\n Enter 'c' value: ");
		c = scanner.nextDouble();
		
		discriminant = Math.pow(b, 2) + (-4 * a * c);
		
		if(discriminant < 0) {
			roots = "No roots";
		} else if(discriminant == 0) {
			roots = "One root";
		} else {
			roots = "Two root";
		}
		
		System.out.println(roots);
		scanner.close();
		
	}
}
