package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    private int filteredNumber;

    public Filter (int filteredNumber) {
        this.filteredNumber = filteredNumber;
    }

    public List<Integer> filterOut(List<Integer> list) throws InterruptedException {
        Logger logger = Logger.getInstance();
        List<Integer> filteredList = new ArrayList<>();
        int afterFilter = 0;
        for (int i : list) {
            if (i >= filteredNumber) {
                logger.log("Элемент " + i + " проходит");
                filteredList.add(i);
                afterFilter++;
                Thread.sleep(500);
            } else {
                logger.log("Элемент " + i + " не проходит");
                Thread.sleep(500);
            }
        }
        System.out.println("Прошло фильтрацию " + afterFilter + " элемента из " + list.size());
        logger.log("Итоговый список после фильтрации:");
        System.out.println(filteredList);
        return filteredList;
    }
}
