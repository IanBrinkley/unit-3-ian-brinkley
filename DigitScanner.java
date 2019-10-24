import java.util.Scanner;

public class DigitScanner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input your number:");
    int input = scan.nextInt();

    int odds = 0;
    int evens = 0;
    int zeroes = 0;

    int len = Integer.toString(input).length();
    for (int i = 0; i < len; i++) {
      if (input % 10 == 0)
        zeroes += 1;
      else if (input % 2 == 0)
        evens += 1;
      else
        odds += 1;
      input /= 10;
    }
    System.out.println("Odds: " + odds + ", Evens: " + evens + ", Zeroes (not counted as evens): " + zeroes);
  }
}
