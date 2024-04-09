package BTjava.Baitapthuchanhjava.shapes;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat{
    float canh;

    public void nhapcanh(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap canh: ");
        canh = sc.nextFloat();
    }

    public void tinhChuVi(){
        ChuVi = 4*canh;
    }

    public void tinhDienTich(){
        DienTich = canh * canh;
    }
}
