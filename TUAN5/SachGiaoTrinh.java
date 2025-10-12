// Lớp SachGiaoTrinh kế thừa từ lớp Sach
public class SachGiaoTrinh extends Sach {
    
    private String monHoc;
    private String capDo;
    
    // Constructor không tham số
    public SachGiaoTrinh() {
        super();
    }
    
    // Constructor đầy đủ tham số (bao gồm thuộc tính của lớp cha và lớp con)
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    
    // Getter và Setter cho monHoc
    public String getMonHoc() {
        return monHoc;
    }
    
    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }
    
    // Getter và Setter cho capDo
    public String getCapDo() {
        return capDo;
    }
    
    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }
    
    // Ghi đè phương thức toString() để hiển thị thông tin đầy đủ
    @Override
    public String toString() {
        return super.toString() + 
               "\nMôn học: " + monHoc + 
               "\nCấp độ: " + capDo + 
               "\nLoại: Sách giáo trình";
    }
    
    // Ghi đè phương thức hienThiThongTin() để hiển thị thông tin đầy đủ
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Môn học: " + monHoc);
        System.out.println("Cấp độ: " + capDo);
        System.out.println("Loại: Sách giáo trình");
    }
}