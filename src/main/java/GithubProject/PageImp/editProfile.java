package GithubProject.PageImp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class editProfile {
	RemoteWebDriver driver;
	public editProfile(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Edit profile']")
	WebElement button;
	
	public void editProfile()
	{
		button.click();
	}
	
	@FindBy(id="user_profile_name")
	WebElement name;
	public void enterName()
	{
		name.sendKeys("george");
	}
	
	@FindBy(id="user_profile_bio")
	WebElement bio;
	public void addBio()
	{
		bio.sendKeys("This is bio column");
	}
	public void save()
	{
		
	}
}
