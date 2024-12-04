import java.util.Scanner;
public class CoffeeTester {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String response;

	        System.out.println("Welcome to the Coffee Hour!!!");

	        do {
	            // Get details for the first coffee
	            Coffee coffee1 = createCoffee(scanner, "first");

	            // Display information about the first coffee
	            System.out.println(coffee1);
	            System.out.printf("It would take %.1f cups of %s before it’s dangerous to drink more.\n", coffee1.riskyAmount(), coffee1.getName());

	            // Get details for the second coffee
	            Coffee coffee2 = createCoffee(scanner, "second");

	            // Display information about the second coffee
	            System.out.println(coffee2);
	            System.out.printf("It would take %.1f cups of %s before it’s dangerous to drink more.\n", coffee2.riskyAmount(), coffee2.getName());

	            // Check if both coffee objects are the same
	            System.out.println("Are both coffee’s the same? " + coffee1.equals(coffee2));

	            
	            System.out.print("Do you want to create more coffee objects? Enter 'Yes' or 'No': ");
	            response = scanner.nextLine();

	        } while (response.equalsIgnoreCase("Yes"));

	        System.out.println("Thank you for using the Coffee Hour program!");
	        scanner.close();
	    }

	    
	    private static Coffee createCoffee(Scanner scanner, String coffeeOrder) {
	        System.out.printf("What’s the name of the %s coffee?\n", coffeeOrder);
	        String name = scanner.nextLine();

	        int caffeineContent = 0;
	        while (true) {
	            System.out.print("What’s the caffeine content? ");
	            try {
	                caffeineContent = Integer.parseInt(scanner.nextLine());
	                if (caffeineContent >= 50 && caffeineContent <= 300) {
	                    break;
	                } else {
	                    System.out.println("Please enter a value between 50 and 300.");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter an integer.");
	            }
	        }

	        // Create and return a Coffee object with the entered details
	        return new Coffee(name, caffeineContent);
	    }
	}
