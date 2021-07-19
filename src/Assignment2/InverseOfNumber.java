package com.company;

import java.util.Scanner;

public class InverseOfNumber {
    public static void inverseNumber(int n){
        int count = 0,temp = n,inv = 0;
        while(temp != 0){
            temp = temp/10;
            count++;
        }
        for (int i = count; i>=1; i--) {
            int rem = n%10;
            inv = i * (int)Math.pow(10,count - rem) + inv;
            n = n/10;
        }
        System.out.println(inv);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inverseNumber(n);
    }
}
