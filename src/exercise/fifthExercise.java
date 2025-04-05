package exercise;

import java.util.Scanner;

public class fifthExercise {
    static double result;
    public static void calculator(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа через пробел и один из операторов +,-,/,* : ");
        String[] digitsArray = in.nextLine().split(" ");
        int firstVar = Integer.parseInt(digitsArray[0]);
        int secondVar = Integer.parseInt(digitsArray[1]);
        String sign = digitsArray[2];

        switch (sign) {
            case "+":
                result = firstVar + secondVar;
                break;
            case "-":
                result = firstVar - secondVar;
                break;
            case "/":
                result = (double) firstVar / secondVar;
                break;
            case "*":
                result = firstVar * secondVar;
                break;
            default:
                System.out.println("Не обнаружен знак, повторите попытку!");
                break;
        }
        System.out.println("Результат вычисления равен: " + result);
    }
}
