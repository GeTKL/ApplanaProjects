package exercise;

import java.util.Scanner;

public class tenthExercise {
    public static void  matrix(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы через пробел: ");
        String[] razr = sc.nextLine().split(" ");
        double[][] array = new double[Integer.parseInt(razr[0])][Integer.parseInt(razr[1])];

        for(int i = 0; i < Integer.parseInt(razr[0]); i++){
            System.out.println("Введите " + (i+1) + " строку матрицы через пробел: ");
            sc = new Scanner(System.in);
            String[] numbers = sc.nextLine().split(" ");

            for(int j = 0; j < Integer.parseInt(razr[1]); j++){
                array[i][j] = Double.parseDouble(numbers[j]);
            }
        }

        for(int i = 0; i < Integer.parseInt(razr[0]); i++){
            for(int j = 0; j < Integer.parseInt(razr[1]); j++){

                if (i == 0)
                {
                    array[i][j] *= 3;
                }

                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
