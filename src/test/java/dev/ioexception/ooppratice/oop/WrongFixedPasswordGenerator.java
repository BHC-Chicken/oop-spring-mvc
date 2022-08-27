package dev.ioexception.ooppratice.oop;

import dev.ioexception.ooppratice.oop.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "aa";
    }
}
