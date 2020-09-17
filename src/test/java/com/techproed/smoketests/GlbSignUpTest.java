package com.techproed.smoketests;

import com.techproed.pages.GlbSignUpPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GlbSignUpTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite çalıştı");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest çalıştı");
    }
    /*
     * 1. Adım : https://www.glbtrader.com/register-2.html adresine gidelim
     * 2. Adım : GlbSignUpPage class'ından nesne üretip, webelementleri kullanalım.
     * 3. Adım : İçerisine ekleyeceğimiz bilgileri (name, email, phone vs) yine
     *           ConfigurationReader kullanarak, properties file'dan alalım.
     * 4. Adım : Sign-Up butonuna tıklayalım.
     * 5. Adım : Success yazısını görüp görmediğimi Assert ile doğrulayalım.
     *
     */
    @Test
    public void test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_login"));
        GlbSignUpPage glbSignUpPage = new GlbSignUpPage();
        glbSignUpPage.emailKutusu.sendKeys(ConfigurationReader.getProperty("glb_email"));
        glbSignUpPage.nameKutusu.sendKeys(ConfigurationReader.getProperty("glb_name"));
        glbSignUpPage.mobileKutusu.sendKeys(ConfigurationReader.getProperty("glb_phone"));
        glbSignUpPage.passwordKutusu.sendKeys(ConfigurationReader.getProperty("glb_sifre"));
        glbSignUpPage.rePasswordKutusu.sendKeys(ConfigurationReader.getProperty("glb_resifre"));
        glbSignUpPage.signUpButonu.click();
        // signUp butonuna tıkladıktan sonra, Success!! yazısını hemen alabilir miyim ?
        System.out.println(glbSignUpPage.basariliYazisi.getText());
        boolean dogruMu = glbSignUpPage.basariliYazisi.getText().contains("Success");
        Assert.assertTrue(dogruMu);
    }
}
