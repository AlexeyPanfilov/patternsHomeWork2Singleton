package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Hello friend!");
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int listLength = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxNumber = scanner.nextInt();
        logger.log("Создаем и наполняем список");
        List<Integer> integersList = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            integersList.add(random.nextInt(maxNumber));
        }
        logger.log("Получившийся список:");
        System.out.println(integersList);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filteredNumber = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(filteredNumber);
        filter.filterOut(integersList);
        logger.log("Завершаем программу");
    }
}