package de.supernerd;

public class Person {

    private String name;
    private int age;
    private String gender;
    private String eyeColor;

    public Person(String name, int age, String gender, String eyeColor) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.eyeColor = eyeColor;
    }

    public void vorstellen() {
        System.out.println(String.format("Hallo, ich bin %s und %d Jahre jung. Meine Augenfarbe ist %s", this.name, this.age, this.eyeColor));
    }
}
