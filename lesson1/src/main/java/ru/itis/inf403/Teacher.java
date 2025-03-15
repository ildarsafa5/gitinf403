package ru.itis.inf403;

public class Teacher extends Person {
    private Person person;
    private String[] disciplines;

    public Teacher(String firstName, String middleName, int age, String lastName) {
        super(lastName, firstName, age, middleName);
    }
    public Person getPerson() {
        return person;
    }

    public String[] getDisciplines() {
        return disciplines;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setDisciplines(String[] disciplines) {
        this.disciplines = disciplines;
    }
    public String toString() {
        return "Mr.Prof " + lastName + " " + firstName + " " + middleName + ", " + age;
    }
}
