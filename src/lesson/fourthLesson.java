package lesson;

public class fourthLesson {
    public static void operators(){
        int a = 6;
        int b = 3;
        int c = a + b;
        int d = a - b;
        int e = a * c;
        int f = e / b;
        System.out.println(c + " " + d + " " + e + " " + f);

        int m = 7 / 2;
        int n = 7 % 2;
        System.out.println("Если /, то остаток от деления целых чисел отбрасываетс, деление равно = " + m);
        System.out.println("Если %, то выводится остаток от деления, можно и к дробным числам применять = " + n);

        // Оператор присваивания - это знак равенства =, присваивает значение переменной

        int x, y, z; // объявление нескольких переменных
        x = y = z = 100; // присваивание одного значения нескольким переменным
        System.out.println(x + " " + y + " " + z);

        // Операторы присваивания 2.0

        int aa = 2;
        int ab = 3;

        System.out.println(aa += ab);
        System.out.println(ab -= 1);
        System.out.println(aa *= ab);
        System.out.println(ab /= 2);
        System.out.println(aa %= 4);


        // инкремент и декремент

        int ac = 10;
        System.out.println(ac++); // инкремент постфикс
        System.out.println(ac--); // декремент

        // Можно записать по-другому

        System.out.println(++ac); // инкремент префикс
        System.out.println(--ac); // декремент

        // Префикс - значение меняется до использования оператора. Постфикс - значение меняется после исп-ия оператора.

        // Операторы присваивания
        boolean aaa = 2 > 1;
        boolean aab = 2 < 1;
        boolean aac = 1 >= 1;
        boolean aad = 2 >= 1;
        System.out.println(aaa + " " + aab + " " + aac + " " + aad);
        boolean aaa2 = 1 == 1;
        boolean aab2 = 1 == 2;
        boolean aac2 = 1 != 1;
        boolean aad2 = 1 != 2;
        System.out.println(aaa2 + " " + aab2 + " " + aac2 + " " + aad2);
        boolean aaa3 = 'r' == 'd';
        boolean aab3 = 'r' == 'r';
        boolean aac3 = 'r' != 'd';
        boolean aad3 = 'r' != 'r';
        System.out.println(aaa3 + " " + aab3 + " " + aac3 + " " + aad3);

        /*

        & - Логическое AND (И)
        && - Сокращенное And. Если первый операнд false, то второй даже не проверяется
        | - Логическое Or (или)
        || - Сокращенное Or. Если первый true, то второй не проверяется
        ^ - логическое XOR (Исключающее Or(Или))
        ! - Логическое унарное Not (не)
        &= - And с присваиванием
        |= - Or с присваиванием
        ^= - Xor с присваиванием
        ?: - Тернарный условный оператор

        */

        boolean example1 = !true; // false
        boolean example2 = !false; // true

        boolean example3 = false & false; // false
        boolean example4 = true & false; // false
        boolean example5 = false & true; // false
        boolean example6 = true & true; // true

        boolean example7 = true | true; // true
        boolean example8 = false | true; // true
        boolean example9 = true | false; // true
        boolean example10 = false | false; // false

        boolean example11 = true ^ true; // false
        boolean example12 = true ^ false; // true
        boolean example13 = false ^ true; // true
        boolean example14 = false ^ false; // false

        int mouse; // число мышей
        int weight; // вес кота в граммах
        mouse = 0;
        weight = 500;
        if (mouse != 0 && weight / mouse <= 100) System.out.println("Можно кормить кота");

        /*

        Порядок операторов

        Инкремент и декремент
        Умножение, деление и деление по модулю
        Сложение и вычитание
        Операции сравнения

         */

    }
}
