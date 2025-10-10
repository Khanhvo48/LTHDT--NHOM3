package Pack;

public class SachTieuThuyet extends Sach {
        private String theLoai;
        private Boolean laSachSerie;
        String getTheLoai() {
            return theLoai;
        }
        void setTheLoai(String theLoai){
            this.theLoai = theLoai;
        }
        Boolean getlaSachSerie() {
            return this.laSachSerie;
        }
        void setlaSachSerie(Boolean laSachSerie){
            this.laSachSerie = laSachSerie;
        }
        public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, Boolean laSachSerie) {
            super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
            this.theLoai = theLoai;
            this.laSachSerie = laSachSerie;
        }
        @Override
        public String toString() {
            return super.toString() +
                    ", The loai='" + this.theLoai + '\'' +
                    ", La sach serie=" + (this.laSachSerie ? "Co" : "Khong") +
                    '}';
        }
        public SachTieuThuyet(){
            super();
        }
}
