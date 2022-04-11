import java.util.Scanner;

public class Exercise2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap so decimal: ");
		int n = sc.nextInt();
		System.out.println("Day la so nhi phan: "+decimalToBinary(n));
	}
	public static int decimalToBinary(int deciNum) {
		int binary;
		if(deciNum == 0) {
			binary =0;
		}else {
			binary =deciNum % 2 + 10
					* decimalToBinary(deciNum/2);
		}
		return binary;
	}
}
