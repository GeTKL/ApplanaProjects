package exercise;

import java.util.Scanner;

import java.util.Scanner;

public class sixthExercise {
    public static void converter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int category = scanner.nextInt();

        if (category == 1) {
            convertMass(scanner);
        } else if (category == 2) {
            convertDistance(scanner);
        } else {
            System.out.println("Неверный выбор");
        }
    }

    private static void convertMass(Scanner scanner) {
        System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция, 4 - стоун");
        int unit = scanner.nextInt();

        System.out.println("Введите число");
        double value = scanner.nextDouble();

        double kg, lb, oz, st;

        switch (unit) {
            case 1:
                kg = value;
                lb = kg * 2.20462;
                oz = kg * 35.274;
                st = kg * 0.157473;
                break;
            case 2:
                lb = value;
                kg = lb / 2.20462;
                oz = lb * 16;
                st = lb / 14;
                break;
            case 3:
                oz = value;
                kg = oz / 35.274;
                lb = oz / 16;
                st = oz / 224;
                break;
            case 4:
                st = value;
                kg = st / 0.157473;
                lb = st * 14;
                oz = st * 224;
                break;
            default:
                System.out.println("Неверный выбор");
                return;
        }

        System.out.println("Результат:");
        System.out.printf("Килограммы: %.3f\n", kg);
        System.out.printf("Фунты: %.3f\n", lb);
        System.out.printf("Унции: %.3f\n", oz);
        System.out.printf("Стоуны: %.3f\n", st);
    }

    private static void convertDistance(Scanner scanner) {
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int unit = scanner.nextInt();

        System.out.println("Введите число");
        double value = scanner.nextDouble();

        double meters, miles, yards, feet;

        switch (unit) {
            case 1:
                meters = value;
                miles = meters / 1609.34;
                yards = meters * 1.09361;
                feet = meters * 3.28084;
                break;
            case 2:
                miles = value;
                meters = miles * 1609.34;
                yards = miles * 1760;
                feet = miles * 5280;
                break;
            case 3:
                yards = value;
                meters = yards / 1.09361;
                miles = yards / 1760;
                feet = yards * 3;
                break;
            case 4:
                feet = value;
                meters = feet / 3.28084;
                miles = feet / 5280;
                yards = feet / 3;
                break;
            default:
                System.out.println("Неверный выбор");
                return;
        }

        System.out.println("Результат:");
        System.out.printf("Метры: %.3f\n", meters);
        System.out.printf("Мили: %.3f\n", miles);
        System.out.printf("Ярды: %.3f\n", yards);
        System.out.printf("Футы: %.3f\n", feet);
    }
}
