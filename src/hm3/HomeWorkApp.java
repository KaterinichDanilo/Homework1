package hm3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        int[] a = {8, 7, 4, 1};
        //System.out.println(Arrays.toString(replace0And1(a)));

        int[] b = {8, 7, 4, 1};
        //System.out.println(getMax(b));

        int[][] d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //printMatrix(diagonals1(d));

        int[] c = {1, 2, 3, 4, 5, 6};
        //System.out.println(Arrays.toString(cyclicShift(c, -2)));
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
//1
    public static int [] replace0And1(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        return array;
    }
//2
    public static int [] fillArray() {
        int array [] = new int [100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
//3
    public static int [] multiTwo() {
        int array [] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }
//4
    public static int [][] diagonals1(int [][] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i == j) {
                    array[i][j] = 1;
                    array[i][array[i].length - j - 1] = 1;
                }
            }
        }
        return array;
    }
//5
    public static int [] initialArray(int len, int initialValue) {
        int array [] = new int[len];
        for (int i = 0; i < len; i++){
            array[i] = initialValue;
        }
        return array;
    }
//6
    public static int getMin(int [] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int getMax(int [] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
//7
    public static boolean sevenEx(int [] array){
        int point = 1;
        int sumLeft, sumRight;
        for (int i = 1; i < array.length; i++){
            sumLeft = 0;
            sumRight = 0;
            for (int j = 0; j < point; j++) {
                sumLeft += array[j];
            }

            for (int j = point; j < array.length; j++) {
                sumRight += array[j];
            }

            if (sumLeft == sumRight){
                return true;
            }
            point++;
        }

        return false;
    }

    public static int [] cyclicShift(int [] array, int n){
        int m = 0;
        int k = 0;
        int a0;

        while (n < 0){
            n += array.length;
        }

        for (int a = 0; a < n; a++) {
            a0 = array[array.length - 1];
            k = array[0];
            for (int i = 1; i < array.length; i++) {
                if (i != array.length - 1){
                    m = array[i];
                    array[i] = k;
                    k = m;
                } else {
                    array[0] = a0;
                    a0 = array[array.length - 1];
                    m = array[i];
                    array[i] = k;
                    k = m;
                }
            }
        }

        return array;
    }
}
