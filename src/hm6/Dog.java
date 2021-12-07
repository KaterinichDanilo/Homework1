package hm6;

public class Dog extends Animals{
    static int numberDogs = 0;

    public Dog(String name, int possibleDistanceRun, int possibleDistanceSwim) {
        super(name, possibleDistanceRun, possibleDistanceSwim);
        numberDogs++;
    }
}
