package dev.ioexception.ooppratice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드 초기화")
    @Test
    void passwordTest() {
        User user = new User();

        user.initPassword(new CorrectFixedPasswordGenerator());

        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드 초기화되지 않는 경우")
    @Test
    void passwordTest2() {
        User user = new User();

        user.initPassword(new WrongFixedPasswordGenerator());

        assertThat(user.getPassword()).isNull();
    }
}