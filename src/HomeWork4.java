import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    private static char[][] map;
    public static final int SIZE = 3;
    private static final char X = 'X';
    private static final char O = '0';
    private static final char DEFAULT = '_';
    private static final char DELIMETER = '|';


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DEFAULT;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(DELIMETER + "" + map[i][j]);
            }
            System.out.println(DELIMETER);
        }
    }

    public static void userMove() {
        Scanner sc = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!inputCheck(x, y));
        map[x][y] = X;
    }

    public static Random rand = new Random();

    public static void pcMove() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!inputCheck(x, y));
        map[x][y] = O;
    }

    public static boolean inputCheck(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) return false;
        if (map[x][y] == DEFAULT) return true;
        return false;
    }

    public static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    if (map[i][j] == map[i][0] && map[i][j] == map[i][1] && map[i][j] == map[i][2]) return true;
                    if (map[i][j] == map[0][j] && map[i][j] == map[1][j] && map[i][j] == map[2][j]) return true;
                    if (map[i][j] == map[0][0] && map[i][j] == map[1][1] && map[i][j] == map[2][2]) return true;
                    if (map[i][j] == map[1][1] && map[i][j] == map[0][2] && map[i][j] == map[2][0]) return true;
                }
            }
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DEFAULT) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            userMove();
            printMap();
            if (checkWin(X) == true) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull() == true) {
                System.out.println("Ничья");
                break;
            }
            System.out.println("Ход компьютера");
            pcMove();
            printMap();
            if (checkWin(O) == true) {
                System.out.println("Компьютер победил");
                break;
            }
            if (isMapFull() == true) {
                System.out.println("Ничья");
                break;
            }
        }
    }
}
