import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // все значения из методов
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите год");
        int year = scanner.nextInt();
        System.out.println("Введите числа");
        int number = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // проверка методов
        // return не выводит в консоль? так что через sout
        System.out.println(sum(a, b, c, d));
        System.out.println(isSumOk(a, b));
        isNumber(number);
        System.out.println(isNumberTrue(number));
        sayHello(name);
        isYear(year);

        // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte byteVar = 7;
        short shortVar = 100;
        int intVar = 150;
        long longVar = 10000000L;
        float floatVar = 3.14f;
        double doubleVar = 3.230;
        boolean booVar = true;
        char charVar = 'e';
    }

    /* 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float. */
    public static float sum(float a, float b, float c, float d) {
        float z = a * (b + (c / d));
        return z;
    }

    /* 4. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
     */
    public static boolean isSumOk(int a, int b) {
        int sum = a + b;
        if (sum >= 10) {
            if (sum <= 20) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    /* 5. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */
    public static void isNumber(int number) {
        if(number >= 0) {
            System.out.println("Число " + number + " положительное");
        } else {
            System.out.println("Число " + number + " отрицательное");
        }
    }
    /* 6. Написать метод, которому в качестве параметра передается целое число.
     Метод должен вернуть true, если число отрицательное, и вернуть false если положительное. */
    public static boolean isNumberTrue(int number) {
        if(number >= 0) {
            return true;
        } else {
            return false;
        }
    }
    /* 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!». */
    public static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }
    /* 8. * Написать метод, который определяет, является ли год високосным,
     и выводит сообщение в консоль. Каждый 4-й год является високосным,
     кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static void isYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year +" год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
}
