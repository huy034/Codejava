package BTjava.Baitapthuchanhjava.src;

import java.io.IOException;

public class TestThrow11 {
    void m() throws IOException {
        throw new IOException("Loi thiet bi");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly");
        }
    }
    public static void main(String[] args) {
        TestThrow11 obj = new TestThrow11();
        obj.p();
        System.out.println("luong binh thuong...");
    }
}
