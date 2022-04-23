import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length;
		System.out.println("Vui long nhap do dai mang: ");
		length = sc.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
			array[i] = sc.nextInt();
		}
		showTutorial();
		boolean exit = false;
		do {
			System.out.println("PRESS: ");
			char c = sc.next().charAt(0);
			switch (c) {
			case 'a':
				System.out.println("Trung binh cua cac phan tu mang: " + averageNum(array));
				break;
			case 'b':
				System.out.println("Phan tu lon nhat: " + maxValue(array));
				System.out.println("Phan tu nho nhat: " + minValue(array));
				break;
			case 'c':
				int[] negativeList = getNegativeNums(array);
				if (negativeList != null) {
					System.out.println("Phan tu nho nhat: " + minValue(negativeList));
					System.out.println("Phan tu lon nhat: " + maxValue(negativeList));
				} else {
					System.out.println("Khong co gia tri am: ");
				}
				break;
			case 'd':
				int[] positiveList = getPositiveNums(array);
				if (positiveList != null) {
					System.out.println("Phan tu nho nhat: " + minValue(positiveList));
					System.out.println("Phan tu lon nhat: " + maxValue(positiveList));
				} else {
					System.out.println("Khong co gia tri duong: ");
				}
				break;
			case 'e':
				printOddNumbers(array);
				printEvenNumbers(array);
				break;
			case 'f':
				int indexAdd, numAdd;
				System.out.print("Nhap vi tri can them: ");
				indexAdd = sc.nextInt() - 1;
				System.out.print("Nhap phan tu:");
				numAdd = sc.nextInt();
				if (indexAdd < array.length)
					array = addArrayIndex(indexAdd, numAdd, array);
				else {
					System.out.println("Vi tri khong hop le");
				}
				break;
			case 'g':
				int indexDelete;
				System.out.print("Nhap vi tri can xoa: ");
				indexDelete = sc.nextInt() - 1;
				if (indexDelete < array.length)
					array = removeArrayIndex(indexDelete, array);
				else {
					System.out.println("Vi tri khong hop le");
				}
				break;
			case 'x':
				exit = true;
				break;
			case 't':
				showTutorial();
				break;
			default:
				System.out.println("\nSAI LENH.\n");
				showTutorial();
				break;

			}
		} while (!exit);
		sc.close();

	}

	static void showTutorial() {
		System.out.println("Chon chuong trinh:" + "\n a) Tinh gia trung binh" + "\n b) Tim phan tu lon nhat, nho nhat"
				+ "\n c) Tim phan tu am lon nhat, am nho nhat" + "\n d) Tim phan tu duong lon nhat, nho nhat"
				+ "\n e) In ra phan tu chan, le" + "\n f) Them phan tu theo index"
						+ "\n g) Xoa phan tu theo index " + "\n t) de xem lai huong dan"
				+ "\n x) Exit");
	}

	static double averageNum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double) sum / arr.length;
	}

	static int maxValue(int[] arr) {
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	static int minValue(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

	static int[] getNegativeNums(int[] arr) {
		List<Integer> negativeNums = new ArrayList<>();
		for (int num : arr) {
			if (num < 0)
				negativeNums.add(num);
		}
		if (negativeNums.isEmpty()) {
			return null;
		}
		int result[] = new int[negativeNums.size()];
		for (int i = 0; i < negativeNums.size(); i++) {
			result[i] = negativeNums.get(i);
		}
		return result;
	}

	static int[] getPositiveNums(int[] arr) {
		List<Integer> positiveNum = new ArrayList<>();
		for (int num : arr) {
			if (num >= 0)
				positiveNum.add(num);
		}
		if (positiveNum.isEmpty()) {
			return null;
		}
		int result[] = new int[positiveNum.size()];
		for (int i = 0; i < positiveNum.size(); i++) {
			result[i] = positiveNum.get(i);
		}
		return result;

	}

	static void printEvenNumbers(int[] arr) {
		System.out.print("Phan tu chan: ");
		for (int num : arr) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

	static void printOddNumbers(int[] arr) {
		System.out.print("Phan tu le: ");
		for (int num : arr) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

	static int[] addArrayIndex(int indexAdd, int numAdd, int[] array) {
		int[] tempArray = new int[array.length + 1];
		for (int i = 0; i < tempArray.length; i++) {
			if (i < indexAdd) {
				tempArray[i] = array[i];
			} else if (i == indexAdd) {
				tempArray[i] = numAdd;
			} else {
				tempArray[i] = array[i - 1];
			}
		}
		return tempArray;

	}

	static int[] removeArrayIndex(int indexAdd, int[] array) {
		int[] tempArray = new int[array.length - 1];
		for (int i = 0; i < tempArray.length; i++) {
			if (i < indexAdd) {
				tempArray[i] = array[i];
			} else {
				tempArray[i] = array[i + 1];
			}
		}
		return tempArray;

	}

}
