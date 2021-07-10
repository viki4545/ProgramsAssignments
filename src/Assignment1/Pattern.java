package Assignment1;

public class Pattern {
    public static void pattern1(int n){
        int nst = 1,id = 1;
        while (id <= n){
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            System.out.println("");
            nst++;
            id++;
        }
    }
    public static void pattern2(int n){
        int nst = 1,id = 1;
        while (id <= n){
            int cst = 1;
            while(cst <= nst){
                System.out.print(cst);
                cst++;
            }
            System.out.println(" ");
            nst++;
            id++;
        }
    }

    public static void pattern3(int n){
        int nsp = n-1,id = 1,nst = 1;
        while (id <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print(cst);
                cst++;
            }
            System.out.println();
            nst++;
            nsp--;
            id++;
        }
    }
    public static void pattern4(int n){
        int nsp = n-1,id = 1,nst = 1;
        while (id <= n){
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
            nst = nst + 2;
            nsp--;
            id++;
        }
    }
    public static void pattern5(int n){
        int nsp = n-1,id = 1,nst = 1;
        while (id <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print(cst);
                cst++;
            }
            System.out.println();
            nst= nst + 2;
            nsp = nsp - 1;
            id++;
        }
    }
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
                System.out.print(temp);
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
    public static void pattern(){
        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
//       pattern8(5);
//        pattern9(5);
    }
    public static void main(String[] args) {
        pattern();
    }
}
