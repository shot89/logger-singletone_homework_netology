package ru.netology.filter;

import ru.netology.logger.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = source.stream()
                .filter(value -> {
                    if (value > treshold) {
                        logger.log("Элемент \"" + value + "\" проходит");
                    } else {
                        logger.log("Элемент \"" + value + "\" не проходит");
                    }
                    return value > treshold;
                })
                .collect(Collectors.toList());
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }

}
