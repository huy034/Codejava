package BTjava.Baitapthuchanhjava.src;

import java.util.Scanner;

public class PTBAC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double A, B, X;
        System.out.print("A = ");
        A = sc.nextDouble();
        System.out.print("B = ");
        B = sc.nextDouble();
        if (A==0){
            System.out.println("Pt vo nghiem");
        }
        else {
            X = -B/A;
            System.out.println("Pt co nghiem:" +X);
        }
    }
}
