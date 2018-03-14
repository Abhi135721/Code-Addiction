/*

Given a binary tree, determine if it is height-balanced.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Example :

Input : 
          1
         / \
        2   3

Return : True or 1 

Input 2 : 
         3
        /
       2
      /
     1

Return : False or 0 
         Because for the root node, left subtree has depth 2 and right subtree has depth 0. 
         Difference = 2 > 1. 

*/


/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    int balanced=1;
    public int isBalanced(TreeNode A) {
	    balanced(A);
	    return balanced;
	}
	
	public int balanced(TreeNode A) {
	    if (A == null)
	        return 0;
	    int heightLeft = 1 + balanced(A.left);
	    int heightRight = 1 + balanced(A.right);
	    if (Math.abs(heightLeft - heightRight) > 1)
	        balanced = 0;
	    return Math.max(heightLeft, heightRight);
	}
}
