package dev.ioexception.ooppratice.oop;

import dev.ioexception.ooppratice.oop.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "aaaaaaaa";
    }
}
