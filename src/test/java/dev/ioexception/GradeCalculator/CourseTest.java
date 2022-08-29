package dev.ioexception.GradeCalculator;

import dev.ioexception.ooppratice.GradeCalculator.Course;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest {

    @DisplayName("과목 생성")
    @Test
    void createTest() {
        assertThatCode(() -> new Course("OOP", 3 , "A+"))
                .doesNotThrowAnyException();
    }
}
