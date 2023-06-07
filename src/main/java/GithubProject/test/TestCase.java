package GithubProject.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import GithubProject.Base.WebDriver;
import GithubProject.PageImp.DeleteRepo;
import GithubProject.PageImp.HomePage;
import GithubProject.PageImp.LoginPage;
import GithubProject.PageImp.StatusChangePage;
import GithubProject.PageImp.createRepo;
import GithubProject.PageImp.editProfile;
@Listeners(Listener.class)
public class TestCase extends WebDriver{
	HomePage hPage=null;
	LoginPage lPage=null;
	createRepo cpage=null;
	DeleteRepo dpage=null;
	editProfile epage=null;
	StatusChangePage stpage=null;
//	Logger log1=null;
	@BeforeClass
	public void Instance() throws FileNotFoundException
	{
		hPage=new HomePage(driver, property);
		lPage=new LoginPage(driver,property);
		cpage=new createRepo(driver, property);
		dpage=new DeleteRepo(driver,property);
		epage=new editProfile(driver);
		stpage=new StatusChangePage(driver);
//		log1.getLogger("TestCase");
//		PropertyConfigurator.configure("Log4jGithub.properties");
	}
	@Test(priority=1)
	void login()
	{
		test=report.createTest("Login Test");
		hPage.LoadURL();
		hPage.clickSignIn();
		lPage.sendEmail();
		lPage.sendPass();
		lPage.signInClick();
	}
	@Test(priority=2)
	void RepoCreate()
	{
		test=report.createTest("Repository Creating");
		cpage.CreateRepository();
	}
	@Test(priority=3)
	void deleteRepo()
	{
		test=report.createTest("Deleting Repository");
		dpage.delRepo();
	}
	@Test(priority=4)
	void editProfile()
	{
		test=report.createTest("editProfile");
		epage.editProfile();
		epage.enterName();
		epage.addBio();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,\"f5 js-user-status-context\")]"))).perform();
	}
//	@Test(dependsOnMethods="editProfile")
//	void markStatus()
//	{
//		test=report.createTest("markStatus");
//		stpage.homePage();
//		stpage.profile();
//		stpage.setStatus();
//		stpage.whatHappening("I'm On Vacasion");
//		stpage.Busy();
//		stpage.busyTime("today");
//		stpage.finalClick();
//	}
	
}
