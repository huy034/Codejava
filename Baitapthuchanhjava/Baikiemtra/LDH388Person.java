import java.util.Scanner;

public class LDH388Person {
    String ten;
    int tuoi;
    float ngaysinh;

    public void nhap (){
    Scanner sc = new Scanner(System.in);
  System.out.println("nhap thong tin ");
    ten = sc.nextLine();
    tuoi = sc.nextInt();
    ngaysinh = sc.nextFloat();
    }

    public void xuatthongtin (){
        System.out.println("Ten la " + ten);
        System.out.println("Tuoi la " + tuoi);
        System.out.println("ngay sinh la " + ngaysinh);
    }
    }

