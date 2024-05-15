package BTjava.Baitapthuchanhjava.src;

import java.util.ArrayList;

public class slide21C4 {
    public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<String>(3);
    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("Orange");
    colors.add("Pink");

    System.out.println(colors.get(1));
    System.out.println(colors.contains("Orange"));
    System.out.println(colors.size());
    System.out.println(colors);
}
}