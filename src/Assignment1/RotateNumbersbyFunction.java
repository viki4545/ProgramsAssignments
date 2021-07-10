package Assignment1;

import java.util.Scanner;

public class RotateNumbersbyFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(rotateByk(n,k));
    }
    public static int noOfDigits(int n ){
        int count  = 0;
        while (n != 0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static int power(int k){
        int ans = 1;
        for (int i = 1; i <= k; i++) {
            ans = ans * 10;
        }
        return ans;
    }
    public static int rotateByk(int n , int k){
        int digits = noOfDigits(n);
        k = k%digits;
        if(k < 0){
            k = k + digits;
        }
        int p = power(k);
        int ans = n%p;
        int p2 = power(digits - k);
        ans = ans * p2 + n/p;
        return ans;
    }
}
