package com.witsmate.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.witsmate.generic.Base;

public class Login_POM extends Base
{
	@FindBy(id="userName")
	private WebElement username;

	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginbtn;


	public Login_POM(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername() {
		return username;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}


	public WebElement getPassWord() {
		return passWord;
	}



}
