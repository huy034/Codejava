package BTjava.Baitapthuchanhjava.List.Arraylist;

import java.util.ArrayList;

public class Sudungfor {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("JAVA");
        arr.add("PHP");
        arr.add("CB");
        arr.add("C++");
        System.out.println("Cac phan tu co trong ArrayList la:");
        for (int i = 0; i < arr.size(); i++ )
        {
            System.out.println(arr.get(i) + "\t");
        }
    }
}
