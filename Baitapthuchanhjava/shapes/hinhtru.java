package BTjava.Baitapthuchanhjava.shapes;

import java.util.Scanner;

public class hinhtru extends HinhTron{
    float chieucao;

    public void nhapchieucao(){
        System.out.println("Nhap vao h: ");
        Scanner sc = new Scanner(System.in);
        chieucao = sc.nextFloat();
    }

    public void tinhtheTich() {
        theTich = PI * BanKinh * BanKinh * chieucao;
        }
}
