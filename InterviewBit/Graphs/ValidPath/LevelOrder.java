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
 public ArrayList < ArrayList < Integer >> levelOrder(TreeNode root) {
  ArrayList < ArrayList < Integer >> ans = new ArrayList < ArrayList < Integer >> ();
  if (root == null)
   return ans;
  Queue < TreeNode > c = new LinkedList < TreeNode > ();
  Queue < TreeNode > n = new LinkedList < TreeNode > ();
  c.add(root);
  ArrayList < Integer > temp = new ArrayList < Integer > ();
  while (!c.isEmpty()) {
   TreeNode t = c.remove();
   if (t.left != null) n.add(t.left);
   if (t.right != null) n.add(t.right);
   temp.add(t.val);
   if (c.isEmpty()) {
    c = n;
    n = new LinkedList < TreeNode > ();
    ans.add(temp);
    temp = new ArrayList < Integer > ();
   }
  }
  return ans;
 }
}
