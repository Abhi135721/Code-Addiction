public class Dsp {

  public static void main(String args[]) {
    int[][] grid = {
      {3, 0, 6, 5, 0, 8, 4, 0, 0},
      {5, 2, 0, 0, 0, 0, 0, 0, 0},
      {0, 8, 7, 0, 0, 0, 0, 3, 1},
      {0, 0, 3, 0, 1, 0, 0, 8, 0},
      {9, 0, 0, 8, 6, 3, 0, 0, 5},
      {0, 5, 0, 0, 9, 0, 6, 0, 0},
      {1, 3, 0, 0, 0, 0, 2, 5, 0},
      {0, 0, 0, 0, 0, 0, 0, 7, 4},
      {0, 0, 5, 2, 0, 6, 3, 0, 0}
    };
    if (solve(grid, 0, 0)) print(grid);
    else System.out.println("no solution");
  }

  static boolean safe(int[][] grid, int row, int col, int ins) {
    return checkrow(grid, row, ins)
        && checkcol(grid, col, ins)
        && checkbox(grid, row - row % 3, col - col % 3, ins);
  }

  static boolean checkrow(int[][] grid, int row, int ins) {
    for (int j = 0; j < 9; j++) {
      if (grid[row][j] == ins) return false;
    }
    return true;
  }

  static boolean checkcol(int[][] grid, int col, int ins) {
    for (int j = 0; j < 9; j++) {
      if (grid[j][col] == ins) return false;
    }
    return true;
  }

  static boolean checkbox(int[][] grid, int row, int col, int ins) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (grid[row + i][col + j] == ins) return false;
      }
    }
    return true;
  }

  static boolean solve(int[][] grid, int row, int column) {
    if (!empty(grid)) {
      // print(grid);
      return true;
    }
    if (row >= 9) {
      row = 0;
      column = column + 1;
      return (solve(grid, row, column));
    }
    for (int n = 1; n <= 9; n++) {
      if (grid[row][column] == n) {
        if (solve(grid, (row + 1), column) == true) {
          return true;
        }
      }
      if (grid[row][column] == 0) {
        if (safe(grid, (row), column, n) == true) {
          grid[row][column] = n;
          if (solve(grid, (row + 1), column) == true) {
            return true;
          } else grid[row][column] = 0;
        }
      }
    }
    return false;
  }

  static void print(int[][] grid) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(grid[i][j] + " ");
      }
      System.out.println();
    }
  }

  static boolean empty(int[][] grid) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (grid[i][j] == 0) return true;
      }
    }
    return false;
  }
}
