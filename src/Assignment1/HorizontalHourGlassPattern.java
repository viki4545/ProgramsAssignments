package Assignment1;

import java.util.Scanner;

public class HorizontalHourGlassPattern {
    public static void pattern9(int n){
        int nsp = 2*n-1,id = 1,nst = 1;
        while (id <= 2*n-1){
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            cst = 1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            if(id<n) {
                nst = nst + 1;
                nsp = nsp - 2;
            }else{
                nst = nst -1;
                nsp = nsp + 2;
            }
            id++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern9(n);
    }
}
