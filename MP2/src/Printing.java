import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author hnetla8053 Date: 11/28/18
 * 
 *         Prints price info based on number of copies
 *
 */
public class Printing {
	public static void main(String[] args) {
		int copies = 0;
		double ppc = 0;
		Scanner scanner = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		System.out.print("Enter the number of copies: ");
		copies = scanner.nextInt();

		if (copies > 1000) {
			ppc = 0.25;
		}
		if (copies < 1000) {
			ppc = 0.26;
		}
		if (copies < 750) {
			ppc = 0.27;
		}
		if (copies < 500) {
			ppc = 0.28;
		}
		if (copies < 100) {
			ppc = 0.30;
		}

		System.out.println("Price per copy is: " + formatter.format(ppc));
		System.out.println("Total cost: " + formatter.format(ppc * copies));

		scanner.close();
	}
}
