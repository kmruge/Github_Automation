package GithubProject.PageImp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class StatusChangePage {
	public static RemoteWebDriver driver;
	public StatusChangePage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	//Element on the status page.
	By homePage=By.xpath("//div[contains(@class,'Header-item mt-n1')]/a[@class=\"Header-link\"]");
	By profile=By.xpath("//summary[@aria-label=\"View profile and more\"]");
	By setStatus=By.xpath("//div[contains(@class,\"js-user-status-container rounded\")]");
	By whatHappening=By.name("message"); //sendkey
	By Busy=By.name("limited_availability");
	By Never=By.xpath("//summary[@class=\"btn-sm btn v-align-baseline\"]");
	By busyTime=By.xpath("//ul[contains(@class,\"dropdown-menu dropdown-menu\")]/li");
	By finalClick=By.xpath("//button[contains(@class,\"width-full btn btn-primary\")]");
	
	public void homePage()
	{
		driver.findElement(homePage).click();
	}
	public void profile()
	{
		driver.findElement(profile).click();
	}
	public void setStatus()
	{
		driver.findElement(setStatus).click();
	}
	public void whatHappening(String reason)
	{
		driver.findElement(whatHappening).sendKeys(reason);
	}
	public void Busy()
	{
		driver.findElement(Busy).click();
	}
	public void busyTime(String time)
	{
		driver.findElement(Never).click();
		List<WebElement> findElements = driver.findElements(busyTime);
		for(WebElement sin:findElements)
		{
			if(sin.getText().contains(time))
			{
				sin.click();
			}
		}
	}
	public void finalClick()
	{
		driver.findElement(finalClick).click();
	}
}
