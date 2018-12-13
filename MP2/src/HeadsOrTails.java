/**
 * 
 * @author netla Date: 12/13/18
 *
 * Prints random heads or tails values
 */
public class HeadsOrTails {
	public static void main(String[] args) {
		for(int i = 0; i < 11; i += 1) {
			if(Math.rint(Math.random()) == 1) {
				System.out.println("heads");
			} else {
				System.out.println("tails");
			}
		}
	}
}
