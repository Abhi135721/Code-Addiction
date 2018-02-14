/*
reverse the integer
*/
/*
input: 123
output: 321

input:-1234
output:-4321
*/
public class Dsp {
  public static void main(String args[]) {
    int rev = reverse(234);
    System.out.println(rev);
  }

  public static int reverse(int A) {
    boolean flag = false;
    if (A >= 0) flag = true;
    else A = A * -1;
    String st = String.valueOf(A);

    st = String.valueOf(new StringBuffer(st).reverse());
    if (!flag) st = "-" + st;
    try {
      int a = Integer.parseInt(st);
      return a;
    } catch (Exception e) {
      return 0;
    }
  }
}
