package examErercise;

import java.util.Scanner;

public class secondExamExercise {
    static String x, y, z, sign, peretasovka;
    static int countX;
    static double result;
    static String[] array;
    static Scanner in = new Scanner(System.in);
    public static void equation(){
        System.out.println("Введите уравнение в виде x+y=z; где переменная - цифра от 0 до 9 без пробелов");

        array = new String[5];
        String input = in.nextLine();

        for(int i = 0; i < 5; i++){
            array[i] = String.valueOf(input.charAt(i));
            if(array[i].equals("x")){
                countX = i + 1;
            }
        }

        checkErrorInput();

        x = array[0];
        y = array[2];
        z = array[4];
        sign = array[1];

        variableConvert();
        switch(countX){
            case 1:
                equal(y, z, sign);
                break;

            case 3:
                equal(x, z, sign);
                break;

            case 5:
                equal(x, y, sign);
                break;

            default:
                System.out.println("Вы не ввели x (англ раскладка), начните заново!");
                System.exit(0);
        }
        System.out.println(result);
    }

    public static void variableConvert(){
        if (!z.equals("x"))
        {
            if (sign.equals(("+"))) {
                x = "-" + x;
                y = "-" + y;
            }
            if (sign.equals("*")){
                sign = "/";
                if (x.equals("x"))
                {
                    peretasovka = z;
                    z = y;
                    y = peretasovka;
                }
                else if (y.equals("x")){
                    peretasovka = z;
                    z = x;
                    x = peretasovka;
                }
            }
            if (x.equals("x")){
                if (sign.equals("-")) {
                    sign = "+";
                } else if (sign.equals("/")){
                    sign = "*";
                }
            }
        }
    }

    public static void checkErrorInput(){
        for(int i = 0; i < 5; i+=2)
        {
            try {
                if (!array[i].equals("x")) {
                    Integer.parseInt(array[i]);
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Ошибка! Ввод недопустимых значений!");
                System.exit(0);
            }
        }
    }

    public static void equal(String first, String two, String sign){
        switch (sign) {
            case "+":
                result = Double.parseDouble(first) + Double.parseDouble(two);
                break;
            case "-":
                result = Double.parseDouble(first) - Double.parseDouble(two);
                break;
            case "*":
                result = Double.parseDouble(first) * Double.parseDouble(two);
                break;
            case "/":
                result = Double.parseDouble(first) / Double.parseDouble(two);
                break;
            default:
                System.out.println("Знак не введен или находится не на нужной позиции!");
                System.exit(0);
        }
    }
}
