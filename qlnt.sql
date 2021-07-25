USE [QuanLyNhaThuoc]
GO
/****** Object:  Table [dbo].[DanhMucThuoc]    Script Date: 7/25/2021 6:04:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DanhMucThuoc](
	[MaThuoc] [nvarchar](10) NOT NULL,
	[TenThuoc] [nvarchar](50) NOT NULL,
	[SoDK] [nvarchar](50) NULL,
	[HangSX] [nvarchar](50) NULL,
	[NoiSX] [nvarchar](30) NULL,
	[DonViGoc] [nvarchar](20) NOT NULL,
	[DonViQuiDoi] [nvarchar](20) NOT NULL,
	[SoLuongQuiDoi] [float] NOT NULL,
	[DongGoi] [nvarchar](30) NULL,
	[MaNT] [nvarchar](10) NOT NULL,
	[HoatChat] [nvarchar](30) NOT NULL,
 CONSTRAINT [PK_DanhMucThuoc] PRIMARY KEY CLUSTERED 
(
	[MaThuoc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HangHoa]    Script Date: 7/25/2021 6:04:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HangHoa](
	[MaHH] [nvarchar](10) NOT NULL,
	[MaThuoc] [nvarchar](10) NOT NULL,
	[SoLo] [nvarchar](30) NOT NULL,
	[SoLuongGoc] [float] NOT NULL,
	[DonViGoc] [nvarchar](20) NOT NULL,
	[SLSauQuiDoi] [float] NOT NULL,
	[DonViQuiDoi] [nvarchar](20) NOT NULL,
	[GiaVon] [float] NOT NULL,
	[GiaBan] [float] NOT NULL,
	[GhiChu] [nvarchar](50) NULL,
 CONSTRAINT [PK_HangHoa] PRIMARY KEY CLUSTERED 
(
	[MaHH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 7/25/2021 6:04:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [nvarchar](10) NOT NULL,
	[MaNV] [nvarchar](10) NOT NULL,
	[NgayBan] [date] NOT NULL,
	[MaKH] [nvarchar](10) NOT NULL,
	[TongTien] [float] NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 7/25/2021 6:04:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[MaHD] [nvarchar](10) NOT NULL,
	[MaHH] [nvarchar](10) NOT NULL,
	[SoLuong] [float] NOT NULL,
	[DonGia] [float] NOT NULL,
 CONSTRAINT [PK_HoaDonChiTiet] PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC,
	[MaHH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 7/25/2021 6:04:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [nvarchar](10) NOT NULL,
	[HoTen] [nvarchar](50) NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[SDT] [nchar](10) NULL,
	[NamSinh] [int] NULL,
	[Diem] [float] NOT NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 7/25/2021 6:04:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [nvarchar](10) NOT NULL,
	[HoTen] [nvarchar](50) NOT NULL,
	[SDT] [nchar](10) NOT NULL,
	[Email] [nvarchar](50) NULL,
	[GioiTinh] [bit] NOT NULL,
	[MatKhau] [nvarchar](50) NOT NULL,
	[VaiTro] [bit] NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhomThuoc]    Script Date: 7/25/2021 6:04:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhomThuoc](
	[MaNT] [nvarchar](10) NOT NULL,
	[TenNT] [nvarchar](50) NOT NULL,
	[MoTa] [nvarchar](50) NULL,
 CONSTRAINT [PK_NhomThuoc] PRIMARY KEY CLUSTERED 
(
	[MaNT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[NhanVien] ([MaNV], [HoTen], [SDT], [Email], [GioiTinh], [MatKhau], [VaiTro]) VALUES (N'dainq', N'Nguyễn Quốc Đại', N'123       ', N'dai', 1, N'123', 0)
INSERT [dbo].[NhanVien] ([MaNV], [HoTen], [SDT], [Email], [GioiTinh], [MatKhau], [VaiTro]) VALUES (N'diemnn', N'Nguyễn Ngọc Diễm', N'123       ', N'diem', 0, N'123', 0)
INSERT [dbo].[NhanVien] ([MaNV], [HoTen], [SDT], [Email], [GioiTinh], [MatKhau], [VaiTro]) VALUES (N'linhltt', N'Liễu Thị Thùy Linh', N'123       ', N'linh', 0, N'123', 0)
INSERT [dbo].[NhanVien] ([MaNV], [HoTen], [SDT], [Email], [GioiTinh], [MatKhau], [VaiTro]) VALUES (N'linhnk', N'Ngô Khánh Linh', N'123       ', N'linh', 0, N'123', 0)
INSERT [dbo].[NhanVien] ([MaNV], [HoTen], [SDT], [Email], [GioiTinh], [MatKhau], [VaiTro]) VALUES (N'phucnh', N'Nguyễn Hoàng Phúc', N'0389021414', N'phucnguyenhoang769@gmail.com', 1, N'123', 1)
INSERT [dbo].[NhanVien] ([MaNV], [HoTen], [SDT], [Email], [GioiTinh], [MatKhau], [VaiTro]) VALUES (N'vietdvn', N'Đoàn Văn Nhật Việt', N'123       ', N'viet', 1, N'123', 1)
ALTER TABLE [dbo].[DanhMucThuoc]  WITH CHECK ADD  CONSTRAINT [FK_DanhMucThuoc_NhomThuoc] FOREIGN KEY([MaNT])
REFERENCES [dbo].[NhomThuoc] ([MaNT])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[DanhMucThuoc] CHECK CONSTRAINT [FK_DanhMucThuoc_NhomThuoc]
GO
ALTER TABLE [dbo].[HangHoa]  WITH CHECK ADD  CONSTRAINT [FK_HangHoa_DanhMucThuoc] FOREIGN KEY([MaThuoc])
REFERENCES [dbo].[DanhMucThuoc] ([MaThuoc])
GO
ALTER TABLE [dbo].[HangHoa] CHECK CONSTRAINT [FK_HangHoa_DanhMucThuoc]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonChiTiet_HangHoa] FOREIGN KEY([MaHH])
REFERENCES [dbo].[HangHoa] ([MaHH])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK_HoaDonChiTiet_HangHoa]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonChiTiet_HoaDon] FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK_HoaDonChiTiet_HoaDon]
GO
