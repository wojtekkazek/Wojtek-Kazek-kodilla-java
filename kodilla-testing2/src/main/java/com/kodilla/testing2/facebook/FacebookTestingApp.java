package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR_DAY = "//select[1]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"5k_5\")]/span/span/select[1]";
    public static final String XPATH_WAIT_FOR_MONTH = "//select[2]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"5k_5\")]/span/span/select[2]";
    public static final String XPATH_WAIT_FOR_YEAR = "//select[3]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"5k_5\")]/span/span/select[3]";

    public static void main (String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_DAY)).isDisplayed());

        WebElement selectCombo1= driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoard1 = new Select(selectCombo1);
        selectBoard1.selectByValue("1");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_MONTH)).isDisplayed());

        WebElement selectCombo2= driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByValue("1");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_YEAR)).isDisplayed());

        WebElement selectCombo3= driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoard3 = new Select(selectCombo3);
        selectBoard3.selectByValue("2020");
    }
}
