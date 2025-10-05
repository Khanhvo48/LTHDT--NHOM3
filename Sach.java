public class Sach {
		private String maSach;
		private String tieuDe;
		private String tacGia;
		private int namXuatBan;
		private int soLuong;
		
		void setmaSach(String maSach) {
			this.maSach=maSach;
		}
		String getmaSach() {
			return this.maSach;
		}
		void settieuDe(String tieuDe) {
			this.tieuDe=tieuDe;
		}
		String gettieuDe() {
			return this.tieuDe;
		}
		void setTacGia(String tacGia) {
			this.tacGia=tacGia;
		}
		String getTacGia() {
			return this.tacGia;
		}
		void setnamXuatBan(int namXuatBan) {
			this.namXuatBan=namXuatBan;
		}
		int getNamXuatBan() {
			return this.namXuatBan;
		}
		void setsoLuong(int soLuong) {
			this.soLuong=soLuong;
		}
		int getsoLuong() {
			return this.soLuong;
		}
		public Sach(String maSach, String tieuDe, String tacGia,int namXuatBan, int soLuong) {
			this.maSach=maSach;
			this.tieuDe=tieuDe;
			this.tacGia=tacGia;
			this.namXuatBan=namXuatBan;
			this.soLuong=soLuong;
		}
		public Sach() {
		}
		void inThongTin() {
			System.out.println("Ma Sach: "+this.maSach);
			System.out.println("Tieu De:" +this.tieuDe);
			System.out.println("Tac Gia: "+this.tacGia);
			System.out.println("Nam Xuat Ban: "+this.namXuatBan);
			System.out.println("So Luong: "+this.soLuong);
		}
}
