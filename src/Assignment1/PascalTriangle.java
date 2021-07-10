package Assignment1;

import java.util.Scanner;

public class PascalTriangle {
    public static int forCombination(int n ,int r){
        int i = 1; int C = 1;
        while(i<=r){
                C = C*(n-i+1)/i;
                i++;
        }
        return C;
    }
    public static void pattern2(int n){
        int nst = 1,id = 1;
        System.out.println("1");
        while (id <= n){
            int cst = 0;
            while(cst <= nst){
                int res = forCombination(nst,cst);
                System.out.print(res + " ");
                cst++;
            }
            System.out.println();
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
