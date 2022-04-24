package day3;

public class Company {
	private String companyName;
	private String taxIdentificationNumber;
	private int monthRevenue;
	
	
	
	public Company(String companyName, String taxIdentificationNumber, int monthRevenue) {
		super();
		this.companyName = companyName;
		this.taxIdentificationNumber = taxIdentificationNumber;
		this.monthRevenue = monthRevenue;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}
	public void setTaxIdentificationNumber(String taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}
	public int getMonthRevenue() {
		return this.monthRevenue;
	}
	public void setMonthRevenue(int monthRevenue) {
		this.monthRevenue = monthRevenue;
	}

}
