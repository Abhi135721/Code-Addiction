public class Solution {
 // DO NOT MODIFY THE LIST. IT IS READ ONLY
 public static int maxProfit(final List < Integer > a) {
  if (a == null || a.size() == 0)
   return 0;
  int profit = 0;

  int minElement = Integer.MAX_VALUE;
  for (int i = 0; i < a.size(); i++) {
   profit = Math.max(profit, a.get(i) - minElement);
   minElement = Math.min(minElement, a.get(i));
  }
  return profit;
 }
}
