import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("How many pizzas?");
        int totalPizzas = scan.nextInt();
        if(totalPizzas < 0){
            System.out.println("Cannot have negative pizzas.");
            System.exit(0);
        }
        
        System.out.print("How many slices per pizza?");
        int slicesPerPizza = scan.nextInt();
        if (slicesPerPizza < 0){
            System.out.println("Cannot have negative slices.");
            System.exit(0);
        }
        
        System.out.print("How many people?");
        int totalPeople = scan.nextInt();
        if (totalPeople < 0){
            System.out.println("Cannot have negative people.");
            System.exit(0);
        }
        
        int numSlicesLeft = (totalPizzas * slicesPerPizza) % totalPeople;
        int numPizzaLeft = numSlicesLeft / slicesPerPizza;
        int numSlices = (numPizzaLeft * totalPeople) - numSlicesLeft;
        System.out.println("There are "+ numPizzaLeft + " whole pizzas and " + numSlices + " slices left.");
        scan.close();
    }
}