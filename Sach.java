public class Sach {

    // YÊU CẦU 1 : Các thuộc tính
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // YÊU CẦU 4: Constructor

    // Constructor mặc định
    public Sach() {
    }

    // Constructor đầy đủ tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // YÊU CẦU 5: Getter và Setter (tính đóng gói)
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    // YÊU CẦU 2: Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("===== THÔNG TIN SÁCH =====");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("===========================\n");
    }

        @Override
    public String toString() {
        return "Mã sách: " + maSach + 
               "\nTiêu đề: " + tieuDe + 
               "\nTác giả: " + tacGia + 
               "\nNăm xuất bản: " + namXuatBan + 
               "\nSố lượng: " + soLuong;
    }
}

