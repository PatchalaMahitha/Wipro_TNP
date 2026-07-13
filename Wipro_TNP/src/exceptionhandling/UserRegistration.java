package exceptionhandling;

public class UserRegistration {

    public void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {

        UserRegistration user = new UserRegistration();

        try {

            String username = args[0];
            String country = args[1];

            user.registerUser(username, country);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Please provide Username and Country.");

        } catch (InvalidCountryException e) {

            System.out.println(e.getMessage());

        }
    }
}