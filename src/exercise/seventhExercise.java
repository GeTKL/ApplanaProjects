package exercise;

import java.util.Scanner;

public class seventhExercise {
    public static void compareArray(){
        final int x = 12;
        final int y = 5;
        final int z = 3;

        System.out.println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();

        System.out.println("Введите числа через пробел: ");
        sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int[] array = new int[arrayLength];

        if (input.length > arrayLength)
        {
            System.out.println("Количество чисел превышает длину массива, повторите попытку.");
            System.exit(0);
        }

        int counter = 0;
        while (counter < arrayLength) {
            array[counter] = Integer.parseInt(input[counter]);
            if (array[counter] == x || array[counter] == y || array[counter] == z) {
                System.out.println("Значение " + array[counter] + " имеется в константах");
                break;
            }
            counter++;
        }
    }
}
