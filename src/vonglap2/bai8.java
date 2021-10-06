package vonglap2;

import java.util.Scanner;

public class bai8 {

       public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
     
    
    public static boolean primeNumber(int n) {
        
        if (n < 2) {
            return false;
        }
       
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
       Scanner scanner= new Scanner(System.in);
         System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        System.out.printf("Cac so fibonacci nho hon %d va so nguyen to: ", n);
        int i = 0;
        while (fibonacci(i) < n) {
            int fi = fibonacci(i);
            if (primeNumber(fi)) {
                System.out.print(fi + " ");
            }
            i++;
        }
    }
    
}