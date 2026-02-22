package com.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_DockerTest {
	
	public WebDriver driver;
	@Parameters({"bname"})
	
  @Test
  public void crossBrowserTest(String bname) throws MalformedURLException, InterruptedException {
		
	  
	  if(bname.equals("Chrome")) {
		  
		  ChromeOptions option = new ChromeOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"),option);
		  System.out.println("Connection Established with Chrome Browser");
	  }
	  else if(bname.equals("Firefox")) {
		  
		  FirefoxOptions option = new FirefoxOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"),option);
		  System.out.println("Connection Established with Firefox Browser");
		  
	  }
	  else if(bname.equals("Edge")) {
		  
		  EdgeOptions option = new EdgeOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"),option);
		  System.out.println("Connection Established with Edge Browser");
	  }
	  
	  // open application
	  Thread.sleep(10000);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(6000);
	  System.out.println("Application Executing Parallelly!");
	  
	  driver.quit();
  }
}



