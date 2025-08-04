package sprint3;

public class Constants {
    static final int MY_CONST = 1;
    static final int MIN_PASSWORD_LENGTH = 8;
    static final int PHONE_LENGTH = 11;
    public void example() {
        System.out.println(MY_CONST);
    }

    public void validateCredentials(String phone, String password) {
        if (phone.length() != PHONE_LENGTH) {
            System.out.println("Invalid phone number");
        }
        if (password.length() != MIN_PASSWORD_LENGTH) {
            System.out.println("Invalid password");
        }
    }
}
