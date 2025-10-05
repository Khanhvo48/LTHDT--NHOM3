import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập mã sách: ");
            String ma = sc.nextLine();

            System.out.print("Nhập tiêu đề: ");
            String td = sc.nextLine();

            System.out.print("Nhập tác giả: ");
            String tg = sc.nextLine();

            System.out.print("Nhập năm xuất bản: ");
            int nam = sc.nextInt();

            System.out.print("Nhập số lượng: ");
            int sl = sc.nextInt();

            Sach sach1 = new Sach(ma, td, tg, nam, sl);

            sach1.hienThiThongTin();

        }
    }
}
