package mapcollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Mahitha");
        map.put(102, "Rahul");
        map.put(103, "Kiran");
        map.put(104, "Sneha");

        System.out.println("HashMap");

        System.out.println(map);

        System.out.println();

        System.out.println("Key Exists : " + map.containsKey(102));

        System.out.println("Value Exists : " + map.containsValue("Kiran"));

        System.out.println();

        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<Integer, String> entry = itr.next();

            System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }

}