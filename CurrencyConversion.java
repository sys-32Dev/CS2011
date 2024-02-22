/* Name 1 Edwin Hui  
 * Name 2 Laura Martinez
 * Your Course Number CS2011
 * Your Section Numbers: 9 & 10
 * Description: This lab introduces the use of the Scanner class to read input from the keyboard.        
 * Other Comments: NA
 */
import java.util.Scanner;
public class CurrencyConversion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        System.out.print("How much yen are you exchanging? ");
        double yen = scan.nextDouble();
        double usd = yen / 146.36;
        System.out.println(yen + " yen is " + usd + " U.S. dollars.");
        scan.close();
    }
}
