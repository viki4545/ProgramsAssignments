package com.company;

import java.util.Scanner;

public class Characters {
    public static void characterInput(int n1,int n2,char ch){
        if(ch == '*'){
            System.out.println(n1*n2);
        }else if(ch == '/'){
            System.out.println(n1/n2);
        }else if(ch == '%'){
            System.out.println(n1%n2);
        }else if(ch == '+'){
            System.out.println(n1 + n2);
        }else if(ch == '-'){
            System.out.println(n1 - n2);
        }else {
            System.out.println("Invalid input");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char ch = sc.next().charAt(0);
        characterInput(n1,n2,ch);
    }
}
