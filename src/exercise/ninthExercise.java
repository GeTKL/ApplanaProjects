package exercise;

import java.util.Scanner;

public class ninthExercise {
    public static void averageCompis(){
        System.out.println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();

        System.out.println("Введите числа через пробел: ");
        sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");

        double[] arrayDouble = new double[arrayLength];

        if (array.length > arrayLength)
        {
            System.out.println("Количество чисел превышает длину массива, повторите попытку.");
            System.exit(0);
        }

        int counter = 0;
        double sum = 0;
        while(counter < array.length){
            arrayDouble[counter] = Double.parseDouble(array[counter]);
            sum += arrayDouble[counter];
            counter++;
        }
        sum /= array.length;

        counter = 0;
        for(Double number : arrayDouble){
            number = sum * arrayDouble[counter];
            arrayDouble[counter] = number;
            System.out.print(arrayDouble[counter] + " ");
            counter++;
        }
    }
}
