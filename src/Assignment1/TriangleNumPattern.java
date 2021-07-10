package Assignment1;

import java.util.Scanner;

public class TriangleNumPattern {
    public static void pattern6(int n){
        int nsp = n-1,id = 1,nst = 1;
        while (id <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                if(cst <= (nst+1)/2) {
                    System.out.print(cst);
                }else{
                    System.out.print(nst-cst+1);
                }
                cst++;
            }
            System.out.println();
            if(id<n) {
                nst = nst + 2;
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
        pattern6(n);
    }
}
