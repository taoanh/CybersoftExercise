package day3;

public class TruongPhong extends AbstractNhanVien {

	private int numberOfPersonnel;

	public TruongPhong(String id, String fullName, String phone, int workingDays) {
		super(id, fullName, phone, workingDays, 200);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {

		return super.getLuong() * super.getWorkingDays() + 100 * this.numberOfPersonnel;
	}

	public int getNumberOfPersonnel() {
		return numberOfPersonnel;
	}

	public void setNumberOfPersonnel(int numberOfPersonnel) {
		this.numberOfPersonnel = numberOfPersonnel;
	}

	public boolean equals(TruongPhong truongPhong) {
		return truongPhong.getId().equals(super.getId()) ? true : false;
	}

}
