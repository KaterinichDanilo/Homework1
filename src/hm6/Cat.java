package hm6;

public class Cat extends Animals{
    static int numberCats = 0;

    public Cat(String name, int possibleDistanceRun, int possibleDistanceSwim) {
        super(name, possibleDistanceRun, possibleDistanceSwim);
        numberCats++;
    }
}
