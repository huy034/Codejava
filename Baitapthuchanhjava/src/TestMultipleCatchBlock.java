package BTjava.Baitapthuchanhjava.src;

public class TestMultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
        } catch (ArithmeticException e) {
            System.out.println("task 1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 is completed");
        } catch (Exception e) {
            System.out.println("common task completed");
    }
    System.out.println("rest of the code...");
}
}