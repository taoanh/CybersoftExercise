import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		System.out.println("Vui long nhap so n: ");
		int n = new Scanner(System.in).nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

	public static boolean isPrime(int n) {
		if(n <= 1)
			return false;
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if ((n % i) == 0)
				return false;
		}
		return true;
	}

}
