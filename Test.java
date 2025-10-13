public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tạo đối tượng sách giáo trình
        SachGiaoTrinh GT1 = new SachGiaoTrinh("SGT01", "Lập trình Java", "Nguyễn Văn A", 2023, 10, "CNTT", "Đại học");
        SachGiaoTrinh GT2 = new SachGiaoTrinh("SGT02", "Toán cao cấp", "Trần Thị B", 2022, 5, "Toán", "Đại học");

        // Tạo đối tượng sách tiểu thuyết
        SachTieuThuyet TH1 = new SachTieuThuyet("STT01", "Harry Potter", "J.K. Rowling", 2000, 20, "Giả tưởng", true);
        SachTieuThuyet TH2 = new SachTieuThuyet("STT02", "Nhà Giả Kim", "Paulo Coelho", 1990, 15, "Tâm lý", false);

        // Thêm sách vào danh sách
        ql.themSach(GT1);
        ql.themSach(GT2);
        ql.themSach(TH1);
        ql.themSach(TH2);

        System.out.println("\n Danh sách sách:");
        ql.hienThi();

        // Tìm kiếm
        System.out.println("\n Tìm sách có mã 'STT01':");
        Sach kq = ql.timKiem("STT01");
        if (kq != null) System.out.println(kq);

        // Cập nhật
        SachTieuThuyet stMoi = new SachTieuThuyet("STT01", "Harry Potter (Tái bản)", "J.K. Rowling", 2024, 25, "Giả tưởng", true);
        ql.capNhat("STT01", stMoi);

        System.out.println("\n Danh sách sau khi cập nhật:");
        ql.hienThi();

        // Xóa sách
        ql.xoaSach("SGT02");

        System.out.println("\n Danh sách sau khi xóa:");
        ql.hienThi();
    }
}
