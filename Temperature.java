import java.util.Scanner;

public class Temperature{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter temperature:");
    int temperature = scan.nextInt();
    if (temperature > 83)
      System.out.println("hot");
    else if (temperature > 67)
      System.out.println("ideal");
    else if (temperature > 44)
      System.out.println("cool");
    else
      System.out.println("cold");
  }
}
