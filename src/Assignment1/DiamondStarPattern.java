package Assignment1;

import java.util.Scanner;

public class DiamondStarPattern {
    public static void pattern8(int n){
        int nsp = n-1,id = 1,nst = 1;
        while (id <= 2*n-1){
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            if(id < n){
                nst= nst + 2;
                nsp = nsp - 1;
            }else{
                nst = nst - 2;
                nsp = nsp + 1;
            }
            id++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern8(n);
    }
}
