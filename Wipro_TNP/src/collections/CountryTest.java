package collections;

public class CountryTest {

    public static void main(String[] args) {

        Country obj = new Country();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println("Countries:");
        System.out.println(obj.H1);

        System.out.println();

        System.out.println("Searching Country:");

        System.out.println(obj.getCountry("India"));

        System.out.println(obj.getCountry("China"));
    }
}