package com.company;

import java.util.Scanner;

public class Gcd {
    public static int gcd (int a , int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        if(a == b){
            return a;
        }
        if(a > b) {
            return gcd(a - b, b);
        }
            return gcd(a,b-a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int output = gcd(a,b);
        System.out.println(output);

    }
}
