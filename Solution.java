import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int x, y, z;
        x = 5; y = 9;z = 5;
        while(--x){
            x = z+1;
            y = x-z;
            z = y/2;
        }
        System.out.println(z);
    }
}