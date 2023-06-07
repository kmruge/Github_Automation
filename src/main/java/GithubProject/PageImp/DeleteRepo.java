package GithubProject.PageImp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GithubProject.Base.Common;

public class DeleteRepo extends Common {
	private RemoteWebDriver driver;
	private Properties property;
	public DeleteRepo(RemoteWebDriver driver, Properties property)
	{
		this.driver=driver;
		this.property=property;
	}
	public void delRepo()
	{
		WebElement findElement1 = driver.findElement(By.xpath(property.getProperty("DelSetting")));
		clickAction(findElement1);
		WebElement findElement2=driver.findElement(By.xpath(property.getProperty("DelClick")));
		clickAction(findElement2);
		WebElement findElement3=driver.findElement(By.xpath(property.getProperty("Delconfirmation1")));
		clickAction(findElement3);
		WebElement findElement4=driver.findElement(By.xpath(property.getProperty("Delconfirmation2")));
		clickAction(findElement4);
		String findElement5=driver.findElement(By.xpath(property.getProperty("DelGetName"))).getText();
		WebElement findElement6=driver.findElement(By.xpath(property.getProperty("DelSendName")));
		sendKey(findElement6,findElement5);
		WebElement findElement7=driver.findElement(By.xpath(property.getProperty("DelFinal")));
		clickAction(findElement7);
	}
}