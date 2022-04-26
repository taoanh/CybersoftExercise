package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class QuanLyNhanSu {
	private Company company;
	private List<NhanVien> listNhanVien;
	private List<TruongPhong> listTruongPhong;
	private List<GiamDoc> listGiamDoc;

	public QuanLyNhanSu() {
		listNhanVien = new ArrayList<>();
		listTruongPhong = new ArrayList<>();
		listGiamDoc = new ArrayList<>();
	}

	public QuanLyNhanSu(Company company) {
		this.company = company;
		listNhanVien = new ArrayList<>();
		listTruongPhong = new ArrayList<>();
		listGiamDoc = new ArrayList<>();
	}

	public Boolean addNhanVien(NhanVien addNhanVien) {
		if (!checkAvailable(addNhanVien.getId())) {
			return false;
		}
		listNhanVien.add(addNhanVien);
		return true;
	}

	public boolean addTruongPhong(TruongPhong addTruongPhong) {
		if (!checkAvailable(addTruongPhong.getId())) {
			return false;
		}
		listTruongPhong.add(addTruongPhong);
		return true;

	}

	public boolean addGiamDoc(GiamDoc giamDoc) {
		if (!checkAvailable(giamDoc.getId())) {
			return false;
		}
		listGiamDoc.add(giamDoc);
		return true;
	}

	private boolean checkAvailable(String id) {
		for (GiamDoc giamDoc : listGiamDoc) {
			if (giamDoc.equals(id)) {
				System.out.println("Da co nhan vien nay co chuc vu la giam doc");
				return false;
			}
		}
		for (TruongPhong truongPhong : listTruongPhong) {
			if (truongPhong.equals(id)) {
				System.out.println("Da co nhan vien nay co chuc vu la truong phong");
				return false;
			}
		}

		for (NhanVien nhanVien : listNhanVien) {
			if (nhanVien.equals(id)) {
				System.out.println("Da co nhan vien nay co chuc vu la nhan vien");
				return false;
			}
		}
		return true;
	}

	public boolean removeEmploy(String id) {
		for (int i = 0; i < listGiamDoc.size(); i++) {
			if (listGiamDoc.get(i).equals(id)) {
				listGiamDoc.remove(i);
				return true;
			}
		}
		for (int i = 0; i < listTruongPhong.size(); i++) {
			if (listTruongPhong.get(i).equals(id)) {
				listTruongPhong.remove(i);
				return true;
			}
		}

		for (int i = 0; i < listNhanVien.size(); i++) {
			if (listNhanVien.get(i).equals(id)) {
				listNhanVien.remove(i);
				return true;
			}
		}
		System.out.println("Nhan vien khong ton tai.");
		return false;
	}

	public void showAllEmploy() {
		System.out.println("Thong tin cac giam doc: \n");
		for (GiamDoc giamDoc : listGiamDoc) {
			System.out.println(giamDoc.toString());
		}
		System.out.println("Thong tin cac truong phong: \n");
		for (TruongPhong truongPhong : listTruongPhong) {
			System.out.println(truongPhong.toString());
		}
		System.out.println("Thong tin cac Nhan vien: \n");
		for (NhanVien nhanVien : listNhanVien) {
			System.out.println(nhanVien.toString());
		}
	}

	public int amountSalary() {
		int amount = 0;
		for (GiamDoc giamDoc : listGiamDoc) {
			amount += giamDoc.calculateSalary();
		}
		System.out.println("Thong tin cac truong phong: \n");
		for (TruongPhong truongPhong : listTruongPhong) {
			amount += truongPhong.calculateSalary();
		}
		System.out.println("Thong tin cac Nhan vien: \n");
		for (NhanVien nhanVien : listNhanVien) {
			amount += nhanVien.calculateSalary();
		}
		return amount;
	}

	public NhanVien highestSalaryNhanVien() {
		NhanVien highestSalaryNhanVien = listNhanVien.get(0);
		for (int i = 1; i < listNhanVien.size(); i++) {
			NhanVien nhanVien = listNhanVien.get(i);
			if (nhanVien.calculateSalary() > highestSalaryNhanVien.calculateSalary()) {
				highestSalaryNhanVien = nhanVien;
			}
		}
		return highestSalaryNhanVien;
	}

	public TruongPhong truongPhongNhanVienNhieuNhat() {
		TruongPhong highest = listTruongPhong.get(0);
		for (int i = 1; i < listTruongPhong.size(); i++) {
			TruongPhong truongPhong = listTruongPhong.get(i);
			if (truongPhong.getNumberOfPersonnel() > highest.getNumberOfPersonnel()) {
				highest = truongPhong;
			}
		}
		return highest;
	}

	public void sortEmployeeByName() {
		Collections.sort(listNhanVien, (a, b) -> (a.getFullName()).compareTo(b.getFullName()));
		Collections.sort(listTruongPhong, (a, b) -> (a.getFullName()).compareTo(b.getFullName()));
		Collections.sort(listGiamDoc, (a, b) -> (a.getFullName()).compareTo(b.getFullName()));
	}

	public void sortEmployeeBySalary() {
		Collections.sort(listNhanVien, new Comparator<NhanVien>() {

			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				if (o1.calculateSalary() < o2.calculateSalary()) {
					return 1;
				} else if (o1.calculateSalary() == o2.calculateSalary()) {
					return 0;
				} else
					return -1;
			}

		});
	}

	public GiamDoc getHighestStock() {
		GiamDoc highestStockGiamDoc = listGiamDoc.get(0);
		for (GiamDoc giamDoc : listGiamDoc) {
			if (giamDoc.getCompanyStocks() > highestStockGiamDoc.getCompanyStocks()) {
				highestStockGiamDoc = giamDoc;
			}
		}
		return highestStockGiamDoc;
	}
	
	public void printRevenueGiamDocs() {
		for (GiamDoc giamDoc : listGiamDoc) {
			System.out.println(giamDoc.toString());
			System.out.println("Thu Nhap: "+getRevenueGiamDoc(giamDoc));
			System.out.println();
		}
		
	}
	
	public double getRevenueGiamDoc(GiamDoc giamDoc) {
		return (double)(giamDoc.calculateSalary() 
				+ giamDoc.getCompanyStocks()
				*(company.getMonthRevenue()-tongLuongToanCongTyTrongThang())/100 );
	}
	
	public int tongLuongToanCongTyTrongThang () {
		int sum = 0;
		for (GiamDoc giamDoc : listGiamDoc) {
			sum += giamDoc.calculateSalary();
		}
		
		for (NhanVien nhanVien : listNhanVien) {
			sum += nhanVien.calculateSalary();
		}
		
		for (TruongPhong truongPhong : listTruongPhong) {
			sum += truongPhong.calculateSalary();
		}
		
		return sum;
	}

}
