package BTjava.Baitapthuchanhjava.employee;

import java.util.Scanner;

public class person1 {
    public String Ten;
    public String NgaySinh;
    public String DiaChi;

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap  TEN:");
        Ten = sc.nextLine();
        System.out.print("Nhap  NGAY SINH:");
        NgaySinh = sc.nextLine();
        System.out.print("Nhap DIA CHI:");
        DiaChi = sc.nextLine();
        sc.close();
    }

    public void InThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nTen :" + Ten);
        System.out.print("\nNgay Sinh :" + NgaySinh);
        System.out.print("\nDia chi :" + DiaChi);
        sc.close();
    }

}
