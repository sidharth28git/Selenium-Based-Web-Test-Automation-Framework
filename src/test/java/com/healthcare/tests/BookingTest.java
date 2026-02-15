package com.healthcare.tests;

import com.healthcare.base.BaseTest;
import com.healthcare.pages.AppointmentPage;
import com.healthcare.pages.HomePage;
import com.healthcare.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.healthcare.utils.Config.*;

public class BookingTest extends BaseTest {

    @Test
    public void canBookAppointment() {
        new HomePage(driver).clickMakeAppointment();
        new LoginPage(driver).login(username(), password());
        AppointmentPage appt = new AppointmentPage(driver);
        appt.book("30/12/2025", "Routine check");
        Assert.assertTrue(appt.isConfirmed(), "Appointment confirmation not shown");
    }
}
