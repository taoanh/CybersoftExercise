import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		System.out.println("Vui long nhap chuoi:");
		String str = new Scanner(System.in).nextLine();
		String []strArr = str.split(" ");
		StringBuilder strBuilder = new StringBuilder();
		for(String s : strArr) {
			strBuilder.append(s.substring(0,1).toUpperCase());
			strBuilder.append(s.substring(1,s.length()));
			strBuilder.append(" ");
			
		}
		System.out.println(strBuilder.toString());
	}
}
