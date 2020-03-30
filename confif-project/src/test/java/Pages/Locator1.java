package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locator1 {
		@FindBy (id="txtLoginId")
		public WebElement username;
		
		@FindBy (id="login2_txtPassword")
		public WebElement password;
		
		@FindBy (xpath="//*[@id=\"login2_ddlLandingPage\"]")
		public WebElement dropdown;
		
		@FindBy (xpath="//input[@id='login2_btnLoginMain']")
		public WebElement login;
		
		@FindBy (id="ctl00_headA_motorQuote_rdb2Wheeler")
		public WebElement tW;
		
		@FindBy (id="ctl00_headA_motorQuote_btnProceed")
		public WebElement getQuote;
}
