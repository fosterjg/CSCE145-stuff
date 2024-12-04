//Joi Foster
import java.util.Scanner;
import java.util.Random;
public class Homework3 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random r = new Random();
		
		
				 while (true) {
			            int playerScore = 0, computerScore = 0;

			            for (int round = 0; round < 3; round++) {
			                System.out.print("Enter rock, paper, or scissors: ");
			                String playerMove = key.nextLine().toLowerCase();
			                int computerMove = r.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors

			                // Show computer's choice
			                if (computerMove == 0) {
			                    System.out.println("Computer chose: rock");
			                } else if (computerMove == 1) {
			                    System.out.println("Computer chose: paper");
			                } else {
			                    System.out.println("Computer chose: scissors");
			                }

			                // Check valid player input
			                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
			                    // Determine winner for each round
			                    if (playerMove.equals("rock") && computerMove == 2 ||
			                        playerMove.equals("paper") && computerMove == 0 ||
			                        playerMove.equals("scissors") && computerMove == 1) {
			                        System.out.println("You win this round!");
			                        playerScore++;
			                    } else if ((playerMove.equals("rock") && computerMove == 0) ||
			                               (playerMove.equals("paper") && computerMove == 1) || 
			                               (playerMove.equals("scissors") && computerMove == 2)) {
			                        System.out.println("It's a draw!");
			                    } else {
			                        System.out.println("Computer wins this round!");
			                        computerScore++;
			                    }
			                } else {
			                    System.out.println("Invalid input! Computer gets a point.");
			                    computerScore++;
			                }
			            }

			            //  winner
			            if (playerScore > computerScore) {
			                System.out.println("You won the game!");
			            } else if (computerScore > playerScore) {
			                System.out.println("Computer won the game!");
			            } else {
			                System.out.println("It's a tie!");
			            }

			            // Ask if the player wants to play again 
			            System.out.print("Play again? (yes/no): ");
			            if (key.nextLine().equalsIgnoreCase("yes")) break;
			        }
			}
		

	}

