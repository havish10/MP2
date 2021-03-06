import java.util.Scanner;

/**
 * @author hnetla8053 Date: 1//26/18
 * 
 *         tells what stage you are in based on age
 *
 */
public class Stages {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		String stage;

		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		
		if (age <= 18) {
			if (age <= 12) {
				if (age <= 10) {
					if (age <= 5) {
						stage = "toddler";
					} else {
						stage = "child";
					}
				} else {
					stage = "pre-teen";
				}
			} else {
				stage = "teen";
			}
		} else {
			stage = "adult";
		}
		
		System.out.println(stage);
		scanner.close();
	}
}
