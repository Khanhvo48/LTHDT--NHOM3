package Pack;
public class Sach {
		public String maSach;
		public String tieuDe;
		public String tacGia;
		public int namXuatBan;
		public int soLuong;
		
		void setMaSach(String maSach) {
			this.maSach=maSach;
		}
		String getMaSach() {
			return this.maSach;
		}
		void setTieuDe(String tieuDe) {
			this.tieuDe=tieuDe;
		}
		String getTieuDe() {
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
		void setSoLuong(int soLuong) {
			this.soLuong=soLuong;
		}
		int getSoLuong() {
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
		public String toString() {
        return  "maSach='" + this.maSach + '\'' +
                ", tenSach='" + this.tieuDe + '\'' +
                ", tacGia='" + this.tacGia + '\'' +
				", Nam xuat ban=" + this.namXuatBan +
                ", So luong=" + this.soLuong ;      
    	}	
}
