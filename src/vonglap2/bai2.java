package vonglap2;

import java.util.Scanner;

public class bai2 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập number cần tìm giai thừa: ");
		int number = scanner.nextInt();
		        long n = 1;
		        for(int i = 1; i <= number; i++)
		        {
		           n = n * i;
		        }
		        System.out.println("Giai thừa của "+number+" là: "+n);
		}

	}