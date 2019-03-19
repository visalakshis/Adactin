package org.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage {

	public WebDriver driver;

	@FindBy(xpath = "//td[@class='content_left']//p[text()='Welcome to AdactIn Group of Hotels']")
	private WebElement validatetext;

	@FindBy(id = "username")
	private WebElement UserInputField;

	@FindBy(id = "password")
	private WebElement passwordInputField;

	@FindBy(id = "login")
	private WebElement loginBtn;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutbtn;

	public WebElement getValidatetext() {
		return validatetext;
	}

	public WebElement getUserInputField() {
		return UserInputField;
	}

	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getVeryfyusernameinhomepage() {
		return getVeryfyusernameinhomepage();
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public AdactinLoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

}
