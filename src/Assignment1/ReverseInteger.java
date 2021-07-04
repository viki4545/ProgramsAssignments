package Assignment1;

import java.util.Scanner;

public class ReverseInteger {
    public static int reverseNum(int n){
        int reverse = 0,temp = n;
        while(n != 0){
            if(reverse > Integer.MAX_VALUE/10) return 0;
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseNum(n));
    }
}
