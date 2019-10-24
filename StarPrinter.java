import java.util.Scanner;

public class StarPrinter {
  public static void main(String[]args) {
    int chosenPattern = -1;
    final int MAX_ROWS = 10;
    Scanner scan = new Scanner(System.in);
    // outer while loop, doesn't exit until user quits
    while (true) {
      // inner loop continues until the user inputs a valid integer
      while (true) {
        System.out.println("Which pattern would you like to print? Input a number 1-5, or 0 to quit.");
        // getting user input as an integer
        try {
          chosenPattern = scan.nextInt();
        } catch (Exception e) {
          System.out.println("You must input a valid integer.");
          scan.next();
          continue;
        }
        // checking if the input is between 0 and 5
        if (0 <= chosenPattern && 5 >= chosenPattern)
          break;
        else
          System.out.println("You should input a value between 0 and 5.");
      }

      // quitting if 0
      if (chosenPattern == 0) {
        System.out.println("Thank you for shopping at fancy patterns (tm)!");
        break;

      } else {
        if (chosenPattern <= 3) {
          for (int row = 1; row <= 10; row++) {
            //10 columns
            for (int col = 1; col <= 10; col++) {

              //Pattern #1
              if (chosenPattern == 1) {
                if (col <= MAX_ROWS - (row - 1)) {
                  System.out.print("*");
                } else {
                  System.out.print(" ");
                }

              //Pattern #2
              } else if (chosenPattern == 2) {
                if (col <= MAX_ROWS - row) {
                  System.out.print(" ");
                } else {
                  System.out.print("*");
                }

              //Pattern #3
              } else {
                if (col < row) {
                  System.out.print(" ");
                } else {
                  System.out.print("*");
                }
              }

            }
            System.out.println("");
          }
        } else {
          for (int row = -5; row <= 5; row++) {
            // get rid of 0 because it's hard to work with
            if (row == 0) continue;
            //9 columns because 4 and 5 are symmetrical
            for (int col = -4; col <= 4; col++) {

              //Pattern #4
              if (chosenPattern == 4) {
                if (MAX_ROWS/2 - Math.abs(col) >= Math.abs(row)) {
                  System.out.print("*");
                } else {
                  System.out.print(" ");
                }

              //Pattern #5
              } else {
                if (Math.abs(col) < Math.abs(row)) {
                  System.out.print("*");
                } else {
                  System.out.print(" ");
                }
              }

            }
            System.out.println("");
          }
        }
      }
    }
  }
}
