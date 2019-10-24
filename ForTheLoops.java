import java.util.Scanner;

public class ForTheLoops{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("for the loops?");
    String mystr = scan.nextLine();
    mystr = mystr.replaceAll("[^a-zA-Z0-9 ]", "");
    for(int i = 0; i < mystr.length(); i++)
      System.out.println(mystr.charAt(i));
  }
}
