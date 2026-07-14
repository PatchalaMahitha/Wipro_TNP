package mapcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    // Add Country and Capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {

        M1.put(countryName, capital);
        return M1;
    }

    // Get Capital from Country
    public String getCapital(String countryName) {

        return M1.get(countryName);
    }

    // Get Country from Capital
    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equalsIgnoreCase(capitalName)) {

                return entry.getKey();

            }

        }

        return null;
    }

    // Create reverse map
    public HashMap<String, String> swapKeyValue() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            M2.put(entry.getValue(), entry.getKey());

        }

        return M2;
    }

    // Return Country List
    public ArrayList<String> toArrayList() {

        return new ArrayList<>(M1.keySet());

    }

}