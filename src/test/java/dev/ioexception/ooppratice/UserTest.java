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

        user.initPassword();

        assertThat(user.getPassword()).isNotNull();
    }
}