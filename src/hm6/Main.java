package hm6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("C1", 200, 0);
        Dog dog1 = new Dog("D1", 500, 10);

        cat1.run(201);
        cat1.swim(10);

        dog1.run(100);
        dog1.swim(10);

        System.out.println(Dog.numberDogs);
    }
}
