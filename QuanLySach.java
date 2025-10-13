import java.util.ArrayList;
import java.util.List;

// Lớp QuanLySach để quản lý danh sách các loại sách
public class QuanLySach {
    
    private final List<Sach> danhSachSach;
    
    // Constructor
    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }
    
    // Thêm sách mới vào danh sách
    public void themSach(Sach sach) {
        if (sach != null) {
            danhSachSach.add(sach);
            System.out.println("Đã thêm sách thành công!");
        } else {
            System.out.println("Không thể thêm sách rỗng!");
        }
    }
    
    // Xóa sách theo mã sách
    public boolean xoaSach(String maSach) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equals(maSach)) {
                danhSachSach.remove(i);
                System.out.println("Đã xóa sách có mã: " + maSach);
                return true;
            }
        }
        System.out.println("Không tìm thấy sách có mã: " + maSach);
        return false;
    }
    
    // Cập nhật thông tin sách theo mã sách
    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equals(maSach)) {
                danhSachSach.set(i, sachMoi);
                System.out.println("Đã cập nhật sách có mã: " + maSach);
                return true;
            }
        }
        System.out.println("Không tìm thấy sách có mã: " + maSach);
        return false;
    }
    
    // Tìm kiếm sách theo mã sách
    public Sach timKiemSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                return sach;
            }
        }
        return null;
    }
    
    // Hiển thị thông tin sách theo mã sách
    public void hienThiSach(String maSach) {
        Sach sach = timKiemSach(maSach);
        if (sach != null) {
            System.out.println("=== THÔNG TIN SÁCH ===");
            sach.hienThiThongTin();
            System.out.println("=====================");
        } else {
            System.out.println("Không tìm thấy sách có mã: " + maSach);
        }
    }
    
    // Hiển thị danh sách tất cả sách
    public void hienThiDanhSachSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách trống!");
            return;
        }
        
        System.out.println("=== DANH SÁCH TẤT CẢ SÁCH ===");
        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.println("--- Sách thứ " + (i + 1) + " ---");
            danhSachSach.get(i).hienThiThongTin();
            System.out.println();
        }
        System.out.println("Tổng số sách: " + danhSachSach.size());
        System.out.println("=============================");
    }
    
    // Lấy số lượng sách trong danh sách
    public int getSoLuongSach() {
        return danhSachSach.size();
    }
    
    // Kiểm tra danh sách có trống không
    public boolean isEmpty() {
        return danhSachSach.isEmpty();
    }
    
    // Lấy danh sách sách (để sử dụng bên ngoài nếu cần)
    public List<Sach> getDanhSachSach() {
        return new ArrayList<>(danhSachSach); // Trả về bản sao để bảo mật
    }
}