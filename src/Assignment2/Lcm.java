package com.company;

import java.util.Scanner;

public class Lcm {
    public static int gcd (int a,int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        if(a == b){
            return a;
        }
        if(a>b){
            return gcd(a-b,b);
        }
        return gcd(a,b-a);
    }
    public static int lcm(int a,int b){
        int ans = 0;
        ans = a*b/gcd(a,b);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int output = lcm(a,b);
        System.out.println(output);
    }
}
