import java.util.Random;
import java.util.Scanner;

/**
 * @author netla Date: 12/13/18
 * 
 *         Generates Math problems
 *
 */
public class MathTutor {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		double firstTerm, secondTerm, operatorRandom;
		double finalAns;
		char operator;

		firstTerm = rand.nextInt(10) + 1;
		secondTerm = rand.nextInt(10) + 1;

		operatorRandom = rand.nextInt(4) + 1;

		if (operatorRandom == 1) {
			operator = '+';
			finalAns = firstTerm + secondTerm;
		} else if (operatorRandom == 2) {
			operator = '-';
			finalAns = firstTerm - secondTerm;
		} else if (operatorRandom == 3) {
			operator = '*';
			finalAns = firstTerm * secondTerm;
		} else {
			operator = '/';
			finalAns = firstTerm / secondTerm;
		}

		System.out.print("What is: " + (int)firstTerm + operator + (int)secondTerm + "?");
		if(finalAns == scanner.nextDouble()) {
			System.out.println("Correct");
		} else {
			System.out.println("Wrong");
		}
		scanner.close();
	}
}
