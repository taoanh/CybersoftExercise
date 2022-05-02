CREATE DATABASE IF NOT EXISTS QLBanSach;
USE QLBanSach;

CREATE TABLE IF NOT EXISTS NhaXuatBan(
	MaNSX nvarchar(8) primary key,
    TenNSB nvarchar(100),
    DiaChi nvarchar(200),
    DienThoai varchar(11)
);

CREATE TABLE IF NOT EXISTS TacGia(
	MaTacGia nvarchar(8) primary key,
    TenTacGia nvarchar(100),
    DiaChi nvarchar(200),
    DienThoai varchar(11),
    TieuSu nvarchar(300)
);

CREATE TABLE IF NOT EXISTS ChuDe(
	MaChuDe nvarchar(8) primary key,
    TenChuDe nvarchar(100)
);

CREATE TABLE IF NOT EXISTS KhachHang(
	MaKH nvarchar(8) primary key,
    HoTen nvarchar(100),
    DiaChi nvarchar(200),
    DienThoai varchar(11),
    Email varchar(100),
    TaiKhoan nvarchar(20),
    MatKhau varchar(30),
    NgaySinh date
);

CREATE TABLE IF NOT EXISTS DonHang(
	MaDonHang nvarchar(8) primary key,
    DaThanhToan boolean,
    NgayGia date,
    NgayDat date,
    TinhTrangGH nvarchar(10)
);

CREATE TABLE IF NOT EXISTS Sach(
	MaSach nvarchar(8) primary key,
    TenSach nvarchar(100),
    SoLuongTon int,
    AnhBia varchar(100),
    NgayCapNhat date,
    MoTa nvarchar(100),
    GiaBan int
);

ALTER TABLE DonHang 
    ADD MaKH nvarchar(8), 
    add constraint FK_KhachHang_DonHang 
		foreign key(MaKH) 
        references KhachHang(MaKH);

CREATE TABLE IF NOT EXISTS DonHangSach(
	MaDonHang nvarchar(8),
    MaSach nvarchar(8),
    SoLuong int,
    DonGia int,
    primary key(MaDonHang,MaSach)
);

ALTER TABLE DonHangSach 
    ADD constraint FK_DonHangSach_DonHang 
		foreign key(MaDonHang) 
        references DonHang(MaDonHang),
	ADD constraint FK_DonHangSach_Sach 
		foreign key(MaSach) 
        references Sach(MaSach);

ALTER TABLE Sach 
	ADD MaNSX nvarchar(8),
    ADD constraint FK_Sach_NhaXuatBan 
		foreign key(MaNSX) 
        references NhaXuatBan(MaNSX);

ALTER TABLE Sach 
	ADD MaChuDe nvarchar(8),
    ADD constraint FK_Sach_ChuDe
		foreign key(MaChuDe) 
        references ChuDe(MaChuDe);

CREATE TABLE IF NOT EXISTS SachTacGia(
	MaTacGia nvarchar(8) ,
    MaSach nvarchar(8) ,
    VaiTro nvarchar(100),
    ViTri nvarchar(100),
    primary key(MaTacGia,MaSach)
);

ALTER TABLE SachTacGia 
    ADD constraint FK_SachTacGia_TacGia
		foreign key(MaTacGia) 
        references TacGia(MaTacGia),
	ADD constraint FK_SachTacGia_Sach 
		foreign key(MaSach) 
        references Sach(MaSach);