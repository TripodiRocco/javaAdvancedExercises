package javaadvanced._11;

public record Person(String name, int age, String address) {

    public String toString(){
        String stringa = "My name is: " + name + "\n" + "I'm: " + age + " years old " + "\n" + "Write me, please: " + address;
        return stringa;
    }
}
