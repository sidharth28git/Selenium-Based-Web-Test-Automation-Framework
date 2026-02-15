package com.healthcare.tests;

import com.healthcare.base.BaseTest;
import com.healthcare.pages.HomePage;
import com.healthcare.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.healthcare.utils.Config.*;

public class LoginTest extends BaseTest {

    @Test
    public void canLoginFromHome() {
        new HomePage(driver).clickMakeAppointment();
        new LoginPage(driver).login(username(), password());
        Assert.assertTrue(driver.getCurrentUrl().contains("appointment"),
                "Expected to land on appointment page after login");
    }
}
