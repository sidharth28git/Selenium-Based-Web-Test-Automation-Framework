package com.healthcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {
    private final WebDriver driver;

    private final By facility = By.id("combo_facility");
    private final By readmission = By.id("chk_hospotal_readmission");
    private final By healthcareProgramMedicaid = By.id("radio_program_medicaid");
    private final By visitDate = By.id("txt_visit_date");
    private final By comment = By.id("txt_comment");
    private final By bookBtn = By.id("btn-book-appointment");

    private final By confirmationHeader = By.cssSelector("h2");

    public AppointmentPage(WebDriver driver) { this.driver = driver; }

    public void book(String date, String notes) {
        new Select(driver.findElement(facility)).selectByVisibleText("Tokyo CURA Healthcare Center");
        driver.findElement(readmission).click();
        driver.findElement(healthcareProgramMedicaid).click();
        driver.findElement(visitDate).sendKeys(date);
        driver.findElement(comment).sendKeys(notes);
        driver.findElement(bookBtn).click();
    }

    public boolean isConfirmed() {
        return driver.findElement(confirmationHeader).getText().equalsIgnoreCase("Appointment Confirmation");
    }
}
