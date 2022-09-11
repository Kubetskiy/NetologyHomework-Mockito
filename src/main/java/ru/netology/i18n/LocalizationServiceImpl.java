package ru.netology.i18n;

import ru.netology.entity.Country;

public class LocalizationServiceImpl implements LocalizationService {

    public String locale(Country country) {
        return switch (country) {
            case RUSSIA -> "Добро пожаловать";
            case USA -> "Welcome";
            default -> "Welcome";
        };
    }
}
