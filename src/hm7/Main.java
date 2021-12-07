package hm7;

public class Main {
    public static void main(String[] args) {
        Plate plate1 = new Plate(50);
        Cat [] catsArray = {new Cat("C1", 10), new Cat("C2", 30), new Cat("C3", 40)};

        for (Cat cat:catsArray) {
            cat.eat(plate1);
        }

        for (Cat cat:catsArray) {
            if (cat.wellFed){
                System.out.println("Cat " + cat.getName() + " is wellFed");
            } else {
                System.out.println("Cat " + cat.getName() + " is hungry");
            }
        }

        plate1.addFood(200);
        System.out.println(plate1.getFood());
    }
}
