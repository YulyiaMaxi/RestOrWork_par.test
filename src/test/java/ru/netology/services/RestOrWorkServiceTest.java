package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestOrWorkServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/figures.csv")
    public void CalculateRestOrWork(int expected, int income, int expense, int threshold) {
        RestOrWorkService service = new RestOrWorkService();
        //int expected = 3;
        int actual = service.calculate(income, expense, threshold);

    }

    //@Test
    //public void CalculateRestOrWork2() {
    //RestOrWorkService service = new RestOrWorkService();
    //int expected = 2;
    //int actual = service.calculate(100000, 60000, 15000);
    //}

}


