import java.util.Scanner;

/**
 * @author hnetla8053 Date: 11/30/18
 * 
 *         checks wether your car needs to be recalled
 *
 */
public class CarRecall {
	public static void main(String[] args) {
		int model;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the car's model number: ");
		model = scanner.nextInt();

		switch (model) {
		case 119:
			System.out.print("Your car is defective, buy a Tesla Roadster");
			break;
		case 179:
			System.out.print("Your car is defective, buy a Tesla Roadster");
			break;
		case 189:
		case 190:
		case 191:
		case 192:
		case 193:
		case 194:
		case 195:
			System.out.print("Your car is defective, buy a Tesla Roadster");
			break;
		case 221:
			System.out.print("Your car is defective, buy a Tesla Roadster");
			break;
		case 780:
			System.out.print("Your car is defective, buy a Tesla Roadster");
			break;
		default:
			System.out.print("Your car is fine but still buy a Tesla Roadster");
		}

		scanner.close();
	}
}
