// Lớp SachTieuThuyet kế thừa từ lớp Sach
public class SachTieuThuyet extends Sach {
    
    private String theLoai;
    private boolean laSachSeries;
    
    // Constructor không tham số
    public SachTieuThuyet() {
        super();
    }
    
    // Constructor đầy đủ tham số (bao gồm thuộc tính của lớp cha và lớp con)
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    
    // Getter và Setter cho theLoai
    public String getTheLoai() {
        return theLoai;
    }
    
    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    
    // Getter và Setter cho laSachSeries
    public boolean isLaSachSeries() {
        return laSachSeries;
    }
    
    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }
    
    // Ghi đè phương thức toString() để hiển thị thông tin đầy đủ
    @Override
    public String toString() {
        return super.toString() + 
               "\nThể loại: " + theLoai + 
               "\nLà sách series: " + (laSachSeries ? "Có" : "Không") + 
               "\nLoại: Sách tiểu thuyết";
    }
    
    // Ghi đè phương thức hienThiThongTin() để hiển thị thông tin đầy đủ
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Thể loại: " + theLoai);
        System.out.println("Là sách series: " + (laSachSeries ? "Có" : "Không"));
        System.out.println("Loại: Sách tiểu thuyết");
    }
}
