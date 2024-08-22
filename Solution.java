public class Solution {
  public static void main(String[] args) {
    int num = 25;
    System.out.println(findComplement(num));
  }
  static int findComplement(int num) {
      String snum = Integer.toBinaryString(num);
      System.out.println(snum);
      snum = snum.replace("0", "-");
      snum = snum.replace("1", "0");
      snum = snum.replace("-", "1");
      System.out.println(snum);
      System.out.println(Integer.parseInt(snum, 2));
      return Integer.parseInt(snum, 2);
      }
}