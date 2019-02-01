import java.util.Scanner;

/**
 * finds the prime factors
 * 
 * @author hnetla8053
 *
 */
public class PrimeNumberB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = 2;
		int num = 0;
		
		System.out.println("Enter a number: ");
		num = scanner.nextInt();
		
		while(counter <= num) {
			if(num % counter == 0) {
				System.out.println(counter);
				num /= counter;
			} else {
				counter += 1;
			}
		}
		scanner.close();

	}
}
