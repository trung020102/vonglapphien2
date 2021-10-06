package vonglap2;

import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n, soDu, tong = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nhap so nguyen duong n : ") ;
    n = scanner.nextInt() ;
     
    while (n > 0) {
    soDu = n % 10;
    n = n / 10;
    tong += soDu;
}
     
System.out.println("Sum = " + tong);
}
}