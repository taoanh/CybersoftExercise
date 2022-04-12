import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap vao chuoi: ");
		String str = sc.nextLine();
		char[] cStr = str.toCharArray();
		for (int i = 0; i < cStr.length / 2; i++) {
			int temp = 0;
			temp = cStr[i];
			cStr[i] = cStr[cStr.length - i - 1];
			cStr[cStr.length - i - 1] = cStr[i];
		}
		str = String.valueOf(cStr);
		System.out.println("Chuoi ket qua: " + str);
	}

}
