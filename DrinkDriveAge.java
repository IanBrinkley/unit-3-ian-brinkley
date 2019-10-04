import java.util.Scanner;

public class DrinkDriveAge{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter age:");
    int age = scan.nextInt();
    if (age < 17)
      System.out.println("You are not old enough to drink or drive.");
    else if (age < 21)
      System.out.println("You are not old enough to drink, but you can drive.");
    else
      System.out.println("You are old enough to drink and drive (not at the same time!)");
  }
}
