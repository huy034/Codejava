package BTjava.Baitapthuchanhjava;
import java.util.Scanner;
public class PTBAC2 {
    public static void main(String[] args) {
        double benta, a, b, c, X, X1, X2;
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nhap vao so thu nhat: ");
        a = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        b = sc.nextDouble();
        System.out.print("Nhap so thu ba: ");
        c = sc.nextDouble();

        benta = Math.pow(b,2) - 4*(a*c);
        X=-b/(2*a);
    
<<<<<<< HEAD
=======

>>>>>>> 30cc7d3f3169f5fc0d30f494cb4924ed7bb1a448
        if(benta < 0 ){
            System.out.print("Phuong tring vo nghiem");
        } else if(benta == 0) {
            System.out.print("Phuong trinh co nghiem kep: " + X);
        } else{
            X1= (-b + Math.sqrt(benta))/(2*a);
            X2= (-b - Math.sqrt(benta))/(2*a);
            System.out.println("phuong trinh co 2 nghiem :" + X1 + X2);
        }
        sc.close();
    }
    
}
