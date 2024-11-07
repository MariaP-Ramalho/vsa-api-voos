package br.com.dudadev.vsaapivoos.model;

public enum Priority {
    LOW,
    MEDIUM,
    HIGH;

    public static Priority fromNumber(int number) {
        if (number < 120) {
            return LOW;
        } else if (number > 120 && number < 180) {
            return MEDIUM;
        } else if (number > 180) {
            return HIGH;
        } else {
            throw new IllegalArgumentException("Número inválido para Status: " + number);
        }
    }
}
