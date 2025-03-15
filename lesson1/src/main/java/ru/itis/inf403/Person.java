package ru.itis.inf403;

public class Person {
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected int age;

    public Person() {
    }

    public Person(String firstName, String middleName, int age, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age;
    }

}
