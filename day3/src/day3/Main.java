package day3;

import java.util.Scanner;

public class Main {
	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập thông tin công ty!");
		System.out.println("Tên công ty: ");
		String companyName = SC.nextLine();
		System.out.println("Mã số thuế: ");
		String companyTax = SC.nextLine();
		System.out.println("Doanh thu: ");
		int compnayRevenue = SC.nextInt();
		QuanLyNhanSu qlns = new QuanLyNhanSu(new Company(companyName, companyTax, compnayRevenue));
		boolean exit = false;
		do {
			loadTutorials();
			System.out.println("PRESS:");
			int key = SC.nextInt();
			switch (key) {
			case 1:
				qlns.showAllEmploy();
				System.out.println("Nhap id nhan vien muon phan vao truong phong");
				boolean success = qlns.addTruongPhongByNhanVien(SC.nextLine());
				if (!success) {
					System.out.println("Thong tin nhap sai");
				}
				break;
			case 2:
				boolean add = false;
				boolean remove = false;
				System.out.println("Nhap chuc nang them hoac xoa: \r\n" + "1)Them.\r\n" + "2)Xoa.\r\n" + "PRESS: ");
				switch (SC.nextInt()) {
				case 1: {
					add = true;
					break;
				}
				case 2: {
					remove = true;
					break;
				}
				default:
					System.out.println("Nhap sai.");
				}
				if (!add && !remove) {
					break;
				}
				String chucVu = "";
				System.out.println("Nhap chuc vu: \r\n" + "1) Nhan vien. \r\n" + "2) Truong phong \r\n"
						+ "3) Giam doc \r\n" + "Press: ");
				switch (SC.nextInt()) {
				case 1: {
					chucVu = "NhanVien";
					break;
				}
				case 2: {
					chucVu = "TruongPhong";
					break;
				}
				case 3: {
					chucVu = "GiamDoc";
					break;
				}
				default:
					System.out.println("Nhap sai:");
				}
				if (chucVu.equals("NhanVien")) {
					if(add) {
						
					}else if(remove) {
						
					}
				} else if (chucVu.equals("TruongPhong")) {

				} else if (chucVu.equals("GiamDoc")) {

				} else {
					break;
				}
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;
			case 11:

				break;
			case 12:

				break;
			default:
				break;
			}
		} while (!exit);
	}

	public static void loadTutorials() {
		System.out.println("1. Phân bổ Nhân viên vào Trưởng phòng \r\n"
				+ "2. Thêm, xóa thông tin một nhân sự (có thể là Nhân viên, trưởng phòng hoặc giám đốc). \r\n"
				+ "Lưu ý khi xóa trưởng phòng, phải ngắt liên kết với các nhân viên đang tham chiếu tới. \r\n"
				+ "3. Xuất ra thông tin toàn bộ người trong công ty \r\n"
				+ "4. Tính và xuất tổng lương cho toàn công ty \r\n" + "5. Tìm Nhân viên thường có lương cao nhất \r\n"
				+ "6. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất \r\n"
				+ "7. Sắp xếp nhân viên toàn công ty theo thứ tự abc \r\n"
				+ "8. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần \r\n"
				+ "09. Tìm Giám Đốc có số lượng cổ phần nhiều nhất \r\n"
				+ "10. Tính và Xuất tổng THU NHẬP của từng Giám Đốc \r\n"
				+ "Thu nhập = Lương tháng + số cổ phần * Lợi nhuận công ty \r\n"
				+ "@Lợi nhuận công ty = Doanh thu tháng của công ty - tổng lương toàn công ty trong tháng.\r\n"
				+ "11. EXIT.");
	}
}
