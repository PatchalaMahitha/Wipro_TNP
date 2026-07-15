package methodreference;

public class TestPrime {

    public static void main(String[] args) {

        PrimeCheck pc = Prime::new;

        pc.check(29);
        pc.check(35);
    }
}