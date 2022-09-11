package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.sender.MessageSenderImpl;

class GeoServiceImplTest {

    @Test
    void byIpShouldReturnCorrectLocation() {
        var geoService = new GeoServiceImpl();
        var expectedLocation = new Location("", Country.RUSSIA, "", 0);
        var expectedCountry = expectedLocation.getCountry();
        var resultTestCountry = geoService.byIp(GeoServiceImpl.RUSSIAN_IP).getCountry();
        Assertions.assertEquals(expectedCountry, resultTestCountry);
    }
}