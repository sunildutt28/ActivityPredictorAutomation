package com.sunildutt.utils;

import com.sunildutt.config.Configuration;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class YamlReader {

    private static Configuration configuration;

    static {

        Yaml yaml = new Yaml();

        InputStream inputStream =
                YamlReader.class
                        .getClassLoader()
                        .getResourceAsStream("config.yaml");

        configuration =
                yaml.loadAs(inputStream, Configuration.class);

    }

    public static Configuration getConfiguration() {

        return configuration;

    }

}