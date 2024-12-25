package ru.itis.inf403;

public enum Color {
    Black("Чёрный"),
    White("Белый"),
    Yellow("Жёлтый");

    public String rusName;

    private Color (String rusname) {
        this.rusName = rusname;
    }
}
