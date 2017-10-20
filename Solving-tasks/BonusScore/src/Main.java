import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();

    // If the score is less than 0 or more than 9, the program prints "invalid score".
    if (x < 1 || x > 9) {
      System.out.println("Invalid score");
    } else if (x < 4) {
      // If the score is between 1 and 3, the program multiplies it by 10.
      System.out.println(x * 10);
    } else if (x < 7) {
      // If the score is between 4 and 6, the program multiplies it by 100.
      System.out.println(x * 100);
    } else {
      // If the score is between 7 and 9, the program multiplies it by 1000.
      System.out.println(x * 1000);
    }
  }
}
