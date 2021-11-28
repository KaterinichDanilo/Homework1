package hm4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    final static int SIZE = 3;
    final static int DOTS_TO_WIN = 3;

    final static char DOT_X = 'X';
    final static char DOT_O = 'O';
    final static char DOT_EMPTY = '.';

    static char [][] map;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (checkWin(DOT_X)){
                System.out.println("Вы выиграли!");
                break;
            }
            if (isFull()){
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)){
                System.out.println("Вы проиграли!");
                break;
            }
            if (isFull()){
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap(){
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    public static void humanTurn(){
        int x, y;
        do {
            System.out.println("input x, y: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while(!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x){
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE){
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn(){

        if (aiBlockHuman(DOT_O)[0] != -1){
            map[aiBlockHuman(DOT_O)[0]][aiBlockHuman(DOT_O)[1]] = DOT_O;
        } else if (aiBlockHuman(DOT_X)[0] != -1){
            map[aiBlockHuman(DOT_X)[0]][aiBlockHuman(DOT_X)[1]] = DOT_O;
        } else {
            int x, y;
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(y, x));
            map[y][x] = DOT_O;
        }

    }

    public static boolean isFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char c){
        int counter1, counter2, counter3 = 0;
        int counter4 = 0;
        for (int i = 0; i < SIZE; i++) {
            counter1 = 0;
            counter2 = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == c){
                    counter1++;
                }
                if (map[j][i] == c){
                    counter2++;
                }
                if (i == j){
                    if (map[i][j] == c){
                        counter3++;
                    }
                    if (map[i][SIZE - j - 1] == c){
                        counter4++;
                    }
                }
            }
            if (counter1 >= DOTS_TO_WIN || counter2 >= DOTS_TO_WIN){
                return true;
            }
        }

        if (counter3 >= DOTS_TO_WIN || counter4 >= DOTS_TO_WIN){
            return true;
        }

        return false;
    }

    public static int [] aiBlockHuman(char c){
        int [] counter = {0, 0, 0, 0};
        int [][] koef = {{0, 1}, {1, 0}, {1, 1}, {1, -1}};
        int m;
        int [] cords = {-1, -1};

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == c){
                    for (int k = 1; k < DOTS_TO_WIN; k++) {

                        if (j + k < SIZE){
                            if (map[i][j + k] == c){
                                counter[0]++;
                            }
                        }

                        if (i + k < SIZE){
                            if (map[i + k][j] == c){
                                counter[1]++;
                            }
                        }

                        if (i + k < SIZE && j + k < SIZE){
                            if (map[i + k][j + k] == c){
                                counter[2]++;
                            }
                        }

                        if (i + k < SIZE && j - k >= 0){
                            if (map[i + k][j - k] == c){
                                counter[3]++;
                            }
                        }
                    }
                    m = Arrays.asList(counter).indexOf(DOTS_TO_WIN - 2);
                    if (m != -1){
                        System.out.println(i + " " + j);
                        if (i + (DOTS_TO_WIN - 1) * koef[m][0] >= 0 && i + (DOTS_TO_WIN - 1)*koef[m][0] < SIZE && j + DOTS_TO_WIN * koef[m][1] >= 0 && j + DOTS_TO_WIN*koef[m][1] < SIZE){
                            if (map[i + DOTS_TO_WIN * koef[m][0]][j + DOTS_TO_WIN * koef[m][1]] == DOT_EMPTY){
                                cords[0] = i + DOTS_TO_WIN * koef[m][0];
                                cords[1] = j + DOTS_TO_WIN * koef[m][1];
                                return cords;
                            }
                        }
                    }
                }
            }
        }
        return cords;
    }


}
