package com.TestCases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM.POM;
import com.Utility.Browser;
import com.Utility.Excelsheet;

public class TestCase_1 {

	WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() {
		driver = Browser.OpenBrowser("https://kite.zerodha.com/");
	}
	
	@AfterMethod
	public void aftermethod() {
		driver.close();
	}
	
	@Test
	public void LoginwithBlankInput() {
		POM pom = new POM(driver);
		pom.ClickonLogin();
	}
	
	@Test
	public void checkTitle() {
		POM pom = new POM(driver);
		String ActTitle = pom.getTitle();
		String ExpectedTitle="Login to Kite";
		if (ActTitle.equals(ExpectedTitle)) {
			System.out.println("Title Matched");
		}else {
			System.out.println("Title Mismatched");
		}
	}
	
	
	@Test
	public void displayLogo() {
		POM pom = new POM(driver);
		boolean ActLogo = pom.Logo();
		boolean ExpLogo =  ActLogo;
	}
	
	@Test
	public void LoginwithUserID() throws EncryptedDocumentException, IOException {
		POM pom = new POM (driver);
		String UserName = Excelsheet.GetData(0, 1, "ABCD");
		pom.ClickonLogin();
	}
	
	@Test
	public void ClickOnForgetPass() {
		POM pom = new POM (driver);
		pom.ClickOnForget();
	}
	
	@Test
	public void ClickOnNewAccount() throws EncryptedDocumentException, IOException {
		POM pom = new POM (driver);
		pom.ClickOnNewAccount();
		ArrayList<String> list = new ArrayList(driver.getWindowHandles());
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		driver.switchTo().window(list.get(1));
		String Phone = Excelsheet.GetData(3, 1, "ABCD");
		pom.ClickOnNewAccount();
	}
	@Test
	public void TestCase() throws EncryptedDocumentException, IOException {
		POM pom = new POM(driver);
		String UserName = Excelsheet.GetData(0, 1, "ABCD");
		pom.EnterUserName(UserName);
		String Password = Excelsheet.GetData(1, 1, "ABCD");
		pom.EnterPassword(Password);
		pom.ClickonLogin();
		String Pincode = Excelsheet.GetData(2, 1, "ABCD");
		pom.EnterPin(Pincode);
		pom.ClickonContinue();
	}
	
	
}
