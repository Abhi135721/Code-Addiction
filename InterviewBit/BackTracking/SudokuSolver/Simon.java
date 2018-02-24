/*
Question:	Write a program to solve a Sudoku puzzle by filling the empty cells.
			Empty cells are indicated by the character '.'
			You may assume that there will be only one unique solution.

Approach:	use bactracking to fill every empty box
			before placing a number check 3 cases
			case1: Is it safe to put a number in that row
			case2: Is it safe to put a number in that column
			case3: Is it safe to put a number in 3*3 mini grid
*/

import java.util.*;

public class Solution {
  public void solveSudoku(ArrayList<ArrayList<Character>> a) {
    int[][] board = new int[a.size()][a.size()];
    int i = 0, j = 0;
    // forming an integer array list from guven input
    for (ArrayList<Character> list : a) {
      j = 0;
      for (char ch : list) {
        if (ch == '.') board[i][j] = 0;
        else board[i][j] = Character.getNumericValue(ch);
        j++;
      }
      i++;
    }
    solve(0, 0, board);
    ArrayList<ArrayList<Character>> aa = new ArrayList<ArrayList<Character>>();
    aa = tolist(board);
    // arranging the output to given input
    for (int p = 0; p < a.size(); p++) {
      for (int q = 0; q < a.size(); q++) {
        a.get(p).set(q, aa.get(p).get(q));
      }
    }
  }

  static ArrayList<ArrayList<Character>> tolist(int[][] a) {
    ArrayList<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();
    for (int i = 0; i < a.length; i++) {
      ArrayList<Character> row = new ArrayList<Character>();
      for (int j = 0; j < a.length; j++) {
        String str = Integer.toString(a[i][j]);
        char ch = str.charAt(0);
        row.add(ch);
      }
      list.add(row);
    }
    return list;
  }

  static boolean solve(int i, int j, int[][] board) {
    if (i > 8) {
      i = 0;
      j++;
      if (j == 9) return true;
    }
    if (board[i][j] != 0) return solve(i + 1, j, board);
    for (int val = 1; val <= 9; ++val) {
      if (check(i, j, val, board)) {
        board[i][j] = val;
        if (solve(i + 1, j, board)) return true;
      }
    }
    board[i][j] = 0;
    return false;
  }

  static boolean check(int i, int j, int val, int[][] board) {
    boolean a = checkrow(i, j, val, board);
    boolean b = checkcol(i, j, val, board);
    boolean c = checkoffset(i, j, val, board);
    return a && b && c;
  }

  static boolean checkrow(int i, int j, int val, int[][] board) {
    for (int k = 0; k < 9; ++k) {
      if (val == board[k][j]) return false;
    }
    return true;
  }

  static boolean checkcol(int i, int j, int val, int[][] board) {
    for (int k = 0; k < 9; ++k) {
      if (val == board[i][k]) return false;
    }
    return true;
  }

  public static void print(int[][] A) {
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[0].length; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }

  static boolean checkoffset(int i, int j, int val, int[][] board) {
    int rowstart = (i / 3) * 3;
    int colstart = (j / 3) * 3;
    for (int k = 0; k < 3; ++k) {
      for (int m = 0; m < 3; ++m) {
        if (val == board[rowstart + k][colstart + m]) return false;
      }
    }
    return true;
  }
}
