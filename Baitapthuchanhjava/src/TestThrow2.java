package BTjava.Baitapthuchanhjava.src;

public class TestThrow2 {
    static void validate(int age){
        try {
            if (age < 18)
          throw new ArithmeticException("not valid");
        else
        System.out.println("welcom");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
