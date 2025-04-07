package exercise;

import java.util.Random;

public class fourtheethExercise {
    public static void ArrayRandom() {
            int[] array = new int[15];
            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(41) - 20;
            }

            System.out.print("Массив: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            int max = array[0];
            int min = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("Максимальный элемент: " + max);
            System.out.println("Минимальный элемент: " + min);

            int absMax = Math.abs(max);
            int absMin = Math.abs(min);
            int result = (absMax > absMin) ? max : min;

            System.out.println("Наибольшее по модулю значение: " + result);
        }
    }
