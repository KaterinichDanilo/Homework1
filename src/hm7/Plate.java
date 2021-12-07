package hm7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount){
        if (food >= amount) {
            food -= amount;
        }
    }

    public void addFood(int addFood){
        food += addFood;
    }
}
