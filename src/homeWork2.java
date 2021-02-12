import static java.lang.Math.random;
public class homeWork2<isTrue, randomArray> {
    public static void main(String[] args) {
        /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        С помощью цикла и условия заменить 0 на 1, 1 на 0; */
        int[] binary = new int[10];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = (int) Math.round(random()); // генерирую цифры от 0 до 1 с помощью округления
            System.out.print(binary[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 0) {
                binary[i] = 1;
            } else {
                if (binary[i] == 1) {
                    binary[i] = 0;
                }
            }
            System.out.print(binary[i] + " ");
        }
        System.out.println("");
        /* 2. Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21; */
        int[] plusThree = new int[8];
        System.out.print(plusThree[0] + " "); // в цикле мы пропускаем это значение так что выводим его сразу
        for (int i = 1; i < plusThree.length; i++) {
            plusThree[i] = plusThree[i - 1] + 3;
            System.out.print(plusThree[i] + " ");
        }
        System.out.println("");
        /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2; */
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами; */

        int[][] table = new int[10][10];
        int reverse = table.length - 1; //переменная отвечающая за вторую диагональ
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == j || reverse == j) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            reverse--; // отнимаем тк перешли на новую строчку
            System.out.println(" ");
        }
        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) { //заполняю массив рандомными числами
            randomArray[i] = (int) (random() * 100);
            System.out.print(randomArray[i] + " ");
        }
        int max = 0;
        int min = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > max) {
                max = randomArray[i];
            }
            if (randomArray[i] < min) {
                min = randomArray[i];
            }
        }
        System.out.println("Максимальное число " + max + " Минимальное число " + min);

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны
        boolean res = myMethod(randomArray);
        System.out.println(res);
    }

    public static boolean myMethod(int[] arr) {
        int sum = 0;
        int second = 0; // в конце будет сумма чисел но с конца
        for (int i = 0; i < arr.length; i++) {  //сначала считаем сумму всех чисел
            sum += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            if(second == sum){
                return true;
            } else { // вычитаем последнее число из суммы и прибавляем его ко второй переменной
                sum -= arr[arr.length - i];
                second += arr[arr.length - i];
            }
        }
        return false;
    }
}
