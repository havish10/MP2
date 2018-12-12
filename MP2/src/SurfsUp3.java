import java.util.Scanner;

/**
 * @author hnetla8053 Date: 11/26/18
 * 
 *         Tells you what to do based on a wave height
 */
public class SurfsUp3 {
	public static void main(String[] args) {
		double height;
		String stage;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a wave height: ");
		height = scanner.nextDouble();
		
		if(height < 6) {
			if(height > 3) {
				stage = "Go for a swim";
			} else {
				stage="Whoa! What kind of surf is that";
			}
		} else {
			stage = "Go Body Boarding";
		}
		
		System.out.println(stage);
		scanner.close();
	}
}
