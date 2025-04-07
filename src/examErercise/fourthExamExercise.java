package examErercise;

import java.util.Scanner;

public class fourthExamExercise {
    public static void riddle(){
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Вы можете ввести подсказу, написав \"Подсказка\"");
        String answer = "Заархивированный вирус";
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            String answerPeople = input.nextLine().trim();

            if (answer.equals(answerPeople)){
                System.out.println("Правильно!");
                System.exit(0);
            }

            if (i == 0 )
            {
                if (answerPeople.equals("Подсказка"))
                {
                    System.out.println("Какой-то вирус, но какой?");

                    answerPeople = input.nextLine();
                    if (!answerPeople.equals(answer)){
                        gameOver();
                    }
                }
            }

            if (i == 0 || i == 1)
            {
                if(!answer.equals(answerPeople)) {
                    System.out.println("Подумай еще!");
                }
                System.out.println("Подсказка уже недоступна!");
            }
        }
        gameOver();
    }

    public static void gameOver(){
        System.out.println("Обидно, приходи в другой раз!");
        System.exit(0);
    }
}
