package BTjava.Baitapthuchanhjava.src;

import java.util.Scanner;

public class slide90 {
    public static void main(String[] args) {
  String chuoi;
  char kyTu;
  Scanner scanner = new Scanner(System.in);
  System.out.println("Nhap vào chuoi bat ky: ");
  chuoi = scanner.nextLine();
  System.out.println("Cac ky tu co trong chuoi là: ");
    for (int i = 0; i < chuoi.length(); i++) {
        kyTu = chuoi.charAt(i);
        System.out.println(kyTu);
    }
}

}
