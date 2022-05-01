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
				String idTruongPhong = SC.next();
				boolean success = qlns.addTruongPhongByNhanVien(idTruongPhong);
				if (!success) {
					System.out.println("Thong tin nhap sai");
				}
				break;
			case 2:
				System.out.println("Nhap chuc nang them hoac xoa: \r\n" + "1)Them.\r\n" + "2)Xoa.\r\n" + "PRESS: ");
				switch (SC.nextInt()) {
				case 1: {
					System.out.println("Nhap ho va ten nhan vien:");
					String fullName = SC.next();
					System.out.println("Nhap so dien thoai:");
					String phone = SC.next();
					System.out.println("Nhap so ngay lam viec");
					int workingDays = SC.nextInt();
					System.out.println("Nhap chuc vu: \r\n" + "1) Nhan vien. \r\n" + "2) Truong phong \r\n"
							+ "3) Giam doc \r\n" + "Press: ");
					switch (SC.nextInt()) {
					case 1: {			
						System.out.println("1) Co truong phong \r\n"
								+ "2) Khong co truong phong");
						int truongPhong = SC.nextInt();
						switch (truongPhong) {
						case 1: {
							qlns.showAllEmploy();
							System.out.println("Nhap id truong phong");
							String idTP = SC.next(); 
							qlns.addNhanVien(fullName, phone, workingDays, idTP);
							break;
							
						}
						case 2: {
							qlns.addNhanVien(fullName, phone, workingDays);
							break;
						}
						default:
							throw new IllegalArgumentException("Unexpected value: " + truongPhong);
						}
						qlns.addNhanVien(fullName, phone, workingDays);
						break;
					}
					case 2: {			
						qlns.addTruongPhong(fullName, phone, workingDays);
						break;
					}
					case 3: {
						System.out.println("So co phan giam doc so huu");
						int stocks = SC.nextInt();
						qlns.addGiamDoc(fullName, phone, workingDays, stocks);
						break;
					}
					default:
						System.out.println("Nhap sai:");
					}
					break;
				}
				case 2: {
					qlns.showAllEmploy();
					System.out.println("Nhap id muon xoa");
					
					qlns.removeEmploy(SC.next());
					break;
				}
				default:
					System.out.println("Nhap sai.");
				}		
				break;
			
			case 3:
				qlns.showAllEmploy();
				break;
			case 4:
				qlns.amountSalary();
				break;
			case 5:
				qlns.highestSalaryNhanVien();
				break;
			case 6:
				qlns.truongPhongNhanVienNhieuNhat();
				break;
			case 7:
				qlns.sortEmployeeByName();
				break;
			case 8:
				qlns.sortEmployeeBySalary();
				break;
			case 9:
				qlns.getHighestStock();
				break;
			case 10:
				qlns.printRevenueGiamDocs();
				break;
			case 11:
				exit = true;
				break;
			default:
				System.out.println("Nhap sai.");
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
