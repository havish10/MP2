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
            double pd = 0.5;
            double x = eggs / 12 * pd;
            double y = eggs % 12 * (pd / 12);

            price = y + x;
        } else if (eggs < 72) {
            double pd = 0.45;
            double x = eggs / 12 * pd;
            double y = eggs % 12 * (pd / 12);

            price = y + x;
        } else if (eggs < 11 * 12) {
            double pd = 0.4;
            double x = eggs / 12 * pd;
            double y = eggs % 12 * (pd / 12);

            price = y + x;
        } else if (eggs > 11 * 12) {
            double pd = 0.35;
            double x = eggs / 12 * pd;
            double y = eggs % 12 * (pd / 12);

            price = y + x;
        } 
        
        System.out.println(formatter.format(price));

    }
}   
