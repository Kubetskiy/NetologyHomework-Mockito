package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void localeShouldReturnCorrectMessage() {
        var localizationService = new LocalizationServiceImpl();
        var expectedText = "Добро пожаловать";
        Assertions.assertEquals(expectedText, localizationService.locale(Country.RUSSIA));
    }
}