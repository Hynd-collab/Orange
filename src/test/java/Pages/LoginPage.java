package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {
	
	@FindBy (name="username")
	WebElement username;
	
	@FindBy (name= "password")
	WebElement password; 
	
	@FindBy (xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement loginBTN;
	
	@FindBy (xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement verif;

public LoginPage () {
	
	PageFactory.initElements(Config.driver, this);
	}

public void validLogin (String userName, String PassWord) {
	
	username.sendKeys(userName);
	password.sendKeys(PassWord);
	loginBTN.click();
	
}

public String verifyLogin () {
	
	String verf = verif.getText();
	return verf;
}
}
