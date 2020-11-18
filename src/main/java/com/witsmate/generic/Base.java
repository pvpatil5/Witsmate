package com.witsmate.generic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public static WebDriver driver;
	@BeforeMethod
	public void launch() 
	{
		System.setProperty("webdriver.chrome.driver", "../Witsmate_1/src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app-ne-dev-witsmate-idhub.azurewebsites.net/idhub/Account/Login?ReturnUrl=%2Fidhub%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Dangular_witsmate%26redirect_uri%3Dhttps%253A%252F%252Fapp-ne-dev-witsmate-angular.azurewebsites.net%252Fassets%252Fhtml%252Fsignin-callback.html%26response_type%3Dcode%26scope%3Dopenid%2520profile%2520apiOkr%2520apiMaster%26state%3D7e80902d6f2c4074b7b5de6dcff396e3%26code_challenge%3D9glsNgxWHP3gEet596zRG7k0-gxbTfh4rFH0zfjIvH8%26code_challenge_method%3DS256%26response_mode%3Dquery");
	}
	
	public static void takeScrnshot(String mtdname) throws IOException 
	{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destfile= new File("../Witsmate_1/Screenshot"+mtdname+".png");

		FileUtils.copyFile(srcfile, destfile);

	}
}
