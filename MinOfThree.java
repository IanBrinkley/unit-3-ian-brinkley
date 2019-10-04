import java.util.Scanner;

public class MinOfThree{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input 3 numbers, separated by newlines:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();
    // System.out.println("The minimum is: " + Math.min(Math.min(num1, num2), num3));
    int mini = 0;
    if (num1 < num2 && num1 < num3) mini = num1;
    else if (num2 < num1 && num2 < num3) mini = num2;
    else mini = num3;
    System.out.println("The minimum is: " + mini);
  }
}
