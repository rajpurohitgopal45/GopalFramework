package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locator3 {
	@FindBy (xpath="//div[@class='loader']")
	public WebElement loader;
	
	@FindBy (id="ctl00_headA_motorQuote_rdbPCV")
	public WebElement selectPcv;
	
	@FindBy (id="ctl00_headA_motorQuote_btnProceed")
	public WebElement openQuote;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_txtRto")
	public WebElement rtoCity;
	
	@FindBy (xpath="//*[@id='divwidth']/div[1]")
	public WebElement wantedRtoCity;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_txtFristRegDate_DateTextFrom")
	public WebElement dateField;
	
	@FindBy (xpath="//tr//td[contains(text(),'24')]")
	public WebElement selectDate;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ddToState")
	public WebElement state;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ddlMake")
	public WebElement manufacturer;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ddlSubType")
	public WebElement typeOfManufacturer;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ddlModel")
	public WebElement model;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ddVehicleUsage")
	public WebElement vehicleUsage;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ddAreaOfOperation")
	public WebElement operationArea;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ddVehicleDrivenBy")
	public WebElement drivenBy;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_btnCalculatePremium")
	public WebElement calculatePremium;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ImageButton1")
	public WebElement continueButton;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_txtRegistrationNo")
	public WebElement registrationNo;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_txtEngineNo")
	public WebElement engineNo;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_txtChassisNo")
	public WebElement chassisNo;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_txtSourcingCode")
	public WebElement sourcingCode;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ctrlCustomerAddress_searchCustomersButton")
	public WebElement searchCustomerButton;
	
	@FindBy (id="Name")
	public WebElement customerName;
	
	@FindBy (id="searchButton")
	public WebElement customerSearch;
	
	@FindBy (xpath="//a[contains(text(),'Pratik Tadke')]")
	public WebElement customerWanted;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ctrlCustomerAddress_txtMobile")
	public WebElement customerMobileNo;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_btnContinue")
	public WebElement continue2;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_btnBuy")
	public WebElement buy;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ccPayOptions_btnOffline")
	public WebElement offline;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_btnBankLockOk")
	public WebElement bankIdLocked;
	
	@FindBy (id="//*[contains(text(),'Logout >>')]")
	public WebElement logout;
}
