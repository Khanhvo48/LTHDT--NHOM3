public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("B001", "Lập trình Java cơ bản", "Nguyễn Văn An", 2022, 10);

        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cấu trúc dữ liệu và giải thuật");
        sach2.setTacGia("Trần Thị Bích");
        sach2.setNamXuatBan(2023);
        sach2.setSoLuong(5);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        sach2.setSoLuong(8);
        System.out.println("Sau khi cập nhật số lượng sách 2:");
        sach2.hienThiThongTin();
    }
}
