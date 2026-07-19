package com.sunildutt.tests;

import com.sunildutt.testdata.CityData;
import com.sunildutt.testdata.CityDataReader;
import org.junit.jupiter.api.Test;

public class CityDataTest {

    //@Test
    void readCities() {

        CityData cityData = CityDataReader.getCityData();

        for (String city : cityData.getCities()) {
            System.out.println(city);
        }
    }
}