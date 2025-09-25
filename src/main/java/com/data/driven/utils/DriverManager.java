package com.data.driven.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {

    public static WebDriver getDriver(String browser) {
        WebDriver driver;

        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                System.out.println("Chrome browser is launched");
                break;

            case "firefox":
                driver = new FirefoxDriver();
                System.out.println("Firefox browser is launched");
                break;

            case "edge":
                driver = new EdgeDriver();
                System.out.println("Edge browser is launched");
                break;

            case "safari":
                driver = new SafariDriver();
                System.out.println("Safari browser is launched");
                break;

            default:
                throw new IllegalArgumentException("Invalid browser specified: " + browser);
        }

        return driver;
    }
}
