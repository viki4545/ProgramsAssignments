package com.company;

import java.util.Scanner;

public class UppercaseAndLowercase {
    public static void checkAndPrint(){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Invalid character");
        }
    }
    public static void main(String[] args) {
        checkAndPrint();
    }
}
