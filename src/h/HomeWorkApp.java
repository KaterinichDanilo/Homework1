package h;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign(-4, 2);

        printColor(10);

        compareNumbers(2, 4);
    }

    public static void printThreeWords(){

        System.out.println("Orange\nBanana\nApple");

    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0){
            System.out.println("Сума положительная");
        } else System.out.println("Сумма отрицательная");
    }

    public static void printColor(int value) {

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("“Желтый”");
        } else System.out.println("Зеленый");

    }

    public static void compareNumbers(int a, int b){

        if (a >= b){
            System.out.println("a >= b");
        } else System.out.println("a < b");

    }
}
