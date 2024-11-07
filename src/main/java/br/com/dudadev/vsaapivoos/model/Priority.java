package br.com.dudadev.vsaapivoos.model;

public enum Priority {
    Baixa("Baixa"),
    Media("Média"),
    Alta("Alta");

    private String categoryName;

    private Priority(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public static Priority fromNumber(int number) {
        if (number < 120) {
            return Baixa;
        } else if (number > 120 && number < 180) {
            return Media;
        } else if (number > 180) {
            return Alta;
        } else {
            throw new IllegalArgumentException("Número inválido para Status: " + number);
        }
    }
}
