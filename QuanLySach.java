/*package Pack;
import java.util.ArrayList;
import java.util.Scanner;
class QuanLySach {
    private ArrayList<SachGiaoTrinh> SachGiaoTrinhList;
    private ArrayList<SachTieuThuyet> SachTieuThuyetList;
    private ArrayList<Sach> danhSachSach;
    public QuanLySach() {
        this.SachGiaoTrinhList = new ArrayList<>();
        this.SachTieuThuyetList = new ArrayList<>();
        this.danhSachSach = new ArrayList<>();
    }
    public void NhapSach(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sach can them: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
            System.out.print("Ma sach: ");
            String maSach = scanner.nextLine();
            System.out.print("Tieu de: ");
            String tieuDe = scanner.nextLine();
            System.out.print("Tac gia: ");
            String tacGia = scanner.nextLine();
            System.out.print("Nam xuat ban: ");
            int namXuatBan = Integer.parseInt(scanner.nextLine());
            System.out.print("So luong: ");
            int soLuong = Integer.parseInt(scanner.nextLine());
            Sach sach = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
            if(danhSachSach == null){
            danhSachSach = new ArrayList<>();
            }
            danhSachSach.add(sach);    
        }
        scanner.close();
    }
    public void NhapSachTieuThuyet (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sach tieu thuyet can them: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sach tieu thuyet thu " + (i + 1) + ":");
            System.out.print("Ma sach: ");
            String maSach = scanner.nextLine();
            System.out.print("Tieu de: ");
            String tieuDe = scanner.nextLine();
            System.out.print("Tac gia: ");
            String tacGia = scanner.nextLine();
            System.out.print("Nam xuat ban: ");
            int namXuatBan = Integer.parseInt(scanner.nextLine());
            System.out.print("So luong: ");
            int soLuong = Integer.parseInt(scanner.nextLine());
            System.out.print("The loai: ");
            String theLoai = scanner.nextLine();
            System.out.print("La sach serie (true/false): ");
            Boolean laSachSerie = Boolean.parseBoolean(scanner.nextLine());
            SachTieuThuyet sach = new SachTieuThuyet(maSach, tieuDe, tacGia, namXuatBan, soLuong,theLoai,laSachSerie);
            if(SachTieuThuyetList == null){
            SachTieuThuyetList = new ArrayList<>();
            }
            SachTieuThuyetList.add(sach);
        }
        scanner.close();

    }
    public void NhapSachGiaoTrinh (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sach giao trinh can them: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sach giao trinh thu " + (i + 1) + ":");
            System.out.print("Ma sach: ");
            String maSach = scanner.nextLine();
            System.out.print("Tieu de: ");
            String tieuDe = scanner.nextLine();
            System.out.print("Tac gia: ");
            String tacGia = scanner.nextLine();
            System.out.print("Nam xuat ban: ");
            int namXuatBan = Integer.parseInt(scanner.nextLine());
            System.out.print("So luong: ");
            int soLuong = Integer.parseInt(scanner.nextLine());
            System.out.print("Mon hoc: ");
            String monHoc = scanner.nextLine();
            System.out.print("Cap do: ");
            String capDo = scanner.nextLine();
            SachGiaoTrinh sach = new SachGiaoTrinh(maSach, tieuDe, tacGia, namXuatBan, soLuong,monHoc,capDo);
            if(SachGiaoTrinhList == null){
            SachGiaoTrinhList = new ArrayList<>();
            }
        SachGiaoTrinhList.add(sach);
        }
        scanner.close();
    }
    
    public void TimKiemSachTheoMa(String maSach){
        System.out.println("Ket qua tim kiem sach voi ma sach " + maSach + ":");
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println(sach.toString());
                System.out.println("--------------------");
            }
        }
    }
    public void TimKiemSachTieuThuyetTheoMa(String maSach){
        System.out.println("Ket qua tim kiem sach tieu thuyet voi ma sach " + maSach + ":");
        for (SachTieuThuyet sach : SachTieuThuyetList) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println(sach.toString());
                System.out.println("--------------------");
            }
        }
    }
    public void TimKiemSachGiaoTrinhTheoMa(String maSach){
        System.out.println("Ket qua tim kiem sach giao trinh voi ma sach " + maSach + ":");
        for (SachGiaoTrinh sach : SachGiaoTrinhList) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println(sach.toString());
                System.out.println("--------------------");
            }
        }
    }
    public void capNhatSachTheoMa(String maSach, int soLuongMoi){
        System.out.println("Cap nhat so luong sach voi ma sach " + maSach + ":");
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                sach.setSoLuong(soLuongMoi);
                System.out.println("Da cap nhat so luong sach:");
                System.out.println(sach.toString());
                System.out.println("--------------------");
            }
        }
    }
    public void capNhatSachTieuThuyetTheoMa(String maSach, int soLuongMoi){
        System.out.println("Cap nhat so luong sach tieu thuyet voi ma sach " + maSach + ":");
        for (SachTieuThuyet sach : SachTieuThuyetList) {
            if (sach.getMaSach().equals(maSach)) {
                sach.setSoLuong(soLuongMoi);
                System.out.println("Da cap nhat so luong sach tieu thuyet:");
                System.out.println(sach.toString());
                System.out.println("--------------------");
            }
        }
    }
    public void capNhatSachGiaoTrinhTheoMa(String maSach, int soLuongMoi){
        System.out.println("Cap nhat so luong sach giao trinh voi ma sach " + maSach + ":");
        for (SachGiaoTrinh sach : SachGiaoTrinhList) {
            if (sach.getMaSach().equals(maSach)) {
                sach.setSoLuong(soLuongMoi);
                System.out.println("Da cap nhat so luong sach giao trinh:");
                System.out.println(sach.toString());
                System.out.println("--------------------");
            }
        }
    }
    public void xoaSachTheoMa(String maSach){
        System.out.println("Xoa sach voi ma sach " + maSach + ":");
        danhSachSach.removeIf(sach -> sach.getMaSach().equals(maSach));
        System.out.println("Da xoa sach voi ma sach " + maSach);
    }
    public void xoaSachTieuThuyetTheoMa(String maSach){
        System.out.println("Xoa sach tieu thuyet voi ma sach " + maSach + ":");
        SachTieuThuyetList.removeIf(sach -> sach.getMaSach().equals(maSach));
        System.out.println("Da xoa sach tieu thuyet voi ma sach " + maSach);
    }
    public void xoaSachGiaoTrinhTheoMa(String maSach){
        System.out.println("Xoa sach giao trinh voi ma sach " + maSach + ":");
        SachGiaoTrinhList.removeIf(sach -> sach.getMaSach().equals(maSach));
        System.out.println("Da xoa sach giao trinh voi ma sach " + maSach);
    }
    public void HienThiDanhSachSach(){
        System.out.println("Danh sach sach:");
        for (Sach sach : danhSachSach) {
            System.out.println(sach.toString());
            System.out.println("--------------------");
        }
    }
    public void HienThiDanhSachSachTieuThuyet(){
        System.out.println("Danh sach sach tieu thuyet:");
        for (SachTieuThuyet sach : SachTieuThuyetList) {
            System.out.println(sach.toString());
            System.out.println("--------------------");
        }
    }
    public void HienThiDanhSachSachGiaoTrinh(){
        System.out.println("Danh sach sach giao trinh:");
        for (SachGiaoTrinh sach : SachGiaoTrinhList) {
            System.out.println(sach.toString());
            System.out.println("--------------------");
        }
    }
    public void hienThiDanhSachTatCaSach(){
        System.out.println("Danh sach tat ca cac loai sach:");
        System.out.println("----Sach chung----");
        HienThiDanhSachSach();
        System.out.println("----Sach tieu thuyet----");
        HienThiDanhSachSachTieuThuyet();
        System.out.println("----Sach giao trinh----");
        HienThiDanhSachSachGiaoTrinh();
    }
}*/
package Pack;
import java.util.ArrayList;
public class QuanLySach {
    private ArrayList<Sach> sachThuong;
    private ArrayList<SachTieuThuyet> sachTieuThuyet;
    private ArrayList<SachGiaoTrinh> sachGiaoTrinh;
    public QuanLySach() {
        this.sachThuong = new ArrayList<>();
        this.sachTieuThuyet = new ArrayList<>();
        this.sachGiaoTrinh = new ArrayList<>();
    }
    public void ThemSach(Sach sach) {
        sachThuong.add(sach);
    }
    public void ThemSachTieuThuyet(SachTieuThuyet sach) {
        sachTieuThuyet.add(sach);
    }
    public void ThemSachGiaoTrinh(SachGiaoTrinh sach) {
        sachGiaoTrinh.add(sach);
    }
    public void HienThiDanhSachSach() {
        System.out.println("Danh sach sach thuong:");
        for (Sach sach : sachThuong) {
            System.out.println(sach);
            System.out.println("--------------------");
        }
        System.out.println("Danh sach sach tieu thuyet:");
        for (SachTieuThuyet sach : sachTieuThuyet) {
            System.out.println(sach);
            System.out.println("--------------------");
        }
        System.out.println("Danh sach sach giao trinh:");
        for (SachGiaoTrinh sach : sachGiaoTrinh) {
            System.out.println(sach);
            System.out.println("--------------------");
        }
    }
    public void TimKiemSachTheoMa(String maSach) {
        System.out.println("Ket qua tim kiem sach voi ma sach " + maSach + ":");
        for (Sach sach : sachThuong) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println(sach);
                System.out.println("--------------------");
            }
        }
    }
    public void capNhatSachTheoMa(String maSach, int soLuongMoi) {
        System.out.println("Cap nhat so luong sach voi ma sach " + maSach + ":");
        for (Sach sach : sachThuong) {
            if (sach.getMaSach().equals(maSach)) {
                sach.setSoLuong(soLuongMoi);
                System.out.println("Da cap nhat so luong sach:");
                System.out.println(sach);
                System.out.println("--------------------");
            }
        }
    }
    void xoaSachTheoMa(String maSach) {
        System.out.println("Xoa sach voi ma sach " + maSach + ":");
        sachThuong.removeIf(sach -> sach.getMaSach().equals(maSach));
        System.out.println("Da xoa sach voi ma sach " + maSach);
    }
    void xoaSachTieuThuyetTheoMa(String maSach) {
        System.out.println("Xoa sach tieu thuyet voi ma sach " + maSach + ":");
        sachTieuThuyet.removeIf(sach -> sach.getMaSach().equals(maSach));
        System.out.println("Da xoa sach tieu thuyet voi ma sach " + maSach);
    }
    void xoaSachGiaoTrinhTheoMa(String maSach) {
        System.out.println("Xoa sach giao trinh voi ma sach " + maSach + ":");
        sachGiaoTrinh.removeIf(sach -> sach.getMaSach().equals(maSach));
        System.out.println("Da xoa sach giao trinh voi ma sach " + maSach);
    }
    void TimKiemSachTieuThuyetTheoMa(String maSach) {
        System.out.println("Ket qua tim kiem sach tieu thuyet voi ma sach " + maSach + ":");
        for (SachTieuThuyet sach : sachTieuThuyet) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println(sach);
                System.out.println("--------------------");
            }
        }
    }
    void TimKiemSachGiaoTrinhTheoMa(String maSach) {
        System.out.println("Ket qua tim kiem sach giao trinh voi ma sach " + maSach + ":");
        for (SachGiaoTrinh sach : sachGiaoTrinh) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println(sach);
                System.out.println("--------------------");
            }
        }
    }
    void capNhatSachTieuThuyetTheoMa(String maSach, int soLuongMoi) {
        System.out.println("Cap nhat so luong sach tieu thuyet voi ma sach " + maSach + ":");
        for (SachTieuThuyet sach : sachTieuThuyet) {
            if (sach.getMaSach().equals(maSach)) {
                sach.setSoLuong(soLuongMoi);
                System.out.println("Da cap nhat so luong sach tieu thuyet:");
                System.out.println(sach);
                System.out.println("--------------------");
            }
        }
    }
    void capNhatSachGiaoTrinhTheoMa(String maSach, int soLuongMoi) {
        System.out.println("Cap nhat so luong sach giao trinh voi ma sach " + maSach + ":");
        for (SachGiaoTrinh sach : sachGiaoTrinh) {
            if (sach.getMaSach().equals(maSach)) {
                sach.setSoLuong(soLuongMoi);
                System.out.println("Da cap nhat so luong sach giao trinh:");
                System.out.println(sach);
                System.out.println("--------------------");
            }
        }
    }
}