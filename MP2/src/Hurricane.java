import java.util.Scanner;

/**
 * @author hnetla8053 Date: 11/20/18
 * 
 *         This program provides the rating for hurricanes
 *
 */
public class Hurricane {
	public static void main(String[] args) {
		int scale = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the intensity of the storm: ");
		scale = scanner.nextInt();

		switch (scale) {
		case 1:
			System.out.print("74-95 mph or 64-82 kt or 119-153 km/hr");
			break;
		case 2:
			System.out.print("96-110 mph or 83-95 kt or 154-177 km/hr");
			break;
		case 3:
			System.out.print("111-130 mph or 96-113 kt or 178-209 km/hr");
			break;
		case 4:
			System.out.print("121-155 mph or 114-135 kt or 210-249 km/hr");
			break;
		case 5:
			System.out.print("greater than 155 mph or 135 kt pr 249 km/hr");
			break;
		default:
			System.out.print("Your number is not supported yet");
			break;
		}
		scanner.close();
	}
}
