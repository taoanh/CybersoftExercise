import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		System.out.println("Vui long nhap so tu nhien: ");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		
		System.out.println("Tong cua cac chu so: "+sum);
	}

}
