package com.witsmate.TC;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.witsmate.POM.Login_POM;
import com.witsmate.generic.Base;


@Listeners(com.witsmate.listner.Listner1.class)
public class TC_Login extends Base
{
	@Test
	public void Login_Web() 
	{
		Login_POM lp = new Login_POM(driver);

		System.out.println(lp.getUsername().isEnabled());

		lp.getUsername().sendKeys("shriniwas@cloudaeon.net");
		System.out.println(lp.getUsername().isEnabled());
		lp.getPassWord().sendKeys("Shri@4916");

		lp.getLoginbtn().click();
		System.out.println(	lp.getLoginbtn().isDisplayed());
		
		assertTrue(false);






	}






}
