package Assignment1;

import java.util.Scanner;

public class OddEvenJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 2;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(even);
            even = even+4*i;
        }
    }
}
