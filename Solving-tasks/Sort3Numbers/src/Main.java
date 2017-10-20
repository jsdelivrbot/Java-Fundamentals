public class Main {

  /*
Write a program that enters 3 real numbers and prints
them sorted in descending order.

- Use nested if statements.
- Don’t use arrays and the built-in sorting functionality.
  3 2 1 -> 1 2 3
  2 1 3 -> 1 2 3
   */
  public static void main(String[] args) {
    double x = -1;
    double y = 0;
    double z = -10;

    // min = x
    // max = y
    // mid = x + y + z - min - max;

    if (x < y && y < z) {
      System.out.println(x + " " + y + " " + z);
    } else if (x < y && x < z && z < y) {
      System.out.println(x + " " + z + " " + y);
    } else if (y < x && x < z) {
      System.out.println(y + " " + x + " " + z);
    } else if (y < x && y < z && z < x) {
      System.out.println(y + " " + z + " " + x);
    } else if (z < x && x < y) {
      System.out.println(z + " " + x + " " + y);
    } else {
      System.out.println(z + " " + y + " " + x);
    }

    if (x < y) {
      if (x < z) {
        if (y < z) {
          System.out.println(x + " " + y + " " + z);
        } else {
          System.out.println(x + " " + z + " " + y);
        }
      } else {
        System.out.println(z + " " + x + " " + y);
      }
    } else {
      if (y < z) {
        if (x < z) {
          System.out.println(y + " " + x + " " + z);
        } else {
          System.out.println(y + " " + z + " " + x);
        }
      } else {
        System.out.println(z + " " + y + " " + x);
      }
    }
  }
}
