//Joi Foster
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
        // Start of the game
        System.out.println("Welcome to 'Escape Candy Land'!");
        System.out.println("You're trapped in a world made of candy. Your goal is to escape.");
        System.out.println("Make your choices wisely, or you'll be stuck here forever!");

        // First decision: Path choice
        System.out.println("You see two paths ahead:");
        System.out.println("1. Follow the licorice path.");
        System.out.println("2. Follow the chocolate river.");
        int choice = key.nextInt();

        // Licorice path
        if (choice == 1) {
            System.out.println("You walk along the licorice path.");
            System.out.println("After a while, you see a gingerbread house.");
            System.out.println("Do you want to:");
            System.out.println("1. Enter the gingerbread house.");
            System.out.println("2. Climb the candy cane tree outside.");
            int licoriceChoice = key.nextInt();

            // Inside the gingerbread house or candy cane tree
            if (licoriceChoice == 1) {
                System.out.println("Inside the gingerbread house, you find a talking gingerbread man.");
                System.out.println("He offers you a candy apple. Do you eat it?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int appleChoice = key.nextInt();

                if (appleChoice == 1) {
                    System.out.println("The candy apple was cursed! You fall into a deep sleep.");
                    System.out.println("Ending 1: You are trapped in a sugary slumber forever.");
                } else {
                    System.out.println("You politely decline and find a hidden door in the back.");
                    System.out.println("Ending 2: You escape Candy Land!");
                }
            } else {
                System.out.println("You climb the candy cane tree and find a portal at the top.");
                System.out.println("Ending 3: You escape Candy Land through the portal!");
            }
        } 
        // Chocolate river path
        else if (choice == 2) {
            System.out.println("You follow the chocolate river, but the current is strong.");
            System.out.println("Do you want to:");
            System.out.println("1. Ride a marshmallow boat.");
            System.out.println("2. Try to swim to the candy shore.");
            int riverChoice = key.nextInt();

            // Marshmallow boat or swimming choice
            if (riverChoice == 1) {
                System.out.println("You ride the marshmallow boat, but there's a waterfall ahead!");
                System.out.println("Do you want to:");
                System.out.println("1. Paddle to the side.");
                System.out.println("2. Go over the waterfall.");
                int boatChoice = key.nextInt();

                if (boatChoice == 1) {
                    System.out.println("You paddle to the side and find a hidden exit.");
                    System.out.println("Ending 4: You escape through the secret tunnel!");
                } else {
                    System.out.println("The boat goes over the waterfall and dissolves.");
                    System.out.println("Ending 5: You are lost in the chocolate river!");
                }
            } else {
                System.out.println("You jump into the river and try to swim to the shore.");
                System.out.println("How strong are you on a scale of 1 to 10?");
                int strength = key.nextInt();

                if (strength >= 7) {
                    System.out.println("You manage to swim to the shore and find an exit.");
                    System.out.println("Ending 6: You escape Candy Land by swimming to the shore!");
                } else {
                    System.out.println("The current is too strong, and you are swept away.");
                    System.out.println("Ending 7: You are lost in the chocolate abyss!");
                }
            }
        } 
        // Invalid input
        else {
            System.out.println("Invalid choice. Please restart the game.");
        }

	}
}