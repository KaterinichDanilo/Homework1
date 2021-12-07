package hm7;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void scare(Cat cat){
        System.out.println("Dog " + name + "scare cat " + cat.getName());
    }
}
