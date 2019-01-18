import java.util.Scanner;

/**
 * @author hnetla8053 Date: 1/10 Prompts user for values
 *
 */
public class Prompter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min, max = 0;
		int guess = 0;
		
		System.out.print("Enter the MIN value: ");
		min = scanner.nextInt();
		
		System.out.print("Enter the MAX value: ");
		max = scanner.nextInt();
		
		System.out.print("Enter a value between " + min + " and " + max + ": ");
		guess = scanner.nextInt();
		
		while(!(guess < max && guess > min)) {
			System.out.print("Enter a value between " + min + " and " + max + ": ");
			guess = scanner.nextInt();
		}
		scanner.close();
	}
}
