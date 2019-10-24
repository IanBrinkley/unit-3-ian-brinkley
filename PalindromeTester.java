import java.util.Scanner;

public class PalindromeTester{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.println("Would you like to input a palindrome? (y/n)");
      String answer = scan.nextLine();
      if(answer.toLowerCase().charAt(0) == 'y') {
        break;
      }
    }
    System.out.println("Input your palindrome to be tested:");
    String input = scan.nextLine();

    String mut1 = input.replaceAll("[^a-zA-Z0-9]", "");
    //String mut1 = input.replace(" ", "").replace(",","").replace(".", "").replace("!", "").replace("?", "").replace("'", "");
    String mut2 = mut1.toLowerCase();

    String mut2Rev = "";
    int i = mut2.length();
    while(i > 0) {
      i -= 1;
      mut2Rev += mut2.charAt(i);
    }
    if (mut2.compareTo(mut2Rev) == 0) {
      System.out.println("Your string \"" + input + "\" is a palindrome!");
    } else {
      System.out.println("Your string \"" + input + "\" is not a palindrome.");
    }
  }
}
