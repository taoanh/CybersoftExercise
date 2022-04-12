import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap so nguyen: ");
		int n = sc.nextInt();
		ArrayList<Integer> listUoc = new ArrayList<>();
		for(int i = 1; i < n ; i++) {
			if((n%i)==0) {
				listUoc.add(i);
			}
		}
		System.out.println("Cac so uoc cua "+n+
				": "+listUoc.toString());
	}

}
