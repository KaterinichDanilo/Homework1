package hm2;

public class HomeWorkApp {
    public static void main(String[] args) {

        System.out.println(checkNumberSum(4, 18));
        writePosOrNeg(-5);
        System.out.println(ifNumNeg(4));
        writeLine("Line", 3);
        System.out.println(ifYearVis(1600));
    }
    public static boolean checkNumberSum(int number1, int number2) {

        if (number1 + number2 >= 10 && number1 + number2 <= 20) return true;

        return false;
    }

    public static void writePosOrNeg(int number) {
        if (number >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    public static boolean ifNumNeg(int number) {
        return number < 0;
    }

    public static void writeLine(String line, int k) {
        for (int i = 0; i < k; i++) {
            System.out.println(line);
        }
    }

    public static boolean ifYearVis(int year) {
        if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
            return true;
        }
        return false;
    }
}
