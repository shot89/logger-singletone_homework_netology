package ru.netology;

import ru.netology.filter.Filter;
import ru.netology.logger.Logger;

import java.util.*;

public class Main {
    public static final Logger logger = Logger.getInstance();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        String sizeInp = scanner.nextLine();
        System.out.println("Введите верхнюю границу для значений: ");
        String borderInp = scanner.nextLine();
        logger.log("Проверяем корректность пользовательского ввода");
        int listSize = 0, upperBound = 0;
        try {
            listSize = Integer.parseInt(sizeInp);
            upperBound = Integer.parseInt(borderInp);
        } catch (NumberFormatException e) {
            logger.log("Ошибка пользовательского ввода");
            e.printStackTrace();
        }

        logger.log("Проверяем возможность создания списка");

        if (listSize > 0 && upperBound > 0) {
            List<Integer> source = fillTheList(listSize, upperBound);
            System.out.println("Вот случайный список: " + source);
            logger.log("Просим пользователя ввести входные данные для фильтрации");
            System.out.println("Введите порог для фильтра:");
            String input = scanner.nextLine();
            logger.log("Проверяем корректность пользовательского ввода");
            int treshold = -1;
            try {
                treshold = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                logger.log("Ошибка пользовательского ввода");
                e.printStackTrace();
            }
            if (treshold >= 0) {
                Filter filter = new Filter(treshold);
                List<Integer> result = filter.filterOut(source);
                logger.log("Выводим результат на экран");
                System.out.println("Отфильтрованный список: " + result);
                logger.log("Завершаем программу");
            }


        } else {
            logger.log("Список не может быть создан, некорректные входные данные. Программа завершена без результата");
        }
    }

    private static List<Integer> fillTheList(int listSize, int upperBound) {
        logger.log("Создаём и наполняем список");
        Random random = new Random();
        List<Integer> result = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            result.add(random.nextInt(upperBound));
        }
        return result;
    }
}