// Lớp Test để demo các chức năng của hệ thống quản lý sách
public class Test {
    
    public static void main(String[] args) {
        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ SÁCH - TUẦN 6 ===");
        System.out.println("Tính kế thừa và đa hình trong Java\n");
        
        // Tạo đối tượng QuanLySach
        QuanLySach quanLySach = new QuanLySach();
        
        // Tạo các đối tượng sách giáo trình
        SachGiaoTrinh sachGT1 = new SachGiaoTrinh("GT001", "Lập trình Java", "Nguyễn Văn A", 2023, 50, "Lập trình", "Đại học");
        SachGiaoTrinh sachGT2 = new SachGiaoTrinh("GT002", "Cấu trúc dữ liệu", "Trần Thị B", 2022, 30, "Khoa học máy tính", "Đại học");
        SachGiaoTrinh sachGT3 = new SachGiaoTrinh("GT003", "Toán học cơ bản", "Lê Văn C", 2023, 100, "Toán học", "Phổ thông");
        
        // Tạo các đối tượng sách tiểu thuyết
        SachTieuThuyet sachTT1 = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2020, 25, "Khoa học viễn tưởng", true);
        SachTieuThuyet sachTT2 = new SachTieuThuyet("TT002", "Tình yêu thời đại số", "Nguyễn Thị D", 2021, 40, "Lãng mạn", false);
        SachTieuThuyet sachTT3 = new SachTieuThuyet("TT003", "Lord of the Rings", "J.R.R. Tolkien", 2019, 15, "Khoa học viễn tưởng", true);
        
        // Tạo sách thông thường
        Sach sachThuong = new Sach("S001", "Sách tham khảo", "Tác giả E", 2023, 20);
        
        System.out.println("1. THÊM SÁCH VÀO DANH SÁCH:");
        System.out.println("----------------------------");
        
        // Thêm sách vào danh sách
        quanLySach.themSach(sachGT1);
        quanLySach.themSach(sachGT2);
        quanLySach.themSach(sachGT3);
        quanLySach.themSach(sachTT1);
        quanLySach.themSach(sachTT2);
        quanLySach.themSach(sachTT3);
        quanLySach.themSach(sachThuong);
        
        System.out.println("\n2. HIỂN THỊ DANH SÁCH TẤT CẢ SÁCH:");
        System.out.println("-----------------------------------");
        quanLySach.hienThiDanhSachSach();
        
        System.out.println("\n3. TÌM KIẾM SÁCH THEO MÃ:");
        System.out.println("-------------------------");
        quanLySach.hienThiSach("GT001");
        quanLySach.hienThiSach("TT001");
        quanLySach.hienThiSach("S001");
        quanLySach.hienThiSach("KHONG_TON_TAI"); // Test trường hợp không tìm thấy
        
        System.out.println("\n4. CẬP NHẬT SÁCH:");
        System.out.println("-----------------");
        // Tạo sách mới để cập nhật
        SachGiaoTrinh sachGT1Moi = new SachGiaoTrinh("GT001", "Lập trình Java Nâng cao", "Nguyễn Văn A", 2024, 60, "Lập trình", "Đại học");
        quanLySach.capNhatSach("GT001", sachGT1Moi);
        
        // Hiển thị sách đã cập nhật
        System.out.println("Sách sau khi cập nhật:");
        quanLySach.hienThiSach("GT001");
        
        System.out.println("\n5. XÓA SÁCH:");
        System.out.println("-------------");
        quanLySach.xoaSach("TT002");
        quanLySach.xoaSach("KHONG_TON_TAI"); // Test trường hợp không tìm thấy
        
        System.out.println("\n6. HIỂN THỊ DANH SÁCH SAU KHI XÓA:");
        System.out.println("-----------------------------------");
        quanLySach.hienThiDanhSachSach();
        
        System.out.println("\n7. DEMO TÍNH ĐA HÌNH:");
        System.out.println("---------------------");
        System.out.println("Sử dụng phương thức toString() - đa hình:");
        System.out.println("Sách giáo trình:");
        System.out.println(sachGT1Moi.toString());
        System.out.println("\nSách tiểu thuyết:");
        System.out.println(sachTT1.toString());
        System.out.println("\nSách thông thường:");
        System.out.println(sachThuong.toString());
        
        System.out.println("\n8. THỐNG KÊ:");
        System.out.println("-------------");
        System.out.println("Tổng số sách hiện tại: " + quanLySach.getSoLuongSach());
        System.out.println("Danh sách có trống không: " + (quanLySach.isEmpty() ? "Có" : "Không"));
        
        System.out.println("\n=== KẾT THÚC CHƯƠNG TRÌNH ===");
    }
}

