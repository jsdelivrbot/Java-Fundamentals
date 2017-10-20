import java.util.Scanner;

public class Main {
  /*
  Classical play cards use the following
  signs to designate the card face:
  2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A.

  Write a program that enters a string and prints
  "yes CONTENT_OF_STRING" if it is a valid card sign
  or "no CONTENT_OF_STRING" otherwise.

  GOSHO E PICH
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String cardString = in.nextLine();

    switch (cardString) {
      case "2":
      case "3":
      case "4":
      case "5":
      case "6":
      case "7":
      case "8":
      case "9":
      case "10":
      case "J":
      case "Q":
      case "K":
      case "A":
        System.out.println("yes " + cardString);
        break;
      default:
        System.out.println("no " + cardString);
        break;
    }

    if (cardString.equals("2")
      || cardString.equals("3")
      || cardString.equals("4")
      || cardString.equals("5")
      || cardString.equals("6")
      || cardString.equals("7")
      || cardString.equals("8")
      || cardString.equals("9")
      || cardString.equals("10")
      || cardString.equals("J")
      || cardString.equals("Q")
      || cardString.equals("K")
      || cardString.equals("A")) {
      System.out.println("yes " + cardString);
    } else {
      System.out.println("no " + cardString);
    }
    //    if (cardString.length() > 2) {
//      System.out.println("no " + cardString);
//    } else if (cardString.length() == 2 && cardString != "10") {
//      System.out.println("no " + cardString);
//    } else {
//      //asdasdasdhajksydasyduiasyudiyauisd
//      // cardString.length() == 1 || cardString == "10"
//    }
  }
}
