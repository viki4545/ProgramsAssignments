package Assignment1;

import java.util.Scanner;

public class HollowDiamondStarPattern {
    public static void pattern(int n){
        int id = 1,nst = n,nsp = 1;
        while(id <= 2*n-1){
            int cst = 1;
            if(id == 1 || id == 2*n-1){
                while(cst <= 2*nst-1){
                    System.out.print("* ");
                    cst++;
                }
                nsp -=2;
            }else {
                cst = 1;
                while (cst <= nst) {
                    System.out.print("* ");
                    cst++;
                }
                int csp = 1;
                while (csp <= nsp) {
                    System.out.print("  ");
                    csp++;
                }
                cst = 1;
                while (cst <= nst) {
                    System.out.print("* ");
                    cst++;
                }
            }
            System.out.println();
            if(id<n){
                nst--;
                nsp +=2;
            }else {
                nst++;
                nsp -=2;
            }
            id++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
