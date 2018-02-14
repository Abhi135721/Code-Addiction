public class SudokuSolver_abhi {
  public static boolean find_empty_space(int[][] A) {
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[0].length; j++) {
        if (A[i][j] == -1) return true;
      }
    }
    return false;
  }

  public static boolean used_in_row(int[][] A, int row, int n) {
    for (int col = 0; col < 9; col++) {
      if (A[row][col] == n) return true;
    }
    return false;
  }

  public static boolean used_in_col(int[][] A, int col, int n) {
    for (int row = 0; row < 9; row++) {
      if (A[row][col] == n) return true;
    }
    return false;
  }

  public static boolean used_in_small_grid(int[][] A, int row, int col, int n) {
    int small_grid_start_row_index = row - (row % 3);
    int small_grid_start_col_index = col - (col % 3);
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (A[small_grid_start_row_index + i][small_grid_start_col_index + j] == n) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean is_safe(int[][] A, int row, int col, int n) {
    boolean Used_in_row = used_in_row(A, row, n);
    boolean Used_in_col = used_in_col(A, col, n);
    boolean Used_in_small_grid = used_in_small_grid(A, row, col, n);
    if ((!Used_in_row) && (!Used_in_col) && (!Used_in_small_grid)) {
      return true;
    }
    return false;
  }

  public static boolean SudokuSolve(int[][] A, int row, int col) {
    /*Base condition
     * If everything is filled without having a single -1
     * We have successfully completed this sudoku grid */
    // int row = 0, col = 0;
    // System.out.println(row + " " + col);

    if (!find_empty_space(A)) {
      print_sudoku(A);
      return true;
    }
    if (row >= 9) {
      // print_sudoku(A);
      row = 0;
      col++;
      return SudokuSolve(A, row, col);
    }
    for (int n = 1; n <= 9; n++) {
      if (A[row][col] == n) {
        if (SudokuSolve(A, (row + 1), col) == true) {
          // System.out.println("called at " + row + " "+ col);
          return true;
        }
      }
      if (A[row][col] == -1) {
        if (is_safe(A, row, col, n)) {
          A[row][col] = n;
          // System.out.println("---------" + n + " " +A[row][col]);
          // System.out.println("called at " + row + " "+ col);
          // boolean check_row_wise = false, check_col_wise = false;
          if (SudokuSolve(A, (row + 1), col) == true) {
            // System.out.println("called at " + row + " "+ col);
            return true;
          } else {
            A[row][col] = -1;
          }
        }
      }
    }
    return false;
  }

  public static void print_sudoku(int[][] A) {
    for (int i = 0; i < 9; i++) {
      if (i % 3 == 0) System.out.println("  _ _ _   _ _ _   _ _ _");
      for (int j = 0; j < 9; j++) {
        if (j % 3 == 0) System.out.print("| ");
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("  _ _ _   _ _ _   _ _ _");
  }

  public static void main(String[] args) {
    int Table[][] = {
      {3, -1, 6, 5, -1, 8, 4, -1, -1},
      {5, 2, -1, -1, -1, -1, -1, -1, -1},
      {-1, 8, 7, -1, -1, -1, -1, 3, 1},
      {-1, -1, 3, -1, 1, -1, -1, 8, -1},
      {9, -1, -1, 8, 6, 3, -1, -1, 5},
      {-1, 5, -1, -1, 9, -1, 6, -1, -1},
      {1, 3, -1, -1, -1, -1, 2, 5, -1},
      {-1, -1, -1, -1, -1, -1, -1, 7, 4},
      {-1, -1, 5, 2, -1, 6, 3, -1, -1}
    };

    /*{{1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1, 1, 1, 1, 1}};*/

    System.out.println(SudokuSolve(Table, 0, 0));
  }
}
