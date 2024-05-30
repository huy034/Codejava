package BTjava.Baitapthuchanhjava.src;

public class TestThrow1 {
    static void validate(int age){
        if (age < 18)
          throw new ArithmeticException("not valid");
        else
        System.out.println("welcom");
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
