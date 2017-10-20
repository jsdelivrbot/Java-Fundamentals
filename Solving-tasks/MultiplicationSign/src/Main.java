public class Main {

  /*
  Write a program that shows the sign (+, - or 0)
  of the product of three real numbers, without calculating it.

  Use a sequence of if operators.
   */
  public static void main(String[] args) {
    double x = -1.3;
    double y = 1.2;
    double z = -1;


    if (x == 0 || y == 0 || z == 0) {
      System.out.println("0");
    } else {
      int minusCounts = 0;

      if (x < 0) {
        minusCounts += 1;
      }

      if (y < 0) {
        minusCounts += 1;
      }

      if (z < 0) {
        minusCounts += 1;
      }

      if (minusCounts == 0 || minusCounts == 2) {
        System.out.println("+");
      } else {
        System.out.println("-");
      }
    }

    if (x == 0 || y == 0 || z == 0) {
      System.out.println("0");
    } else {
      // all are not 0
      if (x < 0) {
        if (y < 0) {
          // x*y > 0
          if (z < 0) {
            System.out.println("-");
          } else {
            System.out.println("+");
          }
        } else {
          // x * y < 0
          if (z > 0) {
            System.out.println("-");
          } else {
            System.out.println("+");
          }
        }
      } else {
        // x > 0
        if (y < 0) {
          // x*y < 0
          if (z < 0) {
            System.out.println("+");
          } else {
            System.out.println("-");
          }
        } else {
          // x * y > 0
          if (z > 0) {
            System.out.println("+");
          } else {
            System.out.println("-");
          }
        }
      }
    }

  }
}
