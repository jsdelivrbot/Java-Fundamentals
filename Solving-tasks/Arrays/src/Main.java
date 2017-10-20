import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    ArrayList<Double> list = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      System.out.println(list.size());
      list.add(1.0);
    }

    System.out.println(list.size());

    //    double[] numbers = {1, 2, 3, 4, 5, 1.2};
//    double[] numbers2 = new double[6];
//    numbers2[0] = 1;
//    numbers2[1] = 2;
    //.....
//    String result = "";
//    for (double number
//      : numbers) {
//      result += number + ", ";
//    }
//
//    for (int i = 0; i < numbers.length; i++) {
//      double number = numbers[i];
//      result += number + ", ";
//    }
//
//    System.out.println(
//      result.substring(0, result.length() - ", ".length()));
  }
}
