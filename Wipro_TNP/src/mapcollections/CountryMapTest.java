package mapcollections;

public class CountryMapTest {

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("Australia", "Canberra");

        System.out.println("Country-Capital Map");
        System.out.println(obj.M1);

        System.out.println();

        System.out.println("Capital of India : " + obj.getCapital("India"));

        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println();

        System.out.println("Reverse Map");

        System.out.println(obj.swapKeyValue());

        System.out.println();

        System.out.println("Country List");

        System.out.println(obj.toArrayList());

    }

}