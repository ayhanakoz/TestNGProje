package com.techproed.tests;

import com.techproed.pages.FhcTripCreatePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FhcTripCreatTest extends TestBase {

    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ 	Keys.ENTER);
    }
    @Test
    public void test(){
        giris();
        FhcTripCreatePage fhcTripCreatePage = new FhcTripCreatePage(driver);
        fhcTripCreatePage.code.sendKeys("1234");
        fhcTripCreatePage.address.sendKeys("ifkdslf");
        fhcTripCreatePage.name.sendKeys("aijididn");
        fhcTripCreatePage.email.sendKeys("jsajdskkds@gmail.com");
        fhcTripCreatePage.phone.sendKeys("021544 22316");
        Select select = new Select(fhcTripCreatePage.idgroup);
        select.selectByIndex(2);
        fhcTripCreatePage.submit.click();
    }




}
