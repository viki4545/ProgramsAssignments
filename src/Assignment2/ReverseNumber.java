package com.company;

import java.util.*;

public class ReverseNumber {
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
            if (rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE / 10 && rem < -8) return 0;
            if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && rem > 7) return 0;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = reverseNumber(n);
        System.out.println(reverse);
    }
}
