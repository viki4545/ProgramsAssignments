package Assignment1;

import java.util.Scanner;
import java.util.jar.JarEntry;

public class CircularNumPattern {
    public static void pattern(int n){
       int id = 1,nst = n,nsp = n;
       while(id <= 2*n-1) {
           int csp = n;
           while (csp > nsp) {
               System.out.print(csp + " ");
               csp--;
           }
           int cst = 1;
           while (cst < nst) {
               System.out.print(nst + " ");
               cst++;
           }
           cst--;
           while (cst > 0) {
               System.out.print(nst + " ");
               cst--;
           }
           while (csp <= n) {
               System.out.print(csp + " ");
               csp++;
           }
           System.out.println();
           id++;
           if (id <= n) {
               nst--;
               nsp--;
           } else {
               nst++;
               nsp++;
           }
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
