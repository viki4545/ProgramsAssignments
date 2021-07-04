package Assignment1;

import java.util.Scanner;

public class Countdigits {
    Scanner sc = new Scanner(System.in);
    public static void digits(int n){
        int count = 0;
        while (n != 0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       digits(n);
    }
}
