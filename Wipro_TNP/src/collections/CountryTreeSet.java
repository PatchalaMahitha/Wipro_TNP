package collections;

import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> H1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {

        H1.add(countryName);

        return H1;

    }

    public String getCountry(String countryName) {

        for (String country : H1) {

            if (country.equalsIgnoreCase(countryName)) {

                return country;

            }

        }

        return null;

    }

}