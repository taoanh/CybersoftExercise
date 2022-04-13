import java.util.ArrayList;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		int input1, input2;
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		do {
			System.out.println("Vui long nhap so tu nhien thu nhat: ");
			input1 = sc.nextInt();
			System.out.println("Vui long nhap so tu nhien thu hai");
			input2 = sc.nextInt();
		}while(input1<10|| input1>99||input2<10||input2>99);
		ArrayList<Integer> num1 = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();
		for(int i = 0 ; i < 2;i++) {
			num1.add(input1%10);
			num2.add(input2%10);
			input1 /=10;
			input2 /=10;
		}
		if(num2.contains(num1.get(1))||num2.contains(num1.get(0)))
			bool = true;
	
		System.out.println(bool);
	
	}	

}
