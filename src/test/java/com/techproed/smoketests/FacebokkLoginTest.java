package com.techproed.smoketests;

import com.techproed.pages.FacebookLoginPage;
import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FacebokkLoginTest extends TestBase {
    @Test
    public void girisTest(){
        driver.get("http://facebook.com");
        FacebookLoginPage loginPage = new FacebookLoginPage(driver);
        loginPage.emailKutusu.sendKeys(ConfigurationReader.getProperty("fb_email"));
        loginPage.sifreKutusu.sendKeys(ConfigurationReader.getProperty("fb_pass"));

    }
    @Test
    public void test1(){
        driver.get(ConfigurationReader.getProperty("fhc_login"));
        FhcTripLoginPage loginPage = new FhcTripLoginPage(driver);
        loginPage.userNameKutusu.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordKutusu.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginKutusu.click();
    }
}
