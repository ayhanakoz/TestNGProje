package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FhcTripLoginTest extends TestBase {
    @Test
    public void searchTest() {
        driver.get("http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");
        FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage(driver);
        fhcTripLoginPage.userNameKutusu.sendKeys("manager2");
        fhcTripLoginPage.passwordKutusu.sendKeys("Man1ager2!");
        fhcTripLoginPage.loginKutusu.click();
    }
}