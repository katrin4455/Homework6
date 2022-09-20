package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatisticsServiceTest {

    @Test
    public void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long actual = service.findMax(incomesInBillions);
        long expected = 12;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMin() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long actual = service.findMin(incomesInBillions);
        long expected = 3;


        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void findAverage() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        double actual = service.findAverage(incomesInBillions);
        double expected = 7.0;


        Assertions.assertEquals(expected, actual);


    }
}
