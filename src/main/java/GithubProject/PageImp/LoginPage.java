package GithubProject.PageImp;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import GithubProject.Base.Common;

public class LoginPage extends Common {
	private RemoteWebDriver driver=null;
	private Properties property;
	public LoginPage(RemoteWebDriver driver, Properties property) {
		this.driver=driver;
		this.property=property;
	}
	 By Email=By.xpath("//input[@id=\"login_field\"]");
	 By PassWord=By.xpath("//input[@id=\"password\"]");
	public void sendEmail()
	{
		driver.findElement(Email).sendKeys("muruPractice");
	}
	public void sendPass()
	{
		driver.findElement(PassWord).sendKeys("Mmuru@2004");
	}
	public void signInClick()
	{
		driver.findElement(By.xpath("//input[@data-signin-label=\"Sign in\"]")).click();
		Assert.assertEquals(driver.getTitle(),"GitHub");
	}
}