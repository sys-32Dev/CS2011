/* Name 1 Edwin Hui  
 * Name 2 Laura Martinez
 * Your Course Number CS2011
 * Your Section Numbers: 9 & 10
 * Description: This lab introduces the use of the Scanner class to read input from the keyboard.        
 * Other Comments: NA
 */
import java.util.Scanner;
public class PizzasForThePeople {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("How many pizzas?");
        int totalPizzas = scan.nextInt();

        System.out.print("How many slices per pizza?");
        int slicesPerPizza = scan.nextInt();

        
        System.out.print("How many people?");
        int totalPeople = scan.nextInt();

        
        int numSlicesUncalc = (totalPizzas * slicesPerPizza) % totalPeople;
        int numPizzaLeft = numSlicesUncalc / slicesPerPizza;
        int numSlices = numSlicesUncalc % slicesPerPizza;
        if (numPizzaLeft == 0){
            numSlices = numSlicesUncalc;
        }

        System.out.println("There are "+ numPizzaLeft + " whole pizzas and " + numSlices + " slices left.");
        scan.close();
    }
}
