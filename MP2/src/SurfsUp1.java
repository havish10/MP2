import java.util.Scanner;

/**
 * @author hnetla8053 Date: 11/26/18
 * 
 * Checks whether the wave height is good for surfing
 */
public class SurfsUp1 {
	public static void main(String[] args) {
		double height;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a wave height: ");
		height = scanner.nextDouble();

		if (height >= 6) {
			System.out.println("Its a great day for surfing!");
		}
		scanner.close();
	}
}
