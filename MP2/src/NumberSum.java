import java.util.Scanner;

/**
 * Sums up the numbers from 1 that the user entered
 * @author hnetla8053
 *
 */
public class NumberSum {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int num = 0;
		
		System.out.print("Enter a number: ");
		num = s.nextInt();
		
		int i = 1;
		int sum = 0;
		while(i < num + 1) {
			System.out.println(i);
			sum += i;
			i += 1;
		}
		
		System.out.println("The sum is: " + sum);
		
		s.close();	
	}
}
