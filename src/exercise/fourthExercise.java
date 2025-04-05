package exercise;

import java.util.Scanner;

public class fourthExercise {
    public static void operators() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа, x, y, z через пробел: ");
        String[] input = in.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int z = Integer.parseInt(input[2]);
        double average = (double) (x + y + z) / input.length;
        double round = Math.floor(average / 2);
        if (round > 3){
            System.out.println("Программа выполнена корректно.");
        }
        System.out.println("Полученное число после всех операций = " + round);
    }
}
