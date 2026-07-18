package com.sunildutt.testdata;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class CityDataReader {

    private static final CityData cityData;

    static {
        Yaml yaml = new Yaml();

        InputStream inputStream = CityDataReader.class
                .getClassLoader()
                .getResourceAsStream("testdata/cities.yaml");

        if (inputStream == null) {
            throw new RuntimeException("Unable to find testdata/cities.yaml");
        }

        cityData = yaml.loadAs(inputStream, CityData.class);
    }

    private CityDataReader() {
        // Prevent instantiation
    }

    public static CityData getCityData() {
        return cityData;
    }
}