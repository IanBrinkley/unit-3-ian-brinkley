import java.util.Scanner;
import java.text.DecimalFormat;

public class WinPercentage {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("##.0");
    // initializing games played and games won as 0 feels wrong, but the compiler gets angry otherwise.
    int gamesPlayed = 0, gamesWon = 0;
    boolean completed = false;

    while(!completed) {
      boolean success = false;
      while (!success) {
        success = false;

        // try - catch blocks:
        // "tries" to run the code in the try{} section; if this gives an exception, run code in catch{}.

        try {
          System.out.println ("Input number of games played:");
          gamesPlayed = scan.nextInt();
          System.out.println ("Input number of games won:");
          gamesWon = scan.nextInt();
          // success stays false until code reaches here without exception.
          success = true;
        } catch (Exception e) {a
          System.out.println("You must input integers.");
          scan.next();
        }
      }

      // general handling of the rest of the potential problems
      if(gamesPlayed == 0) {
        System.out.println("Games played cannot be 0.");
      } else if (gamesPlayed < gamesWon) {
        System.out.println("Games played cannot be less than games won.");
      } else if (gamesPlayed < 0 || gamesWon < 0) {
        System.out.println("Neither input can be less than 0.");

      // this runs if the user gives valid inputs
      } else {
        double winRate = ((double)gamesWon/gamesPlayed) * 100;
        System.out.println("Winrate: " + fmt.format(winRate) + "%");
        completed = true;
      }
    }
  }
}
