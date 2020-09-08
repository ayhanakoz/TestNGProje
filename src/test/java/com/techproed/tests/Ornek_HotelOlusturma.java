package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Ornek_HotelOlusturma extends TestBase {
    @BeforeMethod
    public void giris(){
        driver.get("http://www.fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }

    @Test
    public void hotelCreate(){
       WebElement codeKut = driver.findElement(By.id("Code"));
        codeKut.sendKeys("aaaaa");
        WebElement nameKut = driver.findElement(By.id("Name"));
        nameKut.sendKeys("BBBBBBB");

        driver.findElement(By.id("Address")).sendKeys("ccccccccc");
        driver.findElement(By.id("Phone")).sendKeys("1233456999");
        driver.findElement(By.id("Email")).sendKeys("anhsyshsnl@gmail.com");
        WebElement dropDown = driver.findElement(By.id("IDGroup"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Hotel Type1");
        WebElement saveButton = driver.findElement(By.id("btnSubmit"));
        saveButton.click();
        // WebElement basariliYazisi = driver.findElement(By.className("bootbox-body"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement basariliYazisi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bootbox-body")));
        Assert.assertTrue(basariliYazisi.isDisplayed());


    }

}
