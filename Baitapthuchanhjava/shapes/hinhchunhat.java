package BTjava.Baitapthuchanhjava.shapes;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc{
    float dai;
    float rong;


    public void nhapChieuDai(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = sc.nextFloat();
    }

    public void nhapChieuRong(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextFloat();
    }

    public void tinhChuVi(){
        ChuVi = 2*(dai +rong);
    }

    public void tinhDienTich(){
        DienTich = dai * rong;
    }

}