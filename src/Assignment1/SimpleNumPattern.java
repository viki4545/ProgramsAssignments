package Assignment1;

import java.util.Scanner;

public class SimpleNumPattern {
    public static void pattern2(int n){
        int nst = 1,id = 1;
        while (id <= n){
            int cst = 1;
            while(cst <= nst){
                System.out.print(cst);
                cst++;
            }
            System.out.println(" ");
            nst++;
            id++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern2(n);
    }
}
