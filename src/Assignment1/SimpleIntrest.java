package Assignment1;

import java.util.Scanner;

public class SimpleIntrest {
    public static void simpleInterest(double p , double t , double r){
        double si = 0;
        si = (p*t*r)/100;
        System.out.println(si);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();
        simpleInterest(p,t,r);
    }
}
