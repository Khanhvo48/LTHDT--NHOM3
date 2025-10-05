public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("B001", "Lập trình Java", "Nguyễn Văn A", 2022, 10);

        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cấu trúc dữ liệu");
        sach2.setTacGia("Trần Thị B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(5);

        System.out.println("Thông tin sách 1:");
        sach1.hienThiThongTin();

        System.out.println("\nThông tin sách 2:");
        sach2.hienThiThongTin();
    }
}