import java.util.Scanner;

public class Exercise13 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int length;
		System.out.println("Vui long nhap do dai mang: ");
		length = sc.nextInt();
		int[] array = new int[length];
		for(int i = 0; i < length; i++) {
			System.out.println("Nhap phan tu thu "+(i+1)+": ");
			array[i] = sc.nextInt();
		}
		boolean exit = false;
		do {
		System.out.println("Chon chuong trinh:"
				+ "\n a) Tinh gia trung binh"
				+ "\n b) Tim phan tu lon nhat, nho nhat"
				+ "\n c) Tim phan tu am lon nhat, am nho nhat"
				+ "\n d) Tim phan tu duong lon nhat, nho nhat"
				+ "\n e) In ra phan tu chan, le"
				+ "\n f) Them phan tu theo index"
				+ "\n x) Exit");
		System.out.println("PRESS: ");
		char c = sc.next().charAt(0);
		switch(c) {
			case 'a':
				
				break;
			case 'b':
				break;
			case 'c':
				break;
			case 'd':
				break;
			case 'e':
				break;
			case 'f':
				break;
			case 'x':
				break;
			default:
				break;
				
		}
		}while(!exit);
	}
}
