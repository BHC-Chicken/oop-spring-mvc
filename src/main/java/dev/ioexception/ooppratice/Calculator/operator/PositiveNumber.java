package dev.ioexception.ooppratice.Calculator.operator;

public class PositiveNumber {
    private final int value;

    public PositiveNumber(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if (isNegativeNumber(value)) {
            throw new IllegalArgumentException("0또는 음수 전달 못함");
        }
    }

    private boolean isNegativeNumber(int value) {
        return value <= 0;
    }

    public int toInt() {
        return value;
    }
}
