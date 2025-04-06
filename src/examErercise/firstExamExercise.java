package examErercise;

import java.util.Scanner;

public class firstExamExercise {
    static Scanner in = new Scanner(System.in);
    public static void converterValute(){

        System.out.println("Введите курс доллара: ");
        in = new Scanner(System.in);
        check();
        double dollar = in.nextDouble();

        System.out.println("Введите количество рублей: ");
        in = new Scanner(System.in);
        check();
        double rubles = in.nextDouble();

        double total = rubles / dollar;
        System.out.println("Итого: " + String.format("%.2f",total));
    }

    public static void check(){
        if(!in.hasNextDouble()){
            System.out.println("Необходимо ввести число!");
            System.exit(0);
        }
    }
}
