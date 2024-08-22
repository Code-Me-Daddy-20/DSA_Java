public class StringSplit {
  public static String[] solution(String s) {
      //Write your code here
    int i = 0;
    if(s.length() % 2 == 0 && i < s.length())
    String strArray[] = s.split(s.substring(i,i+2));
  }
return strArray;
public static void main(String[] args) {
  String s = "ababab";
  
}
}