package org.example.pom.base;

import org.example.pom.factory.DriverManager;
import org.example.pom.objects.Driver;
import org.example.pom.utils.JacksonUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod

    public void startDriver() {
         driver = new DriverManager().init_driver();
    }

    @AfterMethod
    public void stopDriver(){
        driver.quit();

    }
}
