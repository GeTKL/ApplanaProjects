package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class thirteenthExercise {
    public static void latinWords() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку из слов, разделенных пробелами:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        List<String> latinWords = new ArrayList<>();

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                latinWords.add(word);
            }
        }

        System.out.println("Слова, состоящие только из латиницы:");
        for (String word : latinWords) {
            System.out.println(word);
        }

        System.out.println("Количество слов, состоящих только из латиницы: " + latinWords.size());

        }
    }
