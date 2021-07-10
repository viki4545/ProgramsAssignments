package Assignment1;

import java.util.Scanner;

public class CampusLeader {
    public static void campusLeader(int credits) {
        Scanner sc = new Scanner(System.in);
        if(credits < 4500){
            System.out.println("Rising Star");
        }else if(credits >= 4500 && credits < 6000 ){
            System.out.println("Mega Leader");
        }else if(credits >= 6000 && credits < 7500){
            System.out.println("Gega Leader");
        }else if(credits >= 7500){
            System.out.println("Tera Leader");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int credits = sc.nextInt();
        campusLeader(credits);
    }
}
