package exercise;

import java.util.Arrays;

public class thirdExercise {
    public static void arrayWork(){
        int[] array = {2, 5, 12, 5, 31};

        int last = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = last;
        int avgElement = array[array.length / 2];
        System.out.println("Сумма первого и среднего элемента равна: " + (last + avgElement));
        // System.out.println(Arrays.toString(array)); // Вывод массива
    }
}
