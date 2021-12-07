package hm6;

public class Animals {
    String name;
    int possibleDistanceRun;
    int possibleDistanceSwim;

    public Animals(String name, int possibleDistanceRun, int possibleDistanceSwim) {
        this.name = name;
        this.possibleDistanceRun = possibleDistanceRun;
        this.possibleDistanceSwim = possibleDistanceSwim;
    }

    public void run(int distance){
        if (this.possibleDistanceRun >= distance){
            System.out.printf("%s пробежал/а %d метров\n", this.name, distance);
        } else {
            System.out.printf("%s не может пробежать больше %d метров\n", this.name, this.possibleDistanceRun);
        }
    }

    public void swim(int distance){
        if (this.possibleDistanceSwim >= distance){
            System.out.printf("%s проплыл/а %d метров\n", this.name, distance);
        } else {
            System.out.printf("%s не может проплыть больше %d метров\n", this.name, this.possibleDistanceSwim);
        }
    }

}
