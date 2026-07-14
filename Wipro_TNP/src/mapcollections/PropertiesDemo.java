package mapcollections;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Tamil Nadu", "Chennai");
        p.put("Karnataka", "Bengaluru");

        Set<Object> keys = p.keySet();

        Iterator<Object> itr = keys.iterator();

        while (itr.hasNext()) {

            Object key = itr.next();

            System.out.println(key + " -> " + p.get(key));

        }

    }

}