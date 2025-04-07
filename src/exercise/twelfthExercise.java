package exercise;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class twelfthExercise {
    public static void workWithString(){
        String str = "I like Java!!!";

        boolean contains = str.contains("Java");

        if(contains){
            boolean starts = str.startsWith("I like");

            if (starts){
                boolean ends = str.endsWith("!!!");

                if(ends){
                    str = str.toUpperCase(Locale.ROOT);
                    String result = str.replace("A", "O");
                    System.out.println(result.charAt(7) + result.substring(8, 11).toLowerCase(Locale.ROOT));

                }
                else{
                    System.out.println("Строка не заканчивается на !!!");
                }

            }
            else {
                System.out.println("Не начинается с I like");
                System.exit(0);
            }

        } else
        {
            System.out.println("В строке нет Java");
            System.exit(0);
        }
    }
}
