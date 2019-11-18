package org.tsn.repo.automationframework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath = "//*[@text='Movies']")
	public WebElement username;

	@FindBy(xpath = "//*[@text='Movies']")
	public WebElement password;

	@FindBy(xpath = "//*[@text='Movies']")
	public WebElement loginBtn;

	@FindBy(xpath = "//*[@text='Movies']")
	public WebElement tsnLogo;

	@FindBy(xpath = "//*[@text='Movies']")
	public WebElement rememberMe;

	public boolean tsnLogoDisplayed() {
		boolean flag = false;
		if (tsnLogo.isDisplayed() == true) {
			return flag = true;
		}

		else
			return flag = false;

	}

	public boolean userNameDisplayed() {
		boolean flag1 = false;
		if (tsnLogo.isDisplayed() == true) {
			return flag1 = true;
		}

		else
			return flag1 = false;

	}

	public boolean passwordDisplayed() {
		boolean flag2 = false;
		if (tsnLogo.isDisplayed() == true) {
			return flag2 = true;
		}

		else
			return flag2 = false;

	}

	public boolean loginBtnDisplayed() {
		boolean flag3 = false;
		if (tsnLogo.isDisplayed() == true) {
			return flag3 = true;
		}

		else
			return flag3 = false;

	}

	public boolean rememberMeDisplayed() {
		boolean flag4 = false;
		if (tsnLogo.isDisplayed() == true) {
			return flag4 = true;
		}

		else
			return flag4 = false;

	}
	
	public void loginScreenDisplayed()
	{
		tsnLogoDisplayed();
		userNameDisplayed();
		passwordDisplayed();
		loginBtnDisplayed();
		rememberMeDisplayed();
	}
	
	
	
}
