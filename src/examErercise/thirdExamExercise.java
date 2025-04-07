package examErercise;

import java.util.Scanner;

public class thirdExamExercise {
    static int sum = 0, maxSum = 0;
    static String answer;
    public static void stringMoreLength(){
        System.out.println("Введите количество строк: ");
        Scanner in = new Scanner(System.in);

        if(!in.hasNextInt())
        {
            System.out.println("Вы не ввели количество строк!");
            System.exit(0);
        }

        int count = in.nextInt();
        int counter = 0;

        while(counter < count)
        {
            System.out.println("Введите строку:");

            in = new Scanner(System.in);
            String str = in.nextLine();
            int length = str.length();
            strInArray(length, str);

            if (maxSum < sum)
            {
                answer = str;
                maxSum = sum;
            }
            sum = 0;
            counter++;
        }
        System.out.println("Ответ: " + answer);
    }

    public static void strInArray(int len ,String strn){
        char[] letter = strn.toCharArray();
        for (int i = 0; i < len; i++)
        {
            for (int j = i + 1; j < letter.length; j++)
            {
                if (letter[i] != letter[j])
                {
                    sum += 1;
                }
            }
        }
    }
}
