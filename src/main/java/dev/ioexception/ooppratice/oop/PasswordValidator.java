package dev.ioexception.ooppratice.oop;

public class PasswordValidator {

    private static final String ERROR_MESSAGE = "Wrong";
    public static void validate(String password) {
        int length = password.length();
        if (length < 8 || length > 12) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }
}
