import java.util.Scanner;

/**
 * calculates percentage of people with 70 or over
 * @author hnetla8053
 *
 */
public class PercentPasing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0, above70 = 0, total = 0;
		
		while (score != -1) {
			System.out.print("Enter score, -1 to stop: ");
			score = scanner.nextInt();
			
			if(score > 70) {
				above70 += 1;
			}
			total += 1;
		}
		double percentage = ((double)above70 / ((double)total-1) * 100);
		System.out.println("The percentage of scores above 70% is: " + percentage + "%");
		scanner.close();
	}
}
