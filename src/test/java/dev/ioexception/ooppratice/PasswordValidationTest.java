package dev.ioexception.ooppratice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PasswordValidationTest {

    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다.")
    @Test
    void validationPasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("ㅁㄶㄶㅁㅇㅎㅁㅇㅁ오"))
                .doesNotThrowAnyException();
    }

    @DisplayName("예외 발생의 경우")
    @ParameterizedTest
    @ValueSource(strings = {"bbbbbbb", "bbbbbbbbbbbbbb"})
    void validatePasswordTest2(String password) {

        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Wrong");
    }
}
