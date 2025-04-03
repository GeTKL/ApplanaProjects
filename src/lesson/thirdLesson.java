package lesson;

import java.util.Arrays;

public class thirdLesson {
    public static void array(){
        // int[] arrayDigit; // Предпочтительный способ объявления массива
        int arrayDigit2[]; // Тоже можно, но лучше не надо

        int[] arrayDigit = new int[10]; // Резервация для массива в памяти 10 элементов.

        int[] nums = new int[] {1, 4, 6, 2};
        int[] nums2 = {7, 3, 4, 2}; // Эти способы - одинаковые

        int[] nums3 = new int[4]; // Далее установка элементов массива
        nums3[0] = 2;
        nums3[1] = 3;
        nums3[2] = 4;
        nums3[3] = 5;

        System.out.println(nums3[2]); // Вывод третьего элемента массива

        int[] nums4 = {4, 6, 2, 3, 1, 8, 42145};
        System.out.println(nums4.length);

        int lastElementArray = nums4[nums4.length - 1];
        System.out.println("Последний элемент массива = " + lastElementArray);

        // Двумерный массив

        // int[][] twoDimArray = new int[2][3];
        int[][] twoDimArray = {{2, 3, 5},{3, 4, 1}};

        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println(); // перенос строки.
        }

        // быстрый вывод массива

        int[][] twoDimArray2 = {{3, 2, 4}, {6, 2, 3}};
        System.out.println(Arrays.deepToString(twoDimArray2));

        // Вывод длинны массива

        int[][] twoDimArray3 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Количество строк массива = " + twoDimArray3.length + ", а количество столбцов равно = " + twoDimArray3[0].length);

    }
}
