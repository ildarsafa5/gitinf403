package ru.itis.inf403;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Gender gender;

    public Color color;

    public Person(String firstName, String middleName, String lastName, Gender gender, Color color) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.color = color;
    }

    public String toString() {
        return firstName + " " + middleName + " " + lastName + " " + gender + " " + color.rusName;
    }
}
