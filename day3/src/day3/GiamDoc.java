package day3;

public class GiamDoc extends AbstractNhanVien {

	private double companyStocks;

	public GiamDoc(String id, String fullName, String phone, int workingDays, double companyStock) {
		super(id, fullName, phone, workingDays, 300);
		this.companyStocks = companyStock;
	}

	public double getCompanyStocks() {
		return companyStocks;
	}

	public void setCompanyStocks(int companyStocks) {
		this.companyStocks = companyStocks;
	}

	@Override
	public double calculateSalary() {
		return super.getLuong() * super.getWorkingDays();
	}

	public boolean equals(GiamDoc giamDoc) {
		return giamDoc.getId().equals(super.getId()) ? true : false;
	}

}
