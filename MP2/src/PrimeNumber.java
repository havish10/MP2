import java.util.Scanner;

/**
 * tells wether prime or not
 * 
 * @author hnetla8053
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Enter a number: ");
		num = scanner.nextInt();
		
		int i = 2;
		boolean flag = false;
		while(i <= num/2) {
			if(num % i == 0) {
                flag = true;
                break;
            }
			++i;
		}
		
		if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
		
		scanner.close();
	}
}
