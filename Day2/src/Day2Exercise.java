
public class Day2Exercise {
	public static void main(String[] args) {

		QuanLySinhVien qlSinhVien = new QuanLySinhVien("SV01", "Tao Hoang Anh", "05/04/1998", "nam", +84964569401L,
				"tao.hoanganh1998@gmail.com", "abc", "abc");
		qlSinhVien.setDiemTrungBinh(8, 9, 10);
		System.out.println(qlSinhVien.toString());
		System.out.println("Ten: " + qlSinhVien.getFirstName());
		System.out.println("Ho: " + qlSinhVien.getLastName());
		System.out.println("Lot: " + qlSinhVien.getMiddleName());
		System.out.println("Xep hang: " + qlSinhVien.getRank());
	}
}
