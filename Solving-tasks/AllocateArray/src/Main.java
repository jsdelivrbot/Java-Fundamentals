import java.util.Scanner;

public class Main {
  /*
  Write a program that allocates array of N integers,
  initializes each element by its index multiplied by 5
  and the prints the obtained array on the console.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int[] numbers = new int[n];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i * 5;
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
