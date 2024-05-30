package BTjava.Baitapthuchanhjava.Map;

import java.util.Set;
import java.util.LinkedHashMap;

public class LinkedHashMapExamp1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "PHO");
        map.put(4, "Python");
        System.out.println("Before remove: ");
        show(map);
        map.remove(2);
        System.out.println("After remove: ");
        show(map);
    }
    public static void show(LinkedHashMap<Integer, String> map)
    {
        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet)
        {
            System.out.println(key +" " + map.get(key));
        }
    }
}
