package com.data.driven.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    // Static block to initialize config only once
    static {
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                    + "/src/test/resources/config.properties");
            prop = new Properties();
            prop.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties file");
        }
    }

    // Get value by key
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
