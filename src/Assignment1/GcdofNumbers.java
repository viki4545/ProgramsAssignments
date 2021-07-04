package Assignment1;

import java.util.*;

public class GcdofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gcd = 1,i ;
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (i = 1; i <= n1&&i<=n2; ++i) {
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
