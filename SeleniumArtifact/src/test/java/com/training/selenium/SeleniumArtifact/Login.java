package com.training.selenium.SeleniumArtifact;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
WebDriver obj;
	
	@BeforeTest
	void configure(){
		String url="https://www.trivago.in/";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		obj=new ChromeDriver();
		obj.manage().window().maximize();
		obj.get(url);
	}
	@Test (priority=0)
	void clickonlogin()
	{
		WebElement element;
		element=obj.findElement(By.xpath("//*[@id=\"js_navigation\"]/div/div[1]/button"));
		String name=element.getText();
		Assert.assertTrue(name.contains("Log in"));
		element.click();
	}
	@Test (priority=1)
	void addemail()
	{
		WebElement element,element1;
		element=obj.findElement(By.xpath("//*[@id=\"check_email\"]"));
		element.sendKeys("prajjawalbanati16@gmail.com");
		element1=obj.findElement(By.xpath("//*[@id=\"login_email_submit\"]"));
		element1.click();
		try 
		{
			Thread.sleep(2000);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test (priority=2)
	void addpassword()
	{
		WebElement element,element1;
		element=obj.findElement(By.xpath("//*[@id=\"login_password\"]"));
		element.sendKeys("u6y2IO@1");
		element1=obj.findElement(By.xpath("//*[@id=\"login_submit\"]/span[1]"));
		element1.click();
		
	}
	@AfterTest
	void closebrowser()
	{
		obj.quit();
	}

}


