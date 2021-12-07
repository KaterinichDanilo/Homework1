package hm7;

public class Cat {
    private String name;
    private int appetite;
    boolean wellFed = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate){
        wellFed = plate.getFood() >= appetite;
        if (plate.getFood() >= appetite){
            plate.decreaseFood(appetite);
            System.out.println("Cat " + name + " eat...");
        } else {
            System.out.println("Cat " + name + " has nothing to eat");
        }
    }
}
