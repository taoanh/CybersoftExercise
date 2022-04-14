import java.util.Scanner;

public class Exercise12 {
	public static void main(String [] args) {
		int n;
		do {
			System.out.println("Vui long nhap so n: ");
			 n = new Scanner(System.in).nextInt();
		}while(n<1||n>9);
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println("\n");
			
		}
	}
}
