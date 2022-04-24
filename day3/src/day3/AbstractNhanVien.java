package day3;

public abstract class AbstractNhanVien {
	private String id;
	private String fullName;
	private String phone;
	private int workingDays;
	private int luong;

	public abstract double calculateSalary();

	protected AbstractNhanVien(String id, String fullName, String phone, int workingDays, int luong) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.phone = phone;
		this.workingDays = workingDays;
		this.luong = luong;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	public boolean equals(String id) {
		return this.id.equals(id) ? true : false;
	}

	@Override
	public String toString() {
		return "AbstractNhanVien [id=" + id + ", fullName=" + fullName + ", phone=" + phone + ", workingDays="
				+ workingDays + ", luong=" + luong + "]";
	}
	
	

}
