import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    String str = "666";

    int start = 0;

    for (int j = 666;; j++) {
      String str2 = Integer.toString(j);
      if(start==n)break;
      if (str2.contains("666")){
          str = str2;
          start++;
        }

      }
 
      System.out.print(str);
    }

  }