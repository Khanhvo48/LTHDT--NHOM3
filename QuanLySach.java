import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    // Thêm sách
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("Đã thêm sách thành công!");
    }

    // Xóa sách theo mã
    public void xoaSach(String maSach) {
        Sach sach = timKiem(maSach);
        if (sach != null) {
            danhSach.remove(sach);
            System.out.println("Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println("Không tìm thấy sách để xóa.");
        }
    }

    // Cập nhật sách theo mã
    public void capNhat(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.set(i, sachMoi);
                System.out.println("Đã cập nhật sách có mã: " + maSach);
                return;
            }
        }
        System.out.println("Không tìm thấy sách để cập nhật.");
    }

    // Tìm kiếm sách theo mã
    public Sach timKiem(String maSach) {
        for (Sach sach : danhSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    // Hiển thị danh sách sách
    public void hienThi() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách rỗng.");
        } else {
            for (Sach sach : danhSach) {
                System.out.println(sach);
            }
        }
    }
}
