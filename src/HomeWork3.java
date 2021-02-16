import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yesOrNo;
        do {
            guessNumber();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            yesOrNo = scanner.nextInt();
        } while (yesOrNo == 1);
        do {
            guessWord();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            yesOrNo = scanner.nextInt();
        } while (yesOrNo == 1);
    }

    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        int answer = (int) (Math.random() * 10);
        int MaxTryCount = 3;
        System.out.println("Попробуйте угадать число. У вас есть 3 попытки");
        for (int tryCount = 0; tryCount <= MaxTryCount; tryCount++) {
            if (tryCount == MaxTryCount) {
                System.out.println("Вы проиграли. Правильный ответ: " + answer);
                break;
            }
            System.out.println("Введите число от 0 до 9");
            int userAnswer = scanner.nextInt();
            if (userAnswer == answer) {
                System.out.println("Поздравляю, вы угадали!");
                break;
            } else if (userAnswer > answer) {
                System.out.println("Вы ввели слишком большое число, попробуйте еще раз");
            } else if (userAnswer < answer) {
                System.out.println("Вы ввели слишком маленькое число, попробуйте еще раз");
            }
        }
    }

    public static void guessWord() {
        Scanner scanner = new Scanner(System.in);
        char[] answerArray = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        System.out.println("Попробуйте угадать слово");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String answer = words[(int) (Math.random() * (words.length - 1))];
        for (int i = 0; i <= answer.length(); i++) {
            String userAnswer = scanner.next();
            if (i == answer.length()) {
                System.out.println("Вы проиграли. Правильный ответ: " + answer);
                break;
            }
            if (userAnswer.equals(answer)) {
                System.out.println("Поздравляю, вы угадали слово!");
                break;
            } else {
                char a = answer.charAt(i);
                answerArray[i] = a;
                System.out.println(answerArray);
            }

        }
    }
}
