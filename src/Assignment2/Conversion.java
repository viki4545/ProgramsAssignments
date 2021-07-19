package com.company;

import java.util.Scanner;

public class Conversion {

    public static void decimaltoAny(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int b = sc.nextInt();
        if(b == 16){
            int rem,i,p = 0,temp;
            System.out.println("Enter the decimal number: ");
            int n = sc.nextInt();
            char hexa[] = new char[100];
            temp = n;
            while(temp != 0){
                rem = temp % 16;
                if(rem < 10){
                    hexa[p++] = (char)(48 + rem);
                }else{
                    hexa[p++] = (char)(55 + rem);
                }
                temp /= 16;
            }
            System.out.println("Decimal to hexa conversion  is: ");
            for (i = p-1; i >= 0 ; i--) {
                System.out.print(hexa[i]);
            }
        } else{
            int ans = 0;
            int p = 0;
            System.out.println("Enter the decimal number: ");
            int n = sc.nextInt();
            while(n != 0){
                int rem = n%b;
                ans = (int)Math.pow(10,p) * (rem) + ans;
                n /= b;
                p++;
            }
            if(b == 2) {
                System.out.println("Decimal to binary conversion is " + ans);
            }else if(b == 8){
                System.out.println("Decimal to octal conversion is " + ans);
            }else if(b == 10){
                System.out.println("Decimal to decimal conversion is " + ans);
            }else{
                System.out.println("Invalid base");
            }
        }
    }
    public static void anytoDecimal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int b = sc.nextInt();
        if(b == 16){
            System.out.println("Enter the hex number: ");
            String hex = sc.next();
            int dec = 0;
            int p = 0;
            int i;
                for (i = hex.length()-1; i >= 0; i--) {
                    if (hex.charAt(i) >= '0' && hex.charAt(i) <= '9') {
                        dec = dec + ((hex.charAt(i) - 48) * (int)Math.pow(16, p));
                        p++;
                    } else if (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') {
                        dec = dec + ((hex.charAt(i) - 55) * (int)Math.pow(16, p));
                        p++;
                    }

                }
            System.out.println("Hexadecimal to decimal conversion is " + dec);
        } else {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            int ans = 0, p = 0;
            while (n != 0) {
                int rem = n % 10;
                ans = (int) Math.pow(b, p) * (rem) + ans;
                n /= 10;
                p++;
            }
            if(b == 2) {
                System.out.println("Binary to decimal conversion is " + ans);
            }else if(b == 8){
                System.out.println("Octal to decimal conversion is " + ans);
            }else if(b == 10){
                System.out.println("Decimal to decimal conversion is " + ans);
            }else{
                System.out.println("Invalid base");
            }
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        decimaltoAny();
//          anytoDecimal();
        sc.close();
    }
}
