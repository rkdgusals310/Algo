import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int n = s.nextInt();
    int m = s.nextInt();
    int x = s.nextInt();
    int y = s.nextInt();
    int k = s.nextInt();
    int num[][] = new int[n][m];
    int order[] = new int[k];

    //          0 1 2 3 4 5
    // int dice[]={1,6,5,2,4,3};
    int dice[] = new int[6];
    Arrays.fill(dice, 0);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        num[i][j] = s.nextInt();
      }

    }
    for (int i = 0; i < k; i++) {
      order[i] = s.nextInt();
    }

    for (int i = 0; i < k; i++) {
      int temp;
      switch (order[i]) {
      case 1: //E 오
        y += 1;
        if (x < 0 || x >= n || y < 0 || y >= m) {
          y -= 1;
          continue;
        }
        temp = dice[0];
        dice[0] = dice[4];
        dice[4] = dice[1];
        dice[1] = dice[5];
        dice[5] = temp;

        break;
      case 2: //W 왼
        y -= 1;
        if (x < 0 || x >= n || y < 0 || y >= m) {
          y += 1;
          continue;
        }
        temp = dice[0];
        dice[0] = dice[5];
        dice[5] = dice[1];
        dice[1] = dice[4];
        dice[4] = temp;

        break;
      case 3: //N 위
        x -= 1;
        if (x < 0 || x >= n || y < 0 || y >= m) {
          x += 1;
          continue;
        }
        temp = dice[0];
        dice[0] = dice[2];
        dice[2] = dice[1];
        dice[1] = dice[3];
        dice[3] = temp;

        break;
      case 4: //S 아래
        x += 1;
        if (x < 0 || x >= n || y < 0 || y >= m) {
          x -= 1;
          continue;
        }
        temp = dice[0];
        dice[0] = dice[3];
        dice[3] = dice[1];
        dice[1] = dice[2];
        dice[2] = temp;

        break;

      }
      if (num[x][y] == 0) {
        num[x][y] = dice[1];
      } else {
        dice[1] = num[x][y];
        num[x][y] = 0;
      }
      sb.append(dice[0] + "\n");
    }
    System.out.print(sb);

  }
}