package Assignment1;

import java.util.Scanner;

public class RotateNumbers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, count = 0,temp = 0,power1 = 1,power2 = 1,rem = 0,quo = 0,sum = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        a = n;
        while(a != 0){
            a = a/10;
            count++;
        }
        k = k%count;
         if(k == 0){
             System.out.println(n);
         }else {
             if(k < 0){
                 k = k + count;
             }

             temp = count - k;
             for (int i = 1; i <= k; i++) {
                 power1 = power1 * 10;

             }
             for (int i = 1; i <= temp; i++) {
                 power2 = power2 * 10;

             }

             rem = n % power1;
             quo = n/power1;
             sum = (rem * power2) + quo;
         }
        System.out.println(sum);

    }
}
