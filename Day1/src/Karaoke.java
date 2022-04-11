import java.util.Scanner;

public class Karaoke {

	static int startTime;
	static int endTime;
	
	public static void main(String[] args) {
		boolean inputCheck = false;
		int totalPrice = 0;
		do {
			inputStartTimeEndTime();
			if (checkTime()) {
				inputCheck = true;
			} else {
				System.out.println("Vui long kiem tra lai gio!");
			}
		} while (!inputCheck);
		totalPrice = calculate();
		System.out.println("So tien phai tra: " + totalPrice);
	}

	public static int getDiscountPercent() {
		int discount = 0;
		if (startTime >= 9 && startTime < 17) {
			discount = 20;
		}
		return discount;
	}

	public static boolean inputStartTimeEndTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap gio bat dau: ");
		startTime = sc.nextInt();
		System.out.println("Vui long nhap gio ket thuc: ");
		endTime = sc.nextInt();

		return true;
	}

	public static boolean checkTime() {
		if ((startTime < 9 && startTime >= 0) || (endTime < 9 && endTime > 0)) {
			return false;
		} else if (startTime == endTime) {
			return false;
		} else if (startTime > endTime) {
			return false;
		}
		return true;
	}

	public static int calculate() {
		int discount = getDiscountPercent();
		int total = 0;
		int hours = endTime - startTime;
		for (int i = 0; i < hours; i++) {
			int pricePerHour = 30000;
			if (i > 2) {
				pricePerHour *= 30 / 100;
			}
			total += pricePerHour;
		}

		return total * (100 - discount) / 100;
	}
}