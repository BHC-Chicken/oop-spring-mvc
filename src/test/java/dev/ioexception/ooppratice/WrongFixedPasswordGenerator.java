package dev.ioexception.ooppratice;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "aa";
    }
}
