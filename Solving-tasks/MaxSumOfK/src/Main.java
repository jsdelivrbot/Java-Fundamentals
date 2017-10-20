import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
8
3
3
2
3
-2
5
4
2
7
     */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();

    Stack<Integer> selected = new Stack<>();
    Stack<Integer> tmp = new Stack<>();

    for (int i = 0; i < n; i++) {
      int number = in.nextInt();

      if (selected.size() < k) {
        selected.push(number);
        continue;
      }

      while (!selected.empty() && selected.peek() < number) {
        tmp.push(selected.pop());
      }

      selected.push(number);
      while (!tmp.empty() && selected.size() < k) {
        selected.push(tmp.pop());
      }
    }
    int sum = 0;
    while (!selected.empty()) {
      sum += selected.pop();
    }
    System.out.println(sum);
    //
//
//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//    int k = in.nextInt();
//    ArrayList<Integer> list = new ArrayList<>();
//
//    for (int i = 0; i < n; i++) {
//      list.add(in.nextInt());
//    }
//
//    list.sort(Comparator.naturalOrder());
//    int sum = 0;
//
//    for (int i = 0; i < k; i++) {
//      int index = list.size() - 1 - i;
//      sum += list.get(index);
//    }
//
//    System.out.println(sum);

//    int sum = 0;
//    boolean[] used = new boolean[n];
//    // boolean -> false
//    // int, double, long, ... -> 0/0.0, null
//
//    // 7 1 2 3 4 5
//    for (int i = 0; i < k; i++) {
//      int max = Integer.MIN_VALUE;
//      int index = 0;
//
//      for (int j = 0; j < list.size(); j++) {
//        if (!used[j] && max < list.get(j)) {
//          max = list.get(j);
//          index = j;
//        }
//      }
//
//      used[index] = true;
//      sum += max;
//    }
//
//    System.out.println(sum);
  }
}
