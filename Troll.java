public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        String newStr = "";
      for(int i = 0; i < str.length(); i++){
        if(str.charAt(i)== 'A' || str.charAt(i)== 'E' || str.charAt(i)== 'I' || str.charAt(i)== 'O' || str.charAt(i)== 'U' || str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o'|| str.charAt(i)== 'u')
            newStr = str.replace(str.charAt(i),' ');
        }
        System.out.println(newStr);
        return str;
    }
    public static void main(String[] args) {
      System.out.println(disemvowel("Hello World!"));
    }
}