package day3;

public class NhanVien extends AbstractNhanVien {
	private TruongPhong truongPhong;

	public NhanVien(String id, String fullName, String phone, int workingDays) {
		super(id, fullName, phone, workingDays, 100);
		this.truongPhong = null;
	}
	
	public NhanVien(String id, String fullName, String phone, int workingDays, TruongPhong truongPhong) {
		super(id, fullName, phone, workingDays, 100);
		this.truongPhong = truongPhong;
	}

	@Override
	public double calculateSalary() {
		
		return super.getLuong() * super.getWorkingDays();
	}

	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}


	public boolean equals(NhanVien nhanVien) {
		return nhanVien.getId().equals(super.getId()) ? true : false;
	}


}
