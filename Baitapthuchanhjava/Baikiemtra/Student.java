import java.util.Scanner;

public class Student extends LDH388Person{
    int sdt;
    String email;
@Override
public void nhap (){
Scanner sc = new Scanner(System.in);
sdt = sc.nextInt();
email = sc.nextLine();
}

@Override
public void xuatthongtin (){
System.out.println("sdt la " + sdt);
System.out.println("email la " + email);
}
}
