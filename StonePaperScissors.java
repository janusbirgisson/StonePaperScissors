import java.util.Scanner;

public class StonePaperScissors {
    public static void main(String[] args) {
        String[] choices = {"stone", "paper", "scissors"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        String userChoice = scanner.nextLine();
        String computerChoice = choices[(int) (Math.random() * 3)];
        System.out.println("Computer choice: " + computerChoice);
        if (userChoice.equals(computerChoice)) {
            System.out.println("Tie!");
        }
        else if (userChoice.equals("stone")) {
            if (computerChoice.equals("paper")) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }
        }
        else if (userChoice.equals("paper")) {
            if (computerChoice.equals("scissors")) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }
        }
        else if (userChoice.equals("scissors")) {
            if (computerChoice.equals("stone")) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }
        }

    }

    }
