package Assignment1;

import java.util.*;

public class RegistrationSystem {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String,Integer> names = new HashMap<>(n);
        while(n-->0){
            String name = scanner.next();
            int count = names.getOrDefault(name,0);
            names.put(name,count+1);
            if(count==0) {
                System.out.printf("OK\n");
            }else{
                System.out.printf("%s%s\n",name,count);
            }
        }
        scanner.close();
    }
}
