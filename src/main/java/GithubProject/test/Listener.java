package GithubProject.test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	  }
	 public void onTestStart(ITestResult result) {
		 System.out.println("Test started");
		  }
	public void onTestFailure(ITestResult result) {
		    // not implemented
		System.out.println("Test Failed");
		  }
}