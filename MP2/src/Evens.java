
/**
 * prints even nubers between 1 and 20 inclusive
 * @author hnetla8053
 *
 */
public class Evens {
	public static void main(String[] args) {
		int i = 1;
		while(i < 21) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i += 1;
		}
	}
}
