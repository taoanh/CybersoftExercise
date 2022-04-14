import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		System.out.println("Vui long nhap so n: ");
		int n = new Scanner(System.in).nextInt();
		double log = Math.log(n);
		int result;
		if(log%1 == 0) {
			result = (int)log -1;
		}else {
			result = (int)log;
		}
		System.out.println("Ket qua: "+result);
	}
}
