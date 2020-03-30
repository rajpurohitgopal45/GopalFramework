package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locator2 {
	@FindBy (id="TxtRegistrationNumber")
	public WebElement registrationNo;
	
	@FindBy (id="TxtRtoCity")
	public WebElement rtoCity;
	
	@FindBy (xpath="//*[@id='divwidth']//child::div")
	public List<WebElement> rtoSuggetions;
	
	@FindBy (xpath="//div[@class='customloader']")
	public WebElement loader;
	
	@FindBy (xpath="//div[@class='loader']")
	public WebElement searchCustomerloader;
	
	@FindBy (xpath="//img[@id='datecontrol']")
	public WebElement dateIcon;
	
	@FindBy (xpath="//div[@class='datepicker-days']/table/tbody//td[@class='today day']")
	public WebElement currentDate;
	
	@FindBy (id="DdlManufacture")
	public WebElement manufaturer;
	
	@FindBy (id="DdlModel")
	public WebElement model;
	
	@FindBy (id="ddToState")
	public WebElement state;
	
	@FindBy (id="DdlCPATenure")
	public WebElement cpaTenure;
	
	@FindBy (id="BtnCalculatePremium")
	public WebElement calculatePremium;
	
	@FindBy (id="TxtEngineNumber")
	public WebElement engineNo;
	
	@FindBy (id="TxtChassisNumber")
	public WebElement chassisNo;
	
	@FindBy (id="txtSourcingCode")
	public WebElement sourceCode;
	
	@FindBy (id="ctrlCustomerAddress_btnSearchCustomers")
	public WebElement searchCustomer;
	
	@FindBy (id="Name")
	public WebElement customerName;
	
	@FindBy (id="searchButton")
	public WebElement searchCutomerName;
	
	@FindBy (xpath="//a[contains(text(),'Pratik Tadke')]")
	public WebElement wantedCustomer;
	
	@FindBy (name="ctrlCustomerAddress$TxtCustMobile")
	public WebElement customerMobileNo;
	
	@FindBy (id="btnCreateProposal")
	public WebElement createProposal;
	
	@FindBy (id="btnViewPremiumBreakup1")
	public WebElement viewBreakup;
	
	@FindBy (xpath="//input[@id='BtnBuyPolicy']")
	public WebElement buy;
	
	@FindBy (id="lblProposalId")
	public WebElement proposalId;
	
	@FindBy (id="LblTransFor")
	public WebElement policyTypeT;
	
	@FindBy (id="lblSubProductName")
	public WebElement vehicleTypeT;
}
