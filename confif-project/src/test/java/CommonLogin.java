
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Pages.Locator1;
import Pages.Locator2;

public class CommonLogin extends MultiThread {
	public Locator1 commonLogin;
	public Locator2 commonLogin2;
	ConfigExcel config1 = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");

	public CommonLogin() {
		this.commonLogin = new Locator1();
		this.commonLogin2 = new Locator2();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(getDriver(), 20);
		PageFactory.initElements(factory, this.commonLogin);
		PageFactory.initElements(factory, this.commonLogin2);
	}

	public void commonLogin() {
		waitClickOn(getDriver(), this.commonLogin.username, 30);
		this.commonLogin.username.sendKeys(config1.getData(1, 12, 3));
		this.commonLogin.password.sendKeys(config1.getData(1, 13, 3));
		selectValue(this.commonLogin.dropdown, "1");
		waitClickOn(getDriver(), this.commonLogin.login, 20);
		this.commonLogin.login.click();
	}

	public void searchCustomer() {
		this.commonLogin2.searchCustomer.click();
		String parentWindow = getDriver().getWindowHandle();
		Set<String> allWindowHandles = getDriver().getWindowHandles();

		for (String handle : allWindowHandles) {
			getDriver().switchTo().window(handle);
		}
		waitVisibilityOfElement(getDriver(), this.commonLogin2.customerName, 60);
		this.commonLogin2.customerName.sendKeys("Pratik");

		waitClickOn(getDriver(), this.commonLogin2.searchCutomerName, 5);
		this.commonLogin2.searchCutomerName.click();
		waitVisibilityOfElement(getDriver(), this.commonLogin2.searchCustomerloader, 5);
		waitInvisibilityOfElement(getDriver(), this.commonLogin2.searchCustomerloader, 60);

		this.commonLogin2.wantedCustomer.click();
		getDriver().switchTo().window(parentWindow);
		waitVisibilityOfElement(getDriver(), this.commonLogin2.customerMobileNo, 60);
	}

	public void getProposal() throws IOException {
		waitVisibilityOfElement(getDriver(), this.commonLogin2.customerMobileNo, 60);
		this.commonLogin2.createProposal.click();

		waitVisibilityOfElement(getDriver(), this.commonLogin2.proposalId, 30);
		String origin = getDriver().getCurrentUrl();
		String proposalID = this.commonLogin2.proposalId.getText();
		String policyTypeH = this.commonLogin2.policyTypeT.getText();
		String vehicleType = this.commonLogin2.vehicleTypeT.getText();
		System.out.println(origin + " >> " + vehicleType + " >> " + policyTypeH + " >> " + proposalID);
		captureScreenshot();
	}

	public void loaderWait() {
	//	int visible =Integer.parseInt(config1.getData(1, 14, 3));
	//	int inVisible = Integer.parseInt(config1.getData(1, 15, 3));
		
		waitVisibilityOfElement(getDriver(), this.commonLogin2.loader, 3);
		waitInvisibilityOfElement(getDriver(), this.commonLogin2.loader, 60);
	}
}
