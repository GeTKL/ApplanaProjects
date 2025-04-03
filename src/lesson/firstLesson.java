package lesson;

import java.util.Scanner;

public class firstLesson {
    public static void firstLessonClass() {
        System.out.println("Appline!");
        System.out.println(5);
        System.out.println("Mama" + "Artyom" + "Egor");
        System.out.println("Applina is a company!");
        System.out.println("Appline" + " " + "is a company!");
        System.out.println(1 + 2);
        System.out.println("3" + "6");
        System.out.println(5 + "6");

        System.out.print("Appline!");
        System.out.print("-Appline!-");
        System.out.print("Appline"); // print - Выводит текст без переноса каретки на след. строку
        System.out.println("");

        System.out.printf("%s %s %d равен %f", "Корень", "числа", 675, 25.98);

        /*

        printf - выводит данные по заданному шаблону.
        %s - строка или слово.
        %d - целое десятичное число
        %f - число с плавающей точкой

         */

        System.out.println("App\bline!"); // \b удаление символа?
        System.out.println("App\fline!"); // \f пробел
        System.out.println("App\nline!"); // \n переход на новую строку
        System.out.println("App\tline!"); // \t символ табуляции
        System.out.println("App\rline!"); // \r символ возврата каретки
        System.out.println("App\'line!"); // \' символ одинарной кавычки
        System.out.println("App\"line!"); // \" символ двойной кавычки
        System.out.println("App\\line!"); // \\ символ обратной косой черты

        // ввод с консоли

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = in.nextInt(); // метод nextInt() возвращает число, введенное с клавиатуры.
        System.out.printf("Your number: %d \nThe end", num);
    }
}
