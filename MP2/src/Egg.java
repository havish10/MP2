import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author: hnetla8053 Date; 12/11/18
 * 
 *          This program calcs the pirice of your egg
 */
public class Egg {
    public static void main(String[] args) {
        int eggs;
        double price = 0;
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.print("Enter the amount of eggs: ");
        eggs = scanner.nextInt();
        
        if (eggs < 48) {
            double pricePerDozen = 0.5;
            double wholePrice = eggs / 12 * pricePerDozen;
            double leftoverPrice = eggs % 12 * (pricePerDozen / 12);

            price = leftoverPrice + wholePrice;
        } else if (eggs < 72) {
            double pricePerDozen = 0.45;
            double wholePrice = eggs / 12 * pricePerDozen;
            double leftoverPrice = eggs % 12 * (pricePerDozen / 12);

            price = leftoverPrice + wholePrice;
        } else if (eggs < 11 * 12) {
            double pricePerDozen = 0.4;
            double wholePrice = eggs / 12 * pricePerDozen;
            double leftoverPrice = eggs % 12 * (pricePerDozen / 12);

            price = leftoverPrice + wholePrice;
        } else if (eggs > 11 * 12) {
            double pricePerDozen = 0.35;
            double wholePrice = eggs / 12 * pricePerDozen;
            double leftoverPrice = eggs % 12 * (pricePerDozen / 12);

            price = leftoverPrice + wholePrice;
        } 
        
        System.out.println(formatter.format(price));
        scanner.close();
    }
}   
