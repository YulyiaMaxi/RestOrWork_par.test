package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestOrWorkServiceTest {
    @Test
    public void CalculateRestOrWork() {
        RestOrWorkService service = new RestOrWorkService();
        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

    }

    @Test
    public void CalculateRestOrWork2() {
        RestOrWorkService service = new RestOrWorkService();
        int expected = 2;
        int actual = service.calculate(100000, 60000, 15000);
    }

}


