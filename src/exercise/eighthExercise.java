package exercise;

import java.util.Scanner;

public class eighthExercise {
    public static void oddNumbers(){
        System.out.println("Введите целое положительное число");

        Scanner in = new Scanner(System.in);
        int number = 0;

        if (in.hasNextInt())
        {
            number = in.nextInt();
        }
        else {
            System.out.println("Вы ввели не целое число, повторите попытку.");
            System.exit(0);
        }

        if(number < 0)
        {
            System.out.println("Введено отрицательное число, повторите попытку");
            System.exit(0);
        }

        int count = 1;
        int sum = 0;
        while (count < number){
            sum = sum + count;
            count += 2;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
