package vonglap2;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so n: ");
		int n = scanner.nextInt();
		 int  t1 = 0, t2 = 1;
	        System.out.print("First 10 terms: ");
	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(t1 + "  ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	}

}