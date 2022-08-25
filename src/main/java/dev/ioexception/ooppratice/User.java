package dev.ioexception.ooppratice;

public class User {
    private String password;

    public void initPassword() {
        RandomPasswordGenerator generator = new RandomPasswordGenerator();
        String randomPassword = generator.generatePassword();

        if (randomPassword.length() >= 8 && randomPassword.length() <= 12) {
            this.password = randomPassword;
        }
    }

    public String getPassword() {
        return password;
    }
}
