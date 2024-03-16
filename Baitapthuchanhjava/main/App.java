package BTjava.Baitapthuchanhjava.main;

import BTjava.Baitapthuchanhjava.shapes.HinhTron;
import BTjava.Baitapthuchanhjava.shapes.hinhchunhat;
  
    public class App {
        public static void main(String[] args) {
            HinhTron ht = new HinhTron();
            hinhchunhat hcn = new hinhchunhat();
    
            System.out.println("Nhap thong tin hinh tron: ");
            ht.nhapBanKinh();
            ht.tinhChuVI();
            ht.tinhDienTich();
            ht.inChuVI();
            ht.inDienTich();
    
            System.out.println("\n");
    
            System.out.println("Nhap thong tin hinh chu nhat:");
            hcn.nhapChieuDai();
            hcn.nhapChieuRong();
            hcn.tinhChuVi();
            hcn.tinhDienTich();
            hcn.incv();
            hcn.indt();
        }
    }
