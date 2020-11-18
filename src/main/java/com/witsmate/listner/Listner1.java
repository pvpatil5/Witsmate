package com.witsmate.listner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.witsmate.generic.Base;


public class Listner1 extends Base implements ITestListener
{

	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Fail is taking from Listner");

		String mtdname =result.getMethod().getMethodName();

		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destfile= new File("../Witsmate_1/Screenshot"+mtdname+".png");

		try {
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Fail is taking from Listner");

		String mtdname =result.getMethod().getMethodName();

		try {
			takeScrnshot(mtdname);
		} catch (IOException e) {

			e.printStackTrace();
		}	
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
