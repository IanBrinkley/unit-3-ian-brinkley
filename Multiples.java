import java.util.Scanner;

public class Multiples {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean success = false;
    while (!success) {
      System.out.println("Input a number to get the multiples of:");
      int base = scan.nextInt();
      System.out.println("Input upper bound for multiples:");
      int bound = scan.nextInt();
      if (base < 1 || bound <= 1) {
        System.out.println("Base and bound must each be greater than 1." + "\n");
      } else if (bound < base) {
        System.out.println("Bound must be greater than base." + "\n");
      } else {
        for (int i = base; i <= bound; i += base)
          System.out.print((i / base % 5 == 0) ? (i + "\n") : (i + " "));
        success = true;
      }
    }
  }
}
