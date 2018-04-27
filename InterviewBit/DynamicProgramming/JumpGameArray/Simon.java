public class Solution {
 public int canJump(ArrayList < Integer > a) {
  int cur = 0;
  for (int i = 0; i < a.size(); i++) {
   if (cur < 0) return 0;
   cur = Math.max(a.get(i), cur);
   cur--;
  }
  return 1;
 }
}
