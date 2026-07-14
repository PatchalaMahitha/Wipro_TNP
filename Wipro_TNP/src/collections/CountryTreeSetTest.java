package collections;

public class CountryTreeSetTest {

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Canada");
        obj.saveCountryNames("Japan");

        System.out.println("Countries:");

        System.out.println(obj.H1);

        System.out.println();

        System.out.println(obj.getCountry("Canada"));

        System.out.println(obj.getCountry("China"));

    }

}