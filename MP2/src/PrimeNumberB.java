import java.util.Scanner;

/**
 * finds prime numbers between two numbers
 * 
 * @author hnetla8053
 *
 */
public class PrimeNumberB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int low = 0, high = 0;

		System.out.print("Enter a min: ");
		low = scanner.nextInt();
		System.out.print("Enter a max: ");
		high = scanner.nextInt();
		

		while (low < high) {
            boolean flag = false;
			
			int i = 2;
            while(i <= low / 2) {
				if(low % i == 0) {
					flag = true;
					break;
				}
				++i;
			}

            if (!flag)
                System.out.print(low + " ");

            ++low;
        }
		scanner.close();
    }
}
