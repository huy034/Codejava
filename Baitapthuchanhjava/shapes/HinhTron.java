package BTjava.Baitapthuchanhjava.shapes;

import java.util.Scanner;


public class HinhTron extends hinhhoc{
    
        float BanKinh;

        public void nhapBanKinh() {
        System.out.println("Nhap vao R: ");
        Scanner sc = new Scanner(System.in);
        BanKinh = sc.nextFloat();
        
        }
        
        public void tinhChuVI() {
        ChuVi = 2 * PI * BanKinh;
        }

        public void tinhDienTich() {
        DienTich = PI * BanKinh *BanKinh;
        }

}