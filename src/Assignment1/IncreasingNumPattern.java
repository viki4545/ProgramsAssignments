package Assignment1;

import java.util.Scanner;

public class IncreasingNumPattern {
    public static void pattern7(int n){
        int nsp = n-1,id = 1,nst = 1;
        while (id <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 1,temp = id;
            while(cst <= nst){
                System.out.print(temp + " ");
                if(cst < id){
                    temp++;
                }else{
                    temp--;
                }
                cst++;
            }
            System.out.println();
            nst= nst + 2;
            nsp = nsp - 1;
            id++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern7(n);
    }
}
