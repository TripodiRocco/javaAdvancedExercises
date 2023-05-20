package javaadvanced._10;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString(){
        String infoPerson = "Hi! Nice to meet you, here " + this.name + " I'm " + this.age + " year's old, contact me: " + this.address;
        return infoPerson;
    }

    @Override
    public int hashCode() {
        return (this.name + this.age + this.address).hashCode();
    }
}
