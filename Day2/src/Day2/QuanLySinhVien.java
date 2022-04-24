package Day2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class QuanLySinhVien {
	private String maSV;
	private String hoVaTenSV;
	private Date ngayThangNamSinh;
	private String gioiTinh;
	private long soDienThoai;
	private String email;
	private String diaChiThuongTru;
	private String diaChiTamTru;
	private double diemTrungBinh;

	public QuanLySinhVien(String maSV, String hoVaTenSV, String ngayThangNamSinh, String gioiTinh, long soDienThoai,
			String email, String diaChiThuongTru, String diaChiTamTru) {
		super();
		this.maSV = maSV;
		this.hoVaTenSV = hoVaTenSV;
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		try {
			this.ngayThangNamSinh = df.parse(ngayThangNamSinh);
		} catch (ParseException e) {
			System.out.println("Invalid date");
		}
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.diaChiThuongTru = diaChiThuongTru;
		this.diaChiTamTru = diaChiTamTru;
	}

	public String getRank() {
		if(this.diemTrungBinh >= 8) {
			return "Hoc sinh gioi";
		}else if(this.diemTrungBinh >= 6 && this.diemTrungBinh <8) {
			return "Hoc sinh kha";
		}else if(this.diemTrungBinh >= 5 && this.diemTrungBinh < 6) {
			return "Hoc sinh trung binh";
		}else {
			return "Hoc sinh yeu";
		}
	}
	
	public String getMiddleName() {
		String[] name = hoVaTenSV.split(" ");
		StringBuilder middleName = new StringBuilder();
		for (int i = 1; i < name.length - 1; i++) {
			middleName.append(name[i]);
		}
		return middleName.toString();
	}

	public String getFirstName() {
		String[] name = hoVaTenSV.split(" ");
		return name[name.length - 1];
	}

	public String getLastName() {
		String[] name = hoVaTenSV.split(" ");
		return name[0];
	}

	private double averagePoint(int toan, int ly, int hoa) {

		return (toan + ly + hoa) / 3;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoVaTenSV() {
		return hoVaTenSV;
	}

	public void setHoVaTenSV(String hoVaTenSV) {
		this.hoVaTenSV = hoVaTenSV;
	}

	public Date getNgayThangNamSinh() {
		return ngayThangNamSinh;
	}

	public void setNgayThangNamSinh(Date ngayThangNamSinh) {
		this.ngayThangNamSinh = ngayThangNamSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public long getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiaChiThuongTru() {
		return diaChiThuongTru;
	}

	public void setDiaChiThuongTru(String diaChiThuongTru) {
		this.diaChiThuongTru = diaChiThuongTru;
	}

	public String getDiaChiTamTru() {
		return diaChiTamTru;
	}

	public void setDiaChiTamTru(String diaChiTamTru) {
		this.diaChiTamTru = diaChiTamTru;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(int toan, int ly, int hoa) {
		if (toan >= 0 && toan <= 10 && ly >= 0 && ly <= 10 && hoa >= 0 && hoa <= 10) {
			this.diemTrungBinh = averagePoint(toan, ly, hoa);
		}
	}

	@Override
	public String toString() {
		return "QuanLySinhVien [maSV=" + maSV + ", hoVaTenSV=" + hoVaTenSV + ", ngayThangNamSinh=" + ngayThangNamSinh
				+ ", gioiTinh=" + gioiTinh + ", soDienThoai=" + soDienThoai + ", email=" + email + ", diaChiThuongTru="
				+ diaChiThuongTru + ", diaChiTamTru=" + diaChiTamTru + ", diemTrungBinh=" + diemTrungBinh + "]";
	}
}
