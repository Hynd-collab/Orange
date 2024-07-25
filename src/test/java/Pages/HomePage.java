package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	
	@FindBy (xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a" )
	List<WebElement>  menus ;
	
	@FindBy (xpath= "/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement  verif;
	
	public HomePage () {
		PageFactory.initElements(Config.driver, this);
	}
	
	
}
