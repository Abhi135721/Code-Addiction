package edyst;

public class Nqueens_dsp {
  static int n = 4;
  static int[] queen = new int[4];

  public static void main(String args[]) {
    solve(0);
  }

  static void print() {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (queen[i] == j) System.out.print("Q ");
        else System.out.print("- ");
      }
      System.out.println();
    }
    System.exit(1);
  }

  static void solve(int a) {
    for (int i = 0; i < n; i++) {
      if (!collide(a, i)) {
        queen[a] = i;
        if (a == n - 1) {
          print();
          return;
        } else solve(a + 1);
      }
    }
    return;
  }

  static boolean collide(int row, int col) {
    for (int i = 0; i < row; i++) {
      if (queen[i] == col || Math.abs(i - row) == Math.abs(queen[i] - col)) return true;
    }
    return false;
  }
}
