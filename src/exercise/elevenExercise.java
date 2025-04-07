package exercise;

import java.util.Scanner;

public class elevenExercise {
    public static void updateTypes(){
        System.out.println("Введите число с клавиатуры: ");

        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.println("Вы неверно ввели число!");
            System.exit(0);
        }

        String number1 = sc.nextLine();

        System.out.println("Введите число с клавиатуры: ");
        if(!sc.hasNextInt()){
            System.out.println("Вы неверно ввели число!");
            System.exit(0);
        }

        int number2 = sc.nextInt();

        if (Integer.parseInt(number1) == number2) {
            System.out.println("Числа равны");
        }
        else if (Integer.parseInt(number1) > number2) {
            System.out.println("1 число больше 2");
            System.out.println(Double.parseDouble(String.valueOf(number2)));
        }
        else {
            System.out.println("2 число больше первого");
            System.out.println(Integer.parseInt(number1));
        }
    }
}
