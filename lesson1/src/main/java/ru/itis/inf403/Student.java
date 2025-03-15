package ru.itis.inf403;

public class Student extends Person {
    private String groupName;
    private int rating;

    public Student() {
    }

    public Student(String groupName,int rating , String middleName, String lastName, String firstName, int age) {
        this.groupName = groupName;
        this.age = age;
        this.rating = rating;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public int getRating() {
        return rating;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String toString() {
        return firstName + " " + middleName + " " + lastName + " " + age + " " + rating + " " + groupName;
    }
}
