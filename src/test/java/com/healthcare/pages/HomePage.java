package com.healthcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final By makeAppointmentBtn = By.id("btn-make-appointment");

    public HomePage(WebDriver driver) { this.driver = driver; }

    public void clickMakeAppointment() {
        driver.findElement(makeAppointmentBtn).click();
    }
}
