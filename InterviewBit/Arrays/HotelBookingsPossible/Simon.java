/*
Question:	A hotel manager has to process N advance bookings of rooms for the next season.
			His hotel has K rooms. Bookings contain an arrival date and a departure date.
			He wants to find out whether there are enough rooms in the hotel to satisfy the demand.
			Write a program that solves this problem in time O(N log N)

Approach:	calculate the no of rooms required in the same time
			if required rooms are greater than the given rooms return false
*/

public class Solution {
  public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
    Collections.sort(arrive);
    Collections.sort(depart);
    int roomsRequired = 0, i = 0, j = 0;
    while (i < arrive.size() && j < arrive.size() && roomsRequired <= K) {
      if (arrive.get(i) < depart.get(j)) {
        i++;
        roomsRequired++;
      } else {
        j++;
        roomsRequired--;
      }
    }
    if (roomsRequired <= K) {
      return true;
    } else {
      return false;
    }
  }
}
