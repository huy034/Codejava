package BTjava.Baitapthuchanhjava.employee;

import java.util.Scanner;

public class employee extends person1 {
    public String MaNhanVien;
    public int NgayBD;
    public int NgayKT;
    public float Luong;
    public float ThuNhap;
    public int SoNgayCong;
    Scanner sc = new Scanner(System.in);

    public void NhapThongTin(String MaNhanVien) {
        super.NhapThongTin();

    }

    public int NhapNgayBD() {
        System.out.println("Nhap Nhap Ngay Bat dau lam :");
        do
            NgayBD = sc.nextInt();
        while (NgayBD < 0 && NgayBD > 31);
        return NgayBD;

    }

    public int NhapNgayKT() {
        System.out.println("Nhap Nhap Ngay Ket thuc lam :");
        do
        NgayKT = sc.nextInt();
        while (NgayKT < 0 && NgayKT > 31);
        return NgayKT;
    }

    public int NgayCong() {
        if (NgayBD > NgayKT) {
            SoNgayCong = NgayKT + (31 - NgayBD);
        } else if (NgayBD < NgayKT) {
            SoNgayCong = NgayKT - NgayBD;
        } else
            SoNgayCong = NgayBD;
        return SoNgayCong;
    }

}
