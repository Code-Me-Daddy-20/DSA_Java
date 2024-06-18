import java.util.*;

public class BasicHasing {
    public static void main(String[] args) {

        // Brute Force : Storing and fetching
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the array: ");
        // int[] arr = new int[5];
        // for (int i = 0; i < 5; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // int hash[] = new int[5];
        // for (int i = 0; i < 5; i++) {
        //     hash[arr[i]] += 1;
        // }

        // int e;
        // System.out.println("Enter number of search elements: ");
        // e = sc.nextInt();
        // while (e-- != 0) {
        //     int number;
        //     System.out.println("Enter your search element:");
        //     number = sc.nextInt();
        //     System.out.println("Frequency: "+hash[number]);
        // }
        



        // Character hashing :
        // System.out.println("Enter your string: ");
        // String str = sc.next();
        // int charHash[] = new int[256];
        // for (int i = 0; i < str.length(); i++) {
        //     charHash[str.charAt(i)]++;
        // }

        // System.out.println("Number of characters to search: ");
        // int ch = sc.nextInt();
        // while (ch-- > 0) {
        //     System.out.println("Enter character: ");
        //     char c = sc.next().charAt(0);
        //     System.out.println("Frequency: " + charHash[c]);
        // }




        // HashMap : 
        // System.out.println("Enter the array: ");
        // int[] arr = new int[5];
        // for (int i = 0; i < 5; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // HashMap <Integer, Integer> hmap = new HashMap<>();
        // for(int i = 0; i < 5; i++){
        //     int fq = 0; int key = arr[i];
        //     if(hmap.containsKey(key))
        //         fq = hmap.get(key);
        //     fq++;
        //     hmap.put(key,fq);
        // }

        // int q;
        // System.out.println("Enter number of elements to search: ");
        // q = sc.nextInt();
        // while (q-- > 0) {
        //     System.out.println("Enter your element: ");
        //     int num = sc.nextInt();
        //     if (hmap.containsKey(num))
        //          System.out.println("Frequency: "+hmap.get(num));
        //     else System.out.println("Frequency: "+0);
        // }
    }
}
