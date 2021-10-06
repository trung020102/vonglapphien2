package vonglap2;

public class bai6 {
	public static void main(String[] args) {
        int count = 0;
        System.out.println("Liệt kê tất cả số nguyên tố có 5 chữ số:");
        for (int i = 10001; i < 99999; i+=2) {
            if (primeNumber(i)) {
                System.out.println(i);
                count++;
            }
        }
       
    }
     
   
    public static boolean primeNumber(int n) {
       
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}