package BTjava.Baitapthuchanhjava.shapes;

import java.util.Scanner;


public class hinhhoc {
    
        String ten;
        float ChuVi;
        float DienTich;
        float theTich;
        final float PI = 3.14f;

        public void nhapten() {
        System.out.println("Nhap vao ten: ");
        Scanner sc = new Scanner(System.in);
        ten = sc.next();
        
        }
        
        public void inChuVI() {
        System.out.println("ChuVi bang = " + ChuVi);
        }

        public void inDienTich() {
        System.out.println("DienTich bang = " + DienTich);
        }

        public void intheTich() {
        System.out.println("theTich bang = " + theTich);
        }
}
