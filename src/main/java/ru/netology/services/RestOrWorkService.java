
package ru.netology.services;

public class RestOrWorkService {

    public int calculate(int income, int expense, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int account = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (account >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                account = (account - expense) / 3; //месяц отдыха
            } else {
                account = account + income - expense; // месяц работы
            }
        }
        return count;

    }
}



